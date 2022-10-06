package com.example.bytes;

def scriptMethod() {
    println("scriptMethod()")
}

class Foo {
    static def staMethod() {
        println("staMethod()");
    }

    def instanceMethod() {
        println("m1()")
    }
}

//scriptMethod()
//Foo.staMethod()
//def foo = new Foo();
//foo.instanceMethod()


//------------------------------------------------------------------------------------------------
//
//def hello(user) {
//    println("Hello ${user}")
//}
//
//hello("Nag")
//hello "Nag"   // DSL
//println "bla bla"

//------------------------------------------------------------------------------------------------

//def concat(s1,s2){
//    println(s1+s2);
//}
//
//concat("hello","World")
//concat "hello","World"

//------------------------------------------------------------------------------------------------


def display(...args){
    for(def e in args){
        println(e);
    }
}

display("A","B","C","D","E","F","G","H","I","J","K")

//------------------------------------------------------------------------------------------------

// Syntax Overview
// Types
// Object Oriented concepts

//------------------------------------------------------------------------------------------------