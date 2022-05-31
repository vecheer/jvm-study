package L1_optimize_tools;

import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class MemKiller{
    byte[]  killer = new byte[4 * 1024 * 1024]; // 4MB
}

@Log4j
public class C3_MAT_test {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<MemKiller> killers = new ArrayList<>();


        for (;;){
            try{
                MemKiller memKiller = new MemKiller();
                killers.add(memKiller);
                TimeUnit.SECONDS.sleep(2);

            }catch (OutOfMemoryError oom){
                log.error("OOM了都, 我现在要把你的killers对象清空");
                killers.clear();
            }
        }

    }

}
