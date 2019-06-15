import com.designpatterns.singleton.enums.ConfigurationManager;

public class LazySingletonMain {
    public static void main(String[] args) {
        ConfigurationManager instance = ConfigurationManager.INSTANCE;

        ConfigurationManager instance2 = ConfigurationManager.INSTANCE;

        if (instance == instance2) {
            System.out.println("Both instance is equals");
        }
    }
}
