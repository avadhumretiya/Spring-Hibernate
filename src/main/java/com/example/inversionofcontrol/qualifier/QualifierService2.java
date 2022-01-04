package com.example.inversionofcontrol.qualifier;

import org.springframework.stereotype.Component;

@Component
public class QualifierService2 implements TestInterfaceQualifier {

    @Override
    public String testQualifierMethod() {
        return "Test Qualifier2 Method";
    }
}
