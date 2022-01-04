package com.example.inversionofcontrol.configbyjavacode;

import com.example.inversionofcontrol.autowiring.TestInterfaceAutowiring;
import org.springframework.stereotype.Component;

@Component
public class ByJavaCodeService implements TestInterfaceByJavaCode {

    @Override
    public String testByJavaCode() {
        return "test by javacode";
    }
}
