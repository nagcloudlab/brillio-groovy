package com.example.oo

class Employee {
    // state variables
    // 1. class/static variables
    final static def companyName = "brillio"
    static def tnrName;
    // 2. object/instance variables
    def id;
    def name;
    def address;

    Employee(id, name, address) {
        this.id = id;
        this.name = name;
        this.address = address
    }

    // behaviors
    // 1. class/static behaviors
    static def doTraining() {
        println("$tnrName - doTraining")
    }
    // 2. object/instance behaviors
    def doListenAndWork() {
        println("$name - doListenAndWork")
    }

}


class Class_Object_Ex {
    static void main(String[] args) {

//        def e1 = new Employee(id: 123,name: "Nag",address: "Chennai")

//        def e1 = new Employee(123, "Nag", "Chennai")
//        def e1 = [123, "Nag", "Chennai"] as Employee
//        Employee e1 = [123, "Nag", "Chennai"]

//        e1.doListenAndWork()

    }
}
