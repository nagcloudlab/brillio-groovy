package com.example.collections

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString


int a=12;

//----------------------------------------------------------------
// List
//----------------------------------------------------------------
//List<Integer> list=new ArrayList<>()
// or
def list=[]
list.add(12);
list.add(13);
list.add(14);
list.add(15);

//----------------------------------------------------------------
//Set
//----------------------------------------------------------------
def set=new TreeSet();
set.add(14);
set.add(14);
set.add(12);
set.add(12);
set.add(13);
//----------------------------------------------------------------

//def map=new LinkedHashMap()
// or
def map=[:]
println map.getClass().getName()
map.put("1","Java")
map.put("2","Javascript")
map.put("3","groovy")

//----------------------------------------------------------------

@EqualsAndHashCode
class Owner{
    def name
}

@EqualsAndHashCode
@ToString
class Car{
    def model
    def make
}


def owner1=new Owner(name:"Riya")
def owner2=new Owner(name:"Diya")

def car1=new Car(model:"model1",make:"make1")
def car2=new Car(model:"model2",make:"make2")

def carMap=new HashMap();
carMap.put(owner1,car1)
carMap.put(owner2,car2)


def car=carMap.get(owner1);
println car;

//----------------------------------------------------------------


def myNumbers=[1,2,3,4,5,6,7,8,9,10,11,12,13]
def myMaps=[1:"Value1",2:"Value2",3:"Value3",4:"Value4",5:"Value5"]

//----------------------------------------------------------------
