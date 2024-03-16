package com.comrade.collection.queue.delay_queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedWorker implements Delayed {
    private long duration;
    private String message;
    public DelayedWorker(long duration, String message) {
        this.duration = System.currentTimeMillis() + duration;
        this.message = message;
    }
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(duration - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    @Override
    public int compareTo(Delayed otherDelayed) {
        if(duration <((DelayedWorker)otherDelayed).getDuration()){
            return -1;
        }
        if(duration >((DelayedWorker)otherDelayed).getDuration()){
            return 1;
        }
        return 0;
    }

    public long getDuration() {
        return duration;
    }

    public String getMessage() {
        return message;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return this.message;
    }
}
