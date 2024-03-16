package com.comrade.threads.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class CompletableFutureClient {
    public static void main(String[] args) {
        normalFlow();
        parallelFlow();
        completableFutureFlow();
    }

    private static void completableFutureFlow() {
        Executor executor = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        var futureCategories = Stream.of(
                        new Transaction("1", "description 1"),
                        new Transaction("2", "description 2"),
                        new Transaction("3", "description 3"),
                        new Transaction("4", "description 4"),
                        new Transaction("5", "description 5"),
                        new Transaction("6", "description 6"),
                        new Transaction("7", "description 7"),
                        new Transaction("8", "description 8"),
                        new Transaction("9", "description 9"),
                        new Transaction("10", "description 10")
                )
                .map(transaction -> CompletableFuture.supplyAsync(() -> CategorizationService.categorizeTransaction(transaction), executor))
                .toList();

        var categories = futureCategories.stream()
                .map(CompletableFuture::join)
                .toList();
        long end = System.currentTimeMillis();

        System.out.printf("The operation took %s ms%n", end - start);
        System.out.println("Categories are: " + categories);
    }

    private static void parallelFlow() {
        long start = System.currentTimeMillis();
        var categories = Stream.of(
                                    new Transaction("1", "description 1"),
                                    new Transaction("2", "description 2"),
                                    new Transaction("3", "description 3"))
                                .parallel()
                                .map(CategorizationService::categorizeTransaction)
                                .toList();
        long end = System.currentTimeMillis();

        System.out.printf("The operation took %s ms%n", end - start);
        System.out.println("Categories are: " + categories);
    }

    private static void normalFlow() {
        long start = System.currentTimeMillis();
        var categories = Stream.of(
                                    new Transaction("1", "description 1"),
                                    new Transaction("2", "description 2"),
                                    new Transaction("3", "description 3"))
                                .map(CategorizationService::categorizeTransaction)
                                .toList();
        long end = System.currentTimeMillis();
        System.out.printf("The operation took %s ms%n", end - start);
        System.out.println("Categories are: " + categories);
    }
}

