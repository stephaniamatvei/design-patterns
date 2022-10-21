package com.designpatterns.creationalpatterns.singleton;

public class App {
    public static void main(String[] args) {
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessageStart();
        singletonLogger.logMessageStop();
    }
}

