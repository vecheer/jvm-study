package com.wyq;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int i = 3 * 15;
        // exec jps in terminal
        // you can see the process -- Main
        try {
            TimeUnit.SECONDS.sleep(10);
            System.out.println("OVER");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
