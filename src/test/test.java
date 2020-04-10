package test;

import Algorithms.AddTwoNumber;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class test {

    /*
    private volatile int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
     */

    public AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }

}
