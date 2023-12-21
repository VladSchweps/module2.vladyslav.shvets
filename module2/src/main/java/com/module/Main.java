package com.module;

import com.module.servie.Lifecycle;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        new Lifecycle().life();
    }
}
