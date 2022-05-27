package com.wyq.L1_Class_Load_Result;

import com.wyq.L1_Class_Load_Result.domain.CommonResource;

public class Main {
    public static void main(String[] args) {
        // System.out.println(new UserSon().X);

        Runnable r = () -> {
            System.out.println("线程[" + Thread.currentThread().getName() + "]开始");
            CommonResource resource = new CommonResource();
            resource.doing();
            System.out.println("线程[" + Thread.currentThread().getName() + "]结束");
        };

        new Thread(r,"th-1").start();
        new Thread(r,"th-2").start();

    }

}
