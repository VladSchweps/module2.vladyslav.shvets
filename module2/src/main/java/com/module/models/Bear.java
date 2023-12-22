package com.module.models;

import config.ConfigLoader;

public class Bear extends Predator {
    private static final String GONFIG_KEY = "animal.herbivores.bear";

    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void chooseDirection() {

    }

    @Override
    public void move() {

    }

    @Override
    public int getWeight() {
        return ConfigLoader.getIntegerPoperty(WEIGHT_CONFIG_KEY);
    }

    @Override
    public int getMaxCount() {
        return ConfigLoader.getIntegerPoperty(MAX_COUNT_CONFIG_KEY);
    }

    @Override
    protected String getConfigKey() {
        return GONFIG_KEY;
    }
}
