package L6_String;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class C6_contact_vs_add {
    public static void main(String[] args) throws ExecutionException, InterruptedException {




        // 直接相加
        FutureTask<Long> task_add = new FutureTask<>(() -> {
            String str = "";
            long start =  System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                str = str + "a";
            }
            long end = System.nanoTime();
            return (end - start);
        });
        Thread addThread = new Thread(task_add, "add-task-0");
        addThread.start();

        // 使用 StringBuilder
        FutureTask<Long> task_append = new FutureTask<>(() -> {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("");
            long start = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                sb.append("a");
            }
            long end = System.nanoTime();
            return (end - start);
        });
        Thread appendThread =  new Thread(task_append, "add-task-0");
        appendThread.start();



        System.out.println("直接相加，耗时: " + task_add.get());
        System.out.println("append相加，耗时: " + task_append.get());
    }
}
