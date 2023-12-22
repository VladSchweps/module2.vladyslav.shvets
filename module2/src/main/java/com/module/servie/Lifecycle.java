package com.module.servie;

import config.ConfigLoader;

import java.io.ObjectInputFilter;
import java.util.concurrent.*;

public class Lifecycle {
    private static final String CONFIG_KEY = "general.lifecycle.";

    private final ExecutorService executor;
    private final LogService logService;


    public Lifecycle() {
        executor = Executors.newFixedThreadPool(2);
        logService = new LogService();
    }

    public void life() throws InterruptedException, ExecutionException {
        while(true) {
            final Future<?> submitAnimalCycle = executor.submit(() -> {
            });
            final Future<?> submitGrassCycle = executor.submit(() -> {
            });

            TimeUnit.MILLISECONDS.sleep(ConfigLoader.getIntegerPoperty(CONFIG_KEY + "wait-time"));
                submitAnimalCycle.get();
                submitGrassCycle.get();
            logService.logInfo();

        }
    }

}
