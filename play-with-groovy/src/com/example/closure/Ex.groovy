package com.example.closure


//----------------------------------------------------------------
// closure
//----------------------------------------------------------------


def greet(Closure closure) {
    println "😀😀😀😀😀😀"
    closure.call("!")
    println "😀😀😀😀😀😀"
}


//----------------------------------------------------------------
// module-1
//----------------------------------------------------------------

//def hello={println("hello")}
//greet(hello);
//greet hello;


//greet {
//    println "Ola $it"
//}
//
//greet {
//    println "Vanakkam $it"
//}

// why we need closure,
// with that we can write DSL in groovy language  ( delarative coding )


//-------------------------------------------------------------------------


def numbers = [1, 5, 6, 3, 4, 3, 2, 9, 8, 7, 10]

//numbers.each {
//    println it
//}


//println numbers.split {
//    it%2==0?true:false
//}

//
//def result = numbers
//        .collect { it * it }
//        .sort {n1,n2->n1<=>n2}
//
//
//println result


//----------------------------------------------------------------

interface Consumer {
    void call(String s)
}

def m(Consumer c) {
    c.call("hello")
}

//class C implements Consumer {
//    void call(String s) {
//        println s
//    }
//}

//m {println it}

//----------------------------------------------------------------


//def nCopies = { int n, String str -> str*n }
//def thrice=nCopies.curry(3)
//def r= thrice "hi"
//println r
//
//def helloCopy=nCopies.rcurry("hello")
//r=helloCopy 5
//println r

//----------------------------------------------------------------
//
//def fib
//fib = { long n -> n<2?n:fib(n-1)+fib(n-2) }.memoize()
//
//def r=fib(15)
//println(r)
//
//r=fib(15)
//println(r)

//----------------------------------------------------------------

def consoleLogger={message->{
    println(message)
    message
}}
def fileLogger={message->println("file-$message")}

def consoleAndThenFileLogger= fileLogger << consoleLogger

def message="started"
//
//consoleLogger message
//fileLogger message

consoleAndThenFileLogger message


//----------------------------------------------------------------
