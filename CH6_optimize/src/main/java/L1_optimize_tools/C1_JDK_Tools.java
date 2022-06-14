package L1_optimize_tools;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


// -Xms20M -Xmx20M -XX:+PrintFlagsFinal -XX:+PrintTenuringDistribution -XX:+PrintCommandLineFlags  -XX:+PrintGCDetails
// -XX:+PrintHeapAtGC -Xloggc:./logs/gc-%t.log
@Log4j
public class C1_JDK_Tools {


    @SneakyThrows
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>(10);

        StopWatch sw = new StopWatch();


        LOOP: while (true){
            try{
                sw.start();
                list.add(new byte[1 * 1024 * 1024]);
                sw.stop();
                log.info("add 2M, cost time: " + sw.getLastTaskTimeMillis() + " ms");
                TimeUnit.SECONDS.sleep(1);
            }catch (OutOfMemoryError oom){
                list.clear();
                if (sw.isRunning())
                    sw.stop();
                log.error("OOM了! 不过没关系，我帮你把内存清了");
                continue LOOP;
            }
        }
    }
}
