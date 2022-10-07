package com.example.strings

def staticSingleLineString='abc'
def staticMultiLineString='''
a
b
c
'''

class Person{
    def name
}

def person=new Person(name:"Nag")
def dynamicSingleLineString="im ${person.name}"
def dynamicMultiLineString="""
1+2=${1+2}
3+4=${3+4}
"""


//def str='abcedfgha'
//println str.length()
//println str.charAt(0)
//println str.charAt(7)
//println str.indexOf('h')
//println str.indexOf('i')
//println str.indexOf('a')
//println str.lastIndexOf('a')
//println str.startsWith("abc")
//println str.endsWith("fgh")
//println str.contains("ced")

//def s1="abc"
//def s2="Abc"

//println s1==s2
//println s1.equals(s2)
//println s1.equalsIgnoreCase(s2)

//println s1.compareTo(s2)
//println s1<=>s2


//def s1="";
//println s1.empty


//def csvString="ip1,ip2,ip3"
//def ips=csvString.split(",")
//println ips.getAt(0)
//println ips[0]


//def filePath="/root/dir1/filename.txt";
//println filePath.substring(filePath.lastIndexOf('/')+1)


//def s="hello"
//println s.repeat(3)


//def s="hello ${1+1}"
//println s.getClass()