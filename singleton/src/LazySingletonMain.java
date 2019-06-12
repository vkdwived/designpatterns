import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LazySingletonMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1_000);

        System.out.println("Submitting the tasks for execution...");
        for (int i=0;i<1_000;i++) {
            executorService.submit(new Task());
        }
        executorService.shutdown();
    }
}
