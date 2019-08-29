package com.example.aoptest.aspect;

import com.example.aoptest.impl.DefaultEncoreable;
import com.example.aoptest.impl.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect

public class EncoreableIntroducer {
@DeclareParents(value = "com.example.aoptest.impl.Performance*",defaultImpl = DefaultEncoreable.class)//performance的子类需要引入该接口
    public static Encoreable encoreable;//表示所要引入的接口
}
