package L5_classloader;

public class C3_class_loader {
    public static void main(String[] args) {
        System.out.println(Thread.class.getClassLoader());
        System.out.println(int[].class.getClassLoader());
        System.out.println(C3_class_loader[].class.getClassLoader());
        System.out.println(Object[].class.getClassLoader());
        System.out.println(Object[].class);
        System.out.println(long[].class);


        new Thread(()->{
            System.out.println(Thread.currentThread().getContextClassLoader());
        }).start();
    }
}
