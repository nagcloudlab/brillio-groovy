package com.example

class Person {
    String name
    int age
}

class Operators {

    static void main(String[] args) {

        // Object operators
        def person = new Person(name: "Nag", age: 39);
//        person = null
        def personName = person?.name
        println personName

    }
}
