package com.alibaba.excute;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class T1 extends Thread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            System.out.println("zs");
        }
        executor.shutdownNow();
    }
    public void run(){


    }
}
