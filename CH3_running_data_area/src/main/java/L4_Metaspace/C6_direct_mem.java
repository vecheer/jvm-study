package L4_Metaspace;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class C6_direct_mem {

    static int size = 1024 * 1024 * 20;

    public static void main(String[] args) throws InterruptedException {
        /*TimeUnit.SECONDS.sleep(10);

        // 申请 1GB 内存
        ByteBuffer buffer = ByteBuffer.allocateDirect(size);
        TimeUnit.SECONDS.sleep(20);

        // 释放内存 手动 GC
        buffer = null;
        System.gc();

        TimeUnit.SECONDS.sleep(120);*/

        ArrayList<ByteBuffer> buffers = new ArrayList<>();

        int times = 0;

        try {
            while (true) {
                ByteBuffer buffer = ByteBuffer.allocateDirect(size);
                buffers.add(buffer);
                times++;
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (Exception ignored) {

                }
            }
        } finally {
            System.out.println("一共使用内存: " + times * 20 + "MB");
            buffers = null;
            System.gc();
        }
    }
}



