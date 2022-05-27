package L3_Heap;

import java.util.concurrent.TimeUnit;

// -Xms36M -Xmx36M -Xmn12M -XX:SurvivorRatio=10 -XX:NewRatio=2 -XX:+UseTLAB
// 堆 36M ====> Old-24 + Young-12
// Young 12M ====> Eden S0 S1   10M 1M 1M
public class C5_TLAB {
    public static void main(String[] args) throws InterruptedException {

        TimeUnit.SECONDS.sleep(30);

        Runnable runner = () -> {
            MemKiller memKiller = new MemKiller();
            memKiller.allowMem();
            try {
                TimeUnit.SECONDS.sleep(180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        System.gc();

        // Young 12M ====> Eden S0 S1   10M 1M 1M
        // 实际上当前两个 runner 跑完之后，会使用 8M 的空间
        // 此时正要跑第三个 runner，触发 YGC
        new Thread(runner).start();
        new Thread(runner).start();

        TimeUnit.SECONDS.sleep(8);

        new Thread(runner).start();


    }
}

class MemKiller {
    public void allowMem() {
        int[] intArray = new int[1024 * 1024]; // 4M
    }
}
