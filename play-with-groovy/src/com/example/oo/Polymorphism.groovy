package com.example.oo;

interface InfrastructureWork{
    void prepareInfrastructure();
}
class InPremiseInfrastructureWork implements InfrastructureWork{
    @Override
    void prepareInfrastructure() {
        println("preparing infrastructure in-premises")
    }
}
class CloudInfrastructureWork implements InfrastructureWork{
    @Override
    void prepareInfrastructure() {
        println("preparing infrastructure in public cloud")
    }
}

class DevopsEmployee {
    def doWork(InfrastructureWork infrastructureWork) {
        infrastructureWork.prepareInfrastructure();
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        def employee = new DevopsEmployee();
        def inPremiseInfrastructure = new InPremiseInfrastructureWork()
        def cloudInfrastructure = new CloudInfrastructureWork();
        employee.doWork(cloudInfrastructure)

    }
}
