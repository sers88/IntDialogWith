package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable<String>> callablesTask = new ArrayList<>();
        callablesTask.add(new MyCallable());
        callablesTask.add(new MyCallable());
        callablesTask.add(new MyCallable());
        callablesTask.add(new MyCallable());
        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        final String future = threadPool.invokeAny(callablesTask);
        System.out.println(future);
        threadPool.shutdown();
    }
}