package com.example.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SingletonService {

    PrototypeService ps;
    PrototypeScopeProxyService psps;

    public SingletonService(PrototypeService ps, PrototypeScopeProxyService psps) {
        this.ps = ps;
        this.psps = psps;
        System.out.println("SingletonService instanced");
    }

    public void foo() {
        ps.foo();
        psps.foo();
    }

    public void hoge() {
        ps.foo();
        psps.foo();
    }

}
