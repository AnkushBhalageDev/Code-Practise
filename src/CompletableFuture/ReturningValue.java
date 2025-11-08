package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ReturningValue {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future= CompletableFuture.supplyAsync(()->{
            System.out.println("Fetching data : "+Thread.currentThread().getName());
            try{
Thread.sleep(1500);

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Fetched successfully";
        });
        String result= future.get();
        System.out.println("Result: "+result);

    }
}
