package L2_gc;

import java.util.concurrent.TimeUnit;

public class C2_gc_log {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            int[] memKiller = new int[1024 * 1024];  // 4M Byte
        }
        long end = System.currentTimeMillis();

        System.out.println("cost time: " + (end - start)/1000);

        //TimeUnit.SECONDS.sleep(120);
    }
}
