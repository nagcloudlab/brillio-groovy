package com.example.oo

// core-team

// Generalized/Abstract/Super/Base/Parent class
abstract class LivingThing {
    def eat() { println("eat()") }

    final def sleep() { println("sleep()") }

    abstract def work();
}

// human-team
class Human extends LivingThing {
    def study() { println("study()") }

    def work() {
        study()
        println("Human:work()")
    }
}

// animal-team
class Animal extends LivingThing {
    def work() {
        println("Animal:work()")
    }
}

//robot-team
class Robot extends LivingThing {
    def eat() { println("Robot:eat()") }

    def work() { println("Robot:work()") }
}


// god-team
class God {
    def manageLivingThing(LivingThing thing) {
        thing.eat();
        thing.sleep();
        thing.work();
    }
}

class Inheritance {
    static void main(String[] args) {

        def god = new God()

        def human = new Human()
        def animal = new Animal()
        def robot = new Robot()

        god.manageLivingThing(human)
        println("")
        god.manageLivingThing(animal)
        println("")
        god.manageLivingThing(robot)

    }
}
