package com.example.inversionofcontrol.spring.dependencyinjection;

public class DIService implements TestInterfaceDI{

    @Override
    public String testDIMethod() {
        return "Test DI Method";
    }
}
