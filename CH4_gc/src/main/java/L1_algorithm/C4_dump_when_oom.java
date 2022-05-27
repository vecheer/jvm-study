package L1_algorithm;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;


// -Xms100M -Xmx100M -XX:+HeapDumpOnOutOfMemoryError
public class C4_dump_when_oom {

    public static void main(String[] args) throws InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(() -> {
            ArrayList<Object> ints = new ArrayList<>();
            int i = 0;
            try {
                while (true) {
                    TimeUnit.SECONDS.sleep(1);
                    ints.add(new int[1024 * 1024]);
                    i++;
                }
            } finally {
                System.out.println("now mem use" + i * 4 + "M");
            }
        });

        new Thread(task,"yq-futureTask-1").start();

    }

    public void func(){
        int x;
        {
            int y;
        }
        int z;
    }
}
