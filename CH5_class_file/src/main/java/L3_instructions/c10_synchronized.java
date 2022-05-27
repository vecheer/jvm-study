package L3_instructions;

import java.util.concurrent.TimeUnit;

public class c10_synchronized {

    public static int num = 0;


    public synchronized void func1() {
        num++;
    }


    public void func2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": get into the method");

        synchronized (c10_synchronized.class) {
            System.out.println(Thread.currentThread().getName() + ": get the MONITOR");
            TimeUnit.SECONDS.sleep(3);
            System.out.println(Thread.currentThread().getName() + ": release MONITOR");
        }
    }

    public static void main(String[] args) {

        new Thread(()->{
            try {
                new c10_synchronized().func2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"jack").start();

        new Thread(()->{
            try {
                new c10_synchronized().func2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"tommy").start();
    }


    public void func3(){
        int i = 0;
        synchronized (c10_synchronized.class){
            i++;
        }
    }


}
