package L1_optimize_tools;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


// -Xms20M -Xmx20M
@Log4j
public class C1_JDK_Tools {


    @SneakyThrows
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>(10);

        LOOP: while (true){
            try{
                list.add(new byte[2 * 1024 * 1024]);
                log.info("add 2M ");
                TimeUnit.SECONDS.sleep(2);
            }catch (OutOfMemoryError oom){
                list.clear();
                log.error("OOM了! 不过没关系，我帮你把内存清了");
                continue LOOP;
            }
        }
    }
}
