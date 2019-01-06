package com.demo.impl;

import com.demo.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Qualifier("randomFortuneService")
public class RandomFortuneService implements FortuneService {

    private String[] data = {"Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck", "The journey is the reward"};


    @Override
    public String getFortune() {
        return data[new Random().nextInt(data.length)];
    }
}
