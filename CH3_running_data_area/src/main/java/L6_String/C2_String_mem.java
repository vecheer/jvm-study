package L6_String;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// -Xms10M -Xmx10M -XX:+PrintGC
public class C2_String_mem {
    public static void main(String[] args) throws InterruptedException {
        Set<String> strSet = new HashSet<>();
        long i = 0;
        try{
            while(true){
                i++;
                String str = "WYQ" + System.nanoTime() + System.currentTimeMillis() + "1111111111111111111111111111111111"
                        + "asdDASDASDADSADQWEQDSADADASDASDADADSADADAD";
                //strSet.add(str.intern());
                TimeUnit.MILLISECONDS.sleep(10);
            }
        }finally {
            System.out.println("共执行了: " + i + "次");
        }
    }
}
