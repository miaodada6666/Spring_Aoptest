package com.example.aoptest.impl;
public class PerformanceImp implements Performance {
   @Override
    public void perform(int ha)
   {
       System.out.println("连接点函数：被通知监控的函数");
       System.out.println(ha);
   }
}
