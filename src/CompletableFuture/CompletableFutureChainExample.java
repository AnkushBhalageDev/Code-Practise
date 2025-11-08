package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChainExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            System.out.println("Step 1 : Getting User");
            return "Ankush";
        }).thenApply(user->{
            System.out.println("Step 2 : Getting data for User: "+user);
            return user+" Data Loaded";
        }).thenAccept((result)->{
            System.out.println("Step 3 : "+result);
        });
        try{
Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
