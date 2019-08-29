package com.example.aoptest.impl;

import com.example.aoptest.impl.CriticismEngine;


public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl()
    {

    }
    @Override
    public String getCriticism()
    {
        return "what the fuck";
    }
}
