package com.example.aoptest;

import com.example.aoptest.impl.CriticismEngine;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

public aspect CriticAspect {

    public CriticAspect(){}
    @Pointcut(
            "execution(* com.example.aoptest.impl.Performance.perform(int))")
    public void performance() {}//该方法本身只是个标识，供@pointcut依附
    @Before("performance()")
    public    void takeSeats()
    {
//        setCriticismEngine(criticismEngine);
////        System.out.println(criticismEngine.getCriticism());
        System.out.println("AAAAAAAAAAAspect");
    }

    @Autowired
    private CriticismEngine criticismEngine;
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
