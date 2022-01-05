package com.example.inversionofcontrol.spring.configbyjavacode;

import org.springframework.stereotype.Component;

@Component
public class ByJavaCodeService implements TestInterfaceByJavaCode {

    @Override
    public String testByJavaCode() {
        return "test by javacode";
    }
}
