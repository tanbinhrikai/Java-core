package bai13;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws Exception {

        CompletableFuture<String> future =
                CompletableFuture
                        .supplyAsync(() -> fetchUser("SV001"))
                        .thenApply(user -> "Hello, " + user)
                        .exceptionally(ex ->
                                "Error: " + ex.getMessage());

        System.out.println("van lam viec k doi kq");

        String result = future.get();

        System.out.println("result: " + result);
        System.out.println("end ");

    }
    public static String fetchUser(String id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "le xuan cong";
    }
}
