package com.glab30961.myServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneServices{

    private String[] data = { "Beware of the wolf in sheep's clothing", "Diligent is the mother of good luck", "The journey is the reward"};

    //Create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
