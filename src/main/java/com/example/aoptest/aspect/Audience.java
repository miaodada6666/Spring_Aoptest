package com.example.aoptest.aspect;
import com.example.aoptest.impl.CriticismEngine;
import com.example.aoptest.impl.CriticismEngineImpl;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@Aspect

public class Audience {
    @Autowired
    private CriticismEngineImpl criticismEngine;
    @Pointcut(
            "execution(* com.example.aoptest.impl.Performance.perform(int))"+"&& args(ha)")//将perform函数视为切点
    public void performance(int ha) {}//该方法本身只是个标识，供Advice依附，对performance函数的通知相当于对切点perform函数的通知。
    @Before("performance(ha)")
   public    void silenceCellPhones(int ha)
    {
        ha++;
        System.out.println(ha);
        System.out.println("前置通知：Sillencing cell phones");

    }
    @Before("performance(ha)")
    public   void takeSeats(int ha)
    {
        ha--;
        System.out.println(ha);
        System.out.println("前置通知：Taking Seats");
    }
    @AfterReturning("performance(ha)")
    public  void applause(int ha)
    {
        ha--;
        System.out.println(ha);
        //System.out.println(criticismEngine.getCriticism());
        System.out.println("后置通知：clap clap clap");
    }
    @AfterThrowing("performance(h)")
    public  void demandRefund(int h)
    {
        h--;
        System.out.println(h);
        System.out.println("异常通知：demandRefund demandRefund");
    }



}
