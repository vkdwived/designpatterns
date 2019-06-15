package com.designpatterns.singleton.lazy.doublechecklocking;

public class ConfigurationManager {
    private static ConfigurationManager INSTANCE = null;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (null == INSTANCE) {
            synchronized (ConfigurationManager.class) {
                if (null == INSTANCE) {
                    INSTANCE = new ConfigurationManager();
                }
            }
        }
        return INSTANCE;
    }
}
