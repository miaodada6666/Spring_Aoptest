package com.example.aoptest.impl;

import com.example.aoptest.impl.CriticismEngine;


public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl()
    {

    }
    @Override
    public String getCriticism()
    {
        return "切面注入实现评论：Good Job！！";
    }
}
