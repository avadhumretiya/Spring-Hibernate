package com.example.inversionofcontrol.autowiring;

import org.springframework.stereotype.Component;

@Component
public class AutowiringService implements TestInterfaceAutowiring {

    @Override
    public String testAutowiringMethod() {
        return "Test Autowiring Method";
    }
}
