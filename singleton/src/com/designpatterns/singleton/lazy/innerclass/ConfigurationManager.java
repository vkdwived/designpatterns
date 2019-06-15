package com.designpatterns.singleton.lazy.innerclass;

/**
 * Java Virtual Machine loads static data-members only on-demand. So, here the class ConfigurationManager loads at
 * first by the JVM. Since there is no static data member in the class; InnerClazz does not loads or creates
 * SINGLE_INSTANCE. This will happen only when we invoke getIntance method. JLS guaranteed the sequential execution of the class
 * initialization; that means thread-safe. So, we actually do not need to provide explicit synchronization on static
 * getInstance() method for loading and initialization. Here, since the initialization creates the static variable
 * INSTANCE in a sequential way, all concurrent invocations of the getInstance() will return the same correctly
 * initialized INSTANCE without synchronization overhead.
 */
public class ConfigurationManager {

    private ConfigurationManager() {}

    private static class InnerClazz {
        static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }
    public static ConfigurationManager getInstance() {
        return InnerClazz.INSTANCE;
    }
}
