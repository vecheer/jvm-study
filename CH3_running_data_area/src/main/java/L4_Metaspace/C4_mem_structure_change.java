package L4_Metaspace;


// jdk 1.7 开始
// StringTable、static变量开始从 方法区 转移到 堆

import java.util.concurrent.TimeUnit;

// -Xms60M -Xmx60M -XX:+PrintGCTimeStamps -XX:+PrintGC
public class C4_mem_structure_change {

    static byte[] memKiller = new byte[1024 * 1024 * 100]; // 100MB


    public static void main(String[] args) throws InterruptedException {
        System.out.println("已顺利完成类加载的linking(准备)阶段...");
       // TimeUnit.SECONDS.sleep(120);
    }
}
