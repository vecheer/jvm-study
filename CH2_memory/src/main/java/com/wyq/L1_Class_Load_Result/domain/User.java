package com.wyq.L1_Class_Load_Result.domain;



public class User {
    public static int A = 2;

    static {
        A = 20;
        B = 50;
        System.out.println("User static代码块被执行!");
    }
    public static int B = 5;

}

