


//def name="Nag"

def cl = { ->
    name=name.toUpperCase()
    println name
}


class Person {
    String name
}
def p = new Person(name:'Igor')

cl.delegate=p
cl()