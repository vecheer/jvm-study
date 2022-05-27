package L1_algorithm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.ref.*;
import java.util.concurrent.TimeUnit;


// -Xms15m -Xmx15m
public class C5_Reference {

    @Data
    @NoArgsConstructor
    static class User {
        private Integer id;
        private String name;

        private int[] memKiller = new int[1024 * 1024]; //4M

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static ReferenceQueue<User> queue = new ReferenceQueue<>();

    public static void main(String[] args) throws InterruptedException {
        /* // 强引用
        User userA = new User(111,"yq");
        System.gc();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(userA==null);*/

        /*// 弱引用
        SoftReference<User> userBSF = new SoftReference<>(new User(666,"yq"));
        System.out.println(userBSF.get()==null);   // false ====> 此时弱引用还没回收
        // 大量吃内存
        int[] memKiller = new int[1024 * 1024 * 2];
        System.gc();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(userBSF.get()==null);  // true ====>  此时弱引用回收了*/

        /*WeakReference<User> userCWR = new WeakReference<>(new User(789, "yq"));
        System.gc();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(userCWR.get()==null);  // true 发现即回收*/

        // 虚引用

        // 直接跑一个子线程，追踪虚引用指向的对象是否被回收
        new Thread(() -> {
            try {
                Reference<? extends User> obj = queue.remove(); //remove()实际上是个阻塞方法
                if (obj != null)
                    System.out.println("[子线程]虚引用追踪的对象已经被GC!!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t-query-beforeGC").start();

        // 设置虚引用 指向 被追踪(引用)的对象
        User user = new User(9999, "yq");
        PhantomReference<User> pR = new PhantomReference<>(user, queue);

        System.out.println("[主线程]GC之前 ====> 无视发生");

        System.out.println("[主线程]开始GC!");
        user = null;
        System.gc();
        TimeUnit.SECONDS.sleep(1);

        System.out.println("[主线程]主线程结束!");

    }
}
