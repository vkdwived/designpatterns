package com.designpatterns.singleton.eager;

public class ConfigurationManager {
    private static ConfigurationManager INSTANCE = new ConfigurationManager();

    /**
     * private constructor
      */
    private ConfigurationManager() {}

    /**
     * Single global point of access to instance.
     * @return ConfigurationManager
     */
    public static ConfigurationManager getInstance() {
        return INSTANCE;
    }
}
