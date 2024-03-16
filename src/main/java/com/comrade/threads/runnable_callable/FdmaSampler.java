package com.comrade.threads.runnable_callable;

import java.util.Locale;
import java.util.concurrent.Callable;

public class FdmaSampler implements Callable<String> {
    private final String message;
    public FdmaSampler(String message) {
        this.message = message;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return message.toLowerCase(Locale.ROOT);
    }
}
