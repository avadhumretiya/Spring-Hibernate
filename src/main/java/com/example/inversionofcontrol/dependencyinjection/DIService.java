package com.example.inversionofcontrol.dependencyinjection;

public class DIService implements TestInterfaceDI{

    @Override
    public String testDIMethod() {
        return "Test DI Method";
    }
}
