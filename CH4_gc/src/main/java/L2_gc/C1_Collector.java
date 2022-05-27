package L2_gc;


import java.util.concurrent.TimeUnit;

// -XX:+UseSerialGC -XX:+PrintGC -XX:+PrintGCTimeStamps                             ===>    Serial + Serial Old                34秒
// -XX:+UseParallelGC -XX:+PrintGC -XX:+PrintGCTimeStamps                           ===>    Parallel Scavenge + Parallel Old   14秒
// -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGC -XX:+PrintGCTimeStamps     ===>    ParNew + CMS                       33秒
public class C1_Collector {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int[] memKiller = new int[1024 * 1024 * 256];  // 1G Byte
        }
        long end = System.currentTimeMillis();

        System.out.println("cost time: " + (end - start)/1000);

        TimeUnit.SECONDS.sleep(120);

    }
}
