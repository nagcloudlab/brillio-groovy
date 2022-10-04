package com.example

class Employee {
    // class variables
    static def tnrName;
    // instance variables
    def name
    def age

    // constructor
    Employee(){}

    // functions/methods
    def sayName(){
        println "im $name"
    }
    def sayAge(){
        println "im $age yrs old"
    }
}

/*
    in groovy, object creation is 2 step process

    step-1: allocate memory dynamically from heap memory  => 'new' keyword
    step-2: intialize that memory with obj's data         => constructor

 */

class ReferenceTypes {
    static void main(String[] args) {
        def e1=new Employee(); // Reference Types
        e1.name="tom"
        e1.age=20;
        e1.sayName()
        e1.sayAge()
    }
}
