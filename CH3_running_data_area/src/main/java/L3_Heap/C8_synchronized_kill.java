package L3_Heap;


import java.util.concurrent.TimeUnit;

public class C8_synchronized_kill {


    public static void main(String[] args) {
        Runnable runner = () -> {
            try {
                shouldBeSynchronized();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runner).start();
        new Thread(runner).start();
        new Thread(runner).start();
    }

    public static void shouldBeSynchronized()
            throws InterruptedException {

        Object o = new Object();
        synchronized (o){
            System.out.println("now maybe it is a sync operation");
            TimeUnit.SECONDS.sleep(100);
        }

        // =======>
        /*System.out.println("now maybe it is a sync operation");
        TimeUnit.SECONDS.sleep(100);*/
    }
}

