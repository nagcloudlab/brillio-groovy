package com.example.oo;

/*
    - wheel
        - rotate()

    - car
        - move()
 */

//----------------------------------------------------------------
// Wheel Absraction
//----------------------------------------------------------------

interface Wheel {
    abstract rotate()  // abstract method
}


//----------------------------------------------------------------
// MRF Wheel team
//----------------------------------------------------------------

class MRFWheel implements Wheel {
    def rotate() {
        println("MRF wheel rotating")
    }
}

//----------------------------------------------------------------
// CEAT Wheel team
//----------------------------------------------------------------

class CEATWheel implements Wheel {
    def rotate() {
        println("CEAT wheel rotating")
    }
}

//----------------------------------------------------------------
// JK Wheel team
//----------------------------------------------------------------

class JKWheel implements Wheel {
    def rotate() {
        println("JK wheel rotating")
    }
}


//----------------------------------------------------------------
// Car team
//----------------------------------------------------------------
// Open for extension , Closed for modification  ( coding principle )

class Car {

    def wheel

    def setWheel(def wheel) {
        this.wheel = wheel
    }

    def move() {
        wheel.rotate()
        println("car moving")
    }
}


public class Interface_Implementation_Ex {
    public static void main(String[] args) {

        def mrfWheel = new MRFWheel()// dependency
        def car = new Car(wheel: mrfWheel) // dependent

        car.move()
        println("")
        car.move()

        def ceatWheel = new CEATWheel()
        car.setWheel(ceatWheel)
        println("")
        car.move()

        def jkWheel = new JKWheel()
        car.setWheel(jkWheel)
        println("")
        car.move()

    }
}
