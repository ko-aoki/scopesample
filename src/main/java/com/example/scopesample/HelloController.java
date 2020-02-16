package com.example.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    SingletonService ss;

    public HelloController(SingletonService ss) {
        this.ss = ss;
    }

    @GetMapping("/")
    public String hello() {

        ss.foo();
        // PrototypeScopeProxyServiceは使用のたびにインスタンス化される
        ss.hoge();
        return "hello";
    }

}
