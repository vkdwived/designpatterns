public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
        LazySingleton instance = LazySingleton.getInstance();
        int counter = instance.getInstanceCounter();
        if (counter  >= 2) {
            System.out.println("failed");
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(counter);
    }
}
