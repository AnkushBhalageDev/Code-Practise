package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CombiningTwoFutures {
    public static void main(String[] args) {
        CompletableFuture<String> future1=CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> future2=CompletableFuture.supplyAsync(()->"World");

        CompletableFuture<String> combined= future1.thenCombine(future2,(a,b)->a+" "+b);
        System.out.println(combined.join());
    }
}
