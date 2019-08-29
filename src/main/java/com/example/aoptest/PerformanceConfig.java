package com.example.aoptest;
import com.example.aoptest.aspect.Audience;
import com.example.aoptest.aspect.EncoreableIntroducer;
import com.example.aoptest.impl.CriticismEngineImpl;
import com.example.aoptest.impl.PerformanceImp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy

//在javaconfig中启用AspecJ注解的自动代理
//这个代理会围绕这个所有该切面Audience的切点.perform函数所匹配的bean
public class PerformanceConfig {


    @Bean
    public Audience audience()
    {
        return new Audience();
    }
    @Bean
    public PerformanceImp performanceImp(){
        return new PerformanceImp();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer()
    {
        return new EncoreableIntroducer();
    }
    @Bean
    public CriticismEngineImpl criticismEngineImpl()
    {
        return new CriticismEngineImpl();
    }




}