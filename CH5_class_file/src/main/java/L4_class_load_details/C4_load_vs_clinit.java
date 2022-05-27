package L4_class_load_details;

import lombok.extern.log4j.Log4j;

import java.util.concurrent.TimeUnit;

@Log4j
class A{
    public static final int A_NUM = 888;
}

@Log4j
class B{
    public static final int B_NUM = 888;
}

public class C4_load_vs_clinit {
    static String A = "L4_class_load_details.A";
    static String B = "L4_class_load_details.B";

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        // load class A   ====>  <clinit> executed
        Class.forName(A);
        // load class B   ====>  <clinit> not executed!
        ClassLoader.getSystemClassLoader().loadClass(B);

        TimeUnit.SECONDS.sleep(20);
    }
}
