package com.designpatterns.singleton.lazy;

public class ConfigurationManager {
    private static ConfigurationManager INSTANCE = null;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new ConfigurationManager();
        }
        return INSTANCE;
    }
}
