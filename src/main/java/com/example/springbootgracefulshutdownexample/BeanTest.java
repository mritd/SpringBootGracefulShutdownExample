package com.example.springbootgracefulshutdownexample;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class BeanTest {
    @PreDestroy
    public void destroy() {
        System.out.println("==================================");
        System.out.println("接收到终止信号, 正在执行优雅关闭...");
        System.out.println("==================================");
    }
}
