package L3_Heap;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

// -Xms50M -Xmx50M
public class C2_Heap_OOM {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<ArrayHolder> arrayHolders = new LinkedList<>();
        int loops = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("loops = " + loops++);
            arrayHolders.add(new ArrayHolder());
            TimeUnit.SECONDS.sleep(4);
        }

        TimeUnit.SECONDS.sleep(120);
    }

}

class ArrayHolder{
    // int 为 4 字节
    // 这里一个 ArrayHolder 占 4M
    int[] intArray = new int[1024 * 1024];
}