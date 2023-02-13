package org.example;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(2500);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
            throw new RuntimeException(err);
        }
        return "Выполнен первым " + Thread.currentThread().getName();
    }
}
