package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class SimpleExample {
    public static void main(String[] args) {
        CompletableFuture<Void> future=CompletableFuture.runAsync(()->{
            System.out.println("Running Task in: "+Thread.currentThread().getName());
            try {
Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task Completed");
        });
        System.out.println("Main thread ");
        future.join();
        System.out.println("All task finished");
    }
}
