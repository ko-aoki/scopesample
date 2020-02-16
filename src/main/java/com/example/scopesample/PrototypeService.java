package com.example.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeService {
    public PrototypeService() {
        System.out.println("PrototypeService instanced");
    }

    public void foo() {
        System.out.println("PrototypeService foo");
    }
}
