package com.designpatterns.singleton.enums;

public class ConfigurationManagerMain {
    public static void main(String[] args) {
        ConfigurationManager instance = ConfigurationManager.INSTANCE;

        ConfigurationManager instance2 = ConfigurationManager.INSTANCE;

        if (instance == instance2) {
            System.out.println("Both instance is equals");
        }
    }
}
