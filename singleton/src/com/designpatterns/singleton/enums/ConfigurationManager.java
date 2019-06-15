package com.designpatterns.singleton.enums;

public enum ConfigurationManager {
    INSTANCE;

    ConfigurationManager() {
        System.out.println("Initialized once.");
    }
}
