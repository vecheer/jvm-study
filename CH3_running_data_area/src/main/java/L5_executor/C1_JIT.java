package L5_executor;


// 纯编译 -XX:+PrintGC -Xcomp  ================ 6.698秒
// 纯解释 -XX:+PrintGC -Xint   ================ 53.34秒
// 混合 -XX:+PrintGC -Xmixed ================ 7.364秒
public class C1_JIT {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        // 重复循环 1000_1000次 耗时操作
        killCpu(1000_1000);

        long endTime = System.currentTimeMillis();

        System.out.println( "一共耗时: " + ((float)(endTime - startTime))/1000 + "秒");
    }


    public static void killCpu(int times) throws InterruptedException {
        for (int i = 0; i < times; i++) {
            startTag:
            for (int m=2; m<100; ++m){
                for (int n=2; n<=Math.sqrt(m); ++n){
                    if (m% n== 0)
                        continue startTag;
                }
            }
        }
    }
}
