public class LazySingleton {
    private static LazySingleton INSTANCE = null;

    private int counter = 0;

    private LazySingleton() {
        ++counter;
    }

    public static LazySingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public int getInstanceCounter() {
        return counter;
    }
}
