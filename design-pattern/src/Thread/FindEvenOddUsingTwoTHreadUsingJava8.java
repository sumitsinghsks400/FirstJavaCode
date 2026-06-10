package Thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class FindEvenOddUsingTwoTHreadUsingJava8 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        IntStream.rangeClosed(1, 10).forEach(num -> {

            CompletableFuture<Void> oddFuture = CompletableFuture
                    .runAsync(() -> {
                        if (num % 2 != 0) {
                            System.out.println("Thread Name :- " +
                                    Thread.currentThread().getName() + " -> " + num);
                        }
                    }, executorService);

            CompletableFuture<Void> evenFuture = CompletableFuture
                    .runAsync(() -> {
                        if (num % 2 == 0) {
                            System.out.println("Thread Name :- " +
                                    Thread.currentThread().getName() + " -> " + num);
                        }
                    }, executorService);

            CompletableFuture.allOf(oddFuture, evenFuture).join();
        });

        executorService.shutdown();
//        IntStream.rangeClosed(1,10).forEach(num->{
//            CompletableFuture<Integer> oddcompletableFuture= CompletableFuture.completedFuture(num)
//                    .thenApplyAsync(x->{
//                        if (x%2 !=0) {
//                            System.out.println("Thread Name :-" + Thread.currentThread().getName() + x);
//                        }
//                        return num;
//                    },executorService);
//            oddcompletableFuture.join();
//
//            CompletableFuture<Integer> evencompletableFuture= CompletableFuture.completedFuture(num)
//                    .thenApplyAsync(x->{
//                        if (x%2==0) {
//                            System.out.println("Thread Name :-" + Thread.currentThread().getName() + x);
//                        }
//
//                        return num;
//                    },executorService);
//            evencompletableFuture.join();
//        });

        executorService.shutdown();
    }
}
