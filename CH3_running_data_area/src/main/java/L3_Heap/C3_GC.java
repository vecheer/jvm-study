package L3_Heap;


import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@Log4j
public class C3_GC {

    // -Xms50M -Xmx50M -XX:+PrintGCDetails -Xmn4M
    public static void main(String[] args) throws InterruptedException {
        LinkedList<ArrayContainer> containers =  new LinkedList<>();
        int loops = 0;
        for (int i = 0; i < 30; i++) {
            String info = "loops = " + loops++;
            //log.info(info);
           // System.out.println(info);
            containers.add(new ArrayContainer());
            TimeUnit.SECONDS.sleep(4);
        }

        TimeUnit.SECONDS.sleep(120);
    }

}

class ArrayContainer{
    // int 为 4 字节
    // 这里一个 ArrayHolder 占 4M
    int[] intArray = new int[1024 * 1024 * 2];
}