package com.example.aoptest.impl;

import com.example.aoptest.impl.Encoreable;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
              System.out.println("通过@DeclareParents注解所在的切面增添了新的功能：performEncore（）函数");
    }
}
