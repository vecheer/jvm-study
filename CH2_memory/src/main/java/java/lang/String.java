package java.lang;

import org.junit.Test;

public class String {

    static {
        System.out.println("正在执行" +
                "自定义的java.java.lang.String的<clinit>");
    }

    public static void main(String[] args) {
        System.out.println("hi");

    }
}


