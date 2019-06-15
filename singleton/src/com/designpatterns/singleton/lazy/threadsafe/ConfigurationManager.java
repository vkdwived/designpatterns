package com.designpatterns.singleton.lazy.threadsafe;

public class ConfigurationManager {
    private static ConfigurationManager INSTANCE = null;

    private ConfigurationManager() {

    }

    public static synchronized ConfigurationManager getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new ConfigurationManager();
        }
        return INSTANCE;
    }
}
