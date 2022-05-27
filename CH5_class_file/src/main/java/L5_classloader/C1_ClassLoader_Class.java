package L5_classloader;

import lombok.extern.log4j.Log4j;

import java.util.concurrent.TimeUnit;

@Log4j
class X{
    static {
        log.info("class X loading....");
    }
}

@Log4j
public class C1_ClassLoader_Class {
    public static void main(String[] args) throws InterruptedException {

        useX();

        log.info("现在开始fgc......");
        System.gc();
        TimeUnit.SECONDS.sleep(3);
        System.gc();
        TimeUnit.SECONDS.sleep(3);
        log.info("fgc完毕......");

        useX();
    }

    public static void useX(){
        X x = new X();
        x = null;
    }
}
