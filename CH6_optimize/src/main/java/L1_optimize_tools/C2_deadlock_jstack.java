package L1_optimize_tools;

import java.util.Objects;
import java.util.concurrent.TimeUnit;


class NumHolder{

    int num = 10;

    public void add(){

        System.out.println(Thread.currentThread().getName() + ": get into the method");
    }
}

public class C2_deadlock_jstack {

    public static void main(String[] args) {

        NumHolder holder1 = new NumHolder();
        NumHolder holder2 = new NumHolder();

        new Thread(()->{
            synchronized (holder1){
                try {
                    TimeUnit.SECONDS.sleep(3);
                    synchronized (holder2){
                        TimeUnit.SECONDS.sleep(1200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"yq-t1").start();

        new Thread(()->{
            synchronized (holder2){
                try {
                    TimeUnit.SECONDS.sleep(3);
                    synchronized (holder1){
                        TimeUnit.SECONDS.sleep(1200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"yq-t2").start();

    }
}
