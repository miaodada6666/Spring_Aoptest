package com.example.aoptest;
import com.example.aoptest.impl.Encoreable;
import com.example.aoptest.impl.Performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class AoptestApplication {
    public static void main(String[] args) {
        ApplicationContext ac1 = SpringApplication.run(AoptestApplication.class, args);
        for(String mjx: ac1.getBeanDefinitionNames())
            System.out.println(mjx);
        //CriticAspect.aspectOf();
        Performance a=ac1.getBean(Performance.class);
        a.perform(100);
        Encoreable e=(Encoreable) a;
        e.performEncore();//通过切面添加的新方法
    }
}
