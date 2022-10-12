package com.example.closure

def numbers=[1,2,3,4,5,6,7,8,9,10]



/*

    1. imperative style of programming

    solving any problem step-by-step
    problem:
    intention + implementation mixed together

    2. declarative style of programming   with closure ==> Functional Programming

    can separate our intentions from implementations

*/

//
//// Nag
//def filter(input,Closure closure){
//    def out=[];
//    for(int i=0;i<input.size();i++){
//        if(closure(input[i])){
//            out.add(input[i])
//        }
//    }
//    out
//}

// Tom
//def evens=filter numbers, {it%2==0}
//println evens
//
//// jerry
//def odds=filter numbers, {it%2!=0}
//println odds


def odds=numbers.findAll {it%2!=0}
println odds

