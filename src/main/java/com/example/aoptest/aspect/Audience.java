package com.example.aoptest.aspect;

import com.example.aoptest.impl.CriticismEngine;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Aspect

public class Audience {
    @Autowired
    private CriticismEngine criticismEngine;

    @Pointcut(
            "execution(* com.example.aoptest.impl.Performance.perform(int))"+"&& args(ha)")
    public void performance(int ha) {}//该方法本身只是个标识，供@pointcut依附

    @Before("performance(ha)")
   public     void silenceCellPhones(int ha)
    {

        ha++;
        System.out.println(ha);
        System.out.println("Sillencing cell phones");

    }
    @Before("performance(ha)")
    public    void takeSeats(int ha)
    {
        ha--;
        System.out.println(ha);
        System.out.println("Taking Seats");
    }
    @AfterReturning("performance(ha)")
    public  void applause(int ha)
    {
        ha--;
        System.out.println(ha);
//       System.out.println(criticismEngine.getCriticism());
        //System.out.println("clap clap clap");
    }
    @AfterThrowing("performance(h)")
    public  void demandRefund(int h)

    {
        h--;
        System.out.println(h);
        System.out.println("demandRefund demandRefund");
    }



}
