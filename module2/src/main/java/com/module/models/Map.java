package com.module.models;

import config.ConfigLoader;

public class Map {
    private static final String GONFIG_KEY = "general.map.";
    private final int[][] size;

    private static Map instance;
    private Map() {
        final int width = ConfigLoader.getIntegerPoperty(GONFIG_KEY + "width");
        final int height =ConfigLoader.getIntegerPoperty(GONFIG_KEY + "height");
        size = new int[height][width];
    }

    public static Map getInstance() {
        if(instance == null) {
            instance = new Map();
        }
        return instance;
    }

}
