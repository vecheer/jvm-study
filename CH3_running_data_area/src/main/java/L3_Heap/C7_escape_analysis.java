package L3_Heap;

import java.util.concurrent.TimeUnit;

// 4 字节
class User{
    int id = 1234567;
}

// -Xms40M -Xmx40M -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
public class C7_escape_analysis {
    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);


        for (int i = 0; i < 1000 * 1000 * 1000; i++) {
            escapeUser();

            if (i == 1000)
                TimeUnit.SECONDS.sleep(5);
            else if (i == 1000*1000)
                TimeUnit.SECONDS.sleep(5);
            else if (i == 1000*1000*888)
                TimeUnit.SECONDS.sleep(5);
        }


        TimeUnit.SECONDS.sleep(120);
    }

    public static void escapeUser(){
        User user = new User();
    }
}
