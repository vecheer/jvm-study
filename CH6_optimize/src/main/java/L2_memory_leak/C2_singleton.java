package L2_memory_leak;

public class C2_singleton {

    // 饿汉式 单例
    static final Object singleton = new Object();

    // 私有构造器
    private C2_singleton(){

    }

    // 提供单例
    public static Object getInstance(){
        return singleton;
    }
}
