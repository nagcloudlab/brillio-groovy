package com.example.dsl


import java.util.concurrent.ConcurrentHashMap;

import static groovy.lang.Closure.*;

class JenkinsDsl {
    static void pipeline(final Closure closure) {
        PipelineDsl pipelineDsl = new PipelineDsl()
        closure.delegate = pipelineDsl
        closure.resolveStrategy = DELEGATE_ONLY
        closure.call(null);
    }
}
enum AgentType {
    ANY
}
class PipelineDsl {
    final AgentType any = AgentType.ANY
    static final ConcurrentHashMap env = [:] as ConcurrentHashMap

    void agent(AgentType agentType) {
    }

    void environment(final Closure closure) {
        env.with(closure)
    }

    void stages(Closure closure) {
        final StagesDsl stageDsl = new StagesDsl()
        closure.delegate = stageDsl
        closure.resolveStrategy = DELEGATE_ONLY
        closure.call()

        stageDsl.stages.each { stage ->
            stage.run()
        }
    }

}

class StagesDsl {
    protected final List<Stage> stages = []

    void stage(final String name, final Closure closure) {
        stages << new Stage(name, closure)
    }
}


class Stage {
    final String name;
    final Closure closure;

    Stage(String name, Closure closure) {
        this.name = name;
        this.closure = closure;
    }

    void run() {
        println "==> Running '${name}' stage"
        final StageDsl stageDsl = new StageDsl();
        closure.delegate = stageDsl;
        closure.resolveStrategy = DELEGATE_ONLY;
        closure.call()
    }

}

class StageDsl {
    void steps(Closure closure) {
        final Steps steps = new Steps()
        closure.delegate = steps;
        closure.resolveStrategy = DELEGATE_ONLY;
        closure.call()
    }
}

class Steps {
    void sh(final String script) {
        final Process process = script.execute()
        process.waitFor();
        if (process.exitValue() == 0) {
            println process.text
        } else {
            println process.err.text
        }
    }

    void echo(final String message) {
        println "[ECHO] $message"
    }
}