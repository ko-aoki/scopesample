package com.example.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeScopeProxyService {
    public PrototypeScopeProxyService() {
        System.out.println("PrototypeScopeProxyService instanced");
    }

    public void foo() {
        System.out.println("PrototypeScopeProxyService foo");
    }
}
