package com.example.access.p1

import groovy.transform.PackageScope

/**
 *
 * author : Dev-1
 *
 */
public class A {

    // class member(s)

    // variables
    private int pri=1
    @PackageScope  // Annotation
    int pkg=2;
    protected int pro=3
    int pub=4;

    // constructors

    // methods
    public void aInstanceMethod(){
        println pri
        println pkg
        println pro
        println pub
    }

}
