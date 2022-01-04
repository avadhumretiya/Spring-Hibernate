package com.example.inversionofcontrol.qualifier;

import org.springframework.stereotype.Component;

@Component
public class QualifierService1 implements TestInterfaceQualifier {

    @Override
    public String testQualifierMethod() {
        return "Test Qualifier1 Method";
    }
}
