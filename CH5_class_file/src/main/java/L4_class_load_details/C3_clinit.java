package L4_class_load_details;

import lombok.extern.log4j.Log4j;
import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Log4j
class X{

    static {
        log.info("正在执行 clinit 方法");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

@Log4j
public class C3_clinit {

    static final long num = 12L;  // 准备阶段赋值
    static final String str = "abc";  // 准备阶段赋值
    static final Object obj = new Object();  // 初始化阶段赋值
    static final String uuid = UUID.randomUUID().toString();  // 初始化阶段赋值


    static {
        long a = 13L;
    }


    public void func1(){
        long x = num;
    }

    public void func2(){
        String str1 = "hello";
        String str2 = new String("HI");

    }

    public static void main(String[] args) throws ClassNotFoundException {
        new Thread(()->{
            log.info("jack thread running");
            X x = new X();
            log.info("jack thread down!!!!");
        },"jack").start();


        new Thread(()->{
            log.info("jack thread running");
            X x = new X();
            log.info("tommy thread down!!!!");
        },"tommy").start();





    }



}
