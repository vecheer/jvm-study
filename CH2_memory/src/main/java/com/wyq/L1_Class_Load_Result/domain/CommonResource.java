package com.wyq.L1_Class_Load_Result.domain;

public class CommonResource {
    static {
        long limit = 5*1000L;
        long startTime = System.currentTimeMillis();
        System.out.println("正在初始化公共资源，由[" +
                Thread.currentThread().getName() +
                "]触发!");
        // 证明:
        // 1.static代码块在类加载时执行，只会执行一次
        // 2.多线程同时加载一个类时，这里会被JVM自动加锁
        if (true){
            while (true){
                long nowTime = System.currentTimeMillis();
                if (nowTime - startTime > limit)
                    break;
            }
        }
    }

    public void doing() {
        System.out.println("正在执行某些操作! 由" +
                Thread.currentThread().getName() +
                        "]触发!");
    }
}
