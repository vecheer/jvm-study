package com.wyq.L1_Class_Load_Result.domain;

public class NotStaticField {
    {
        int xa;
        System.out.println("now execing code block");
    }

    public NotStaticField() {
        int a = 3;
    }
}
