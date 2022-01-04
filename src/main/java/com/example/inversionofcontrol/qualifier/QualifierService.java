package com.example.inversionofcontrol.qualifier;

import org.springframework.stereotype.Component;

@Component
public class QualifierService implements TestInterfaceQualifier {

    @Override
    public String testQualifierMethod() {
        return "Test Qualifier Method";
    }
}
