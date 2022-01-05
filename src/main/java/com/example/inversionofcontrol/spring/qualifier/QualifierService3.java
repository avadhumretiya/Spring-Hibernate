package com.example.inversionofcontrol.spring.qualifier;

import org.springframework.stereotype.Component;

@Component
public class QualifierService3 implements TestInterfaceQualifier {

    @Override
    public String testQualifierMethod() {
        return "Test Qualifier3 Method";
    }
}
