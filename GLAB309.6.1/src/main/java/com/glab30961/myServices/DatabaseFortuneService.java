package com.glab30961.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices{

    @Override
    public String getFortune() {
        return "Data Connection";
    }
}
