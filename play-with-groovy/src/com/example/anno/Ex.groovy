package com.example.anno

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString  // Meta Programming
@EqualsAndHashCode
class Todo {

    int id
    String title
    boolean completed

}

class Ex {
    static void main(String[] args) {

        Todo t1 = new Todo(id: 123, title: "todo1", completed: false);
        Todo t2 = new Todo(id: 123, title: "todo1", completed: false);
        println t1 == t2

    }
}
