package com.demo.impl;


import com.demo.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
