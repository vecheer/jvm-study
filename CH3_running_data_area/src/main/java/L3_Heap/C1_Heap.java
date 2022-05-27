package L3_Heap;

import java.util.concurrent.TimeUnit;

public class C1_Heap {
    public static void main(String[] args) throws InterruptedException {
        long initMemUse = Runtime.getRuntime().totalMemory();
        System.out.println(initMemUse/1024/1024+"M");

        long maxMemUse = Runtime.getRuntime().maxMemory();
        System.out.println(maxMemUse/1024/1024+"M");

        TimeUnit.SECONDS.sleep(120);

        /*int[]  ints = new int[]{56,8,13};
        Object o = new Object();*/
    }
}


// -Xms10m -Xmx10m
// 初始 10 m
// 最大 10 m
class JVM1{
    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(120);
    }
}

// -Xms30m -Xmx30m
// 初始 30 m
// 最大 30 m
class JVM2{
    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(120);
    }
}