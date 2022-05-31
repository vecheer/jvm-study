package L2_memory_leak;

public class C3_innerClass_always_be_used {
}


// 外部类
class Outer{
    // 内部类
    class Inner{

    }
}

// 其他类 引用 内部类
class A{
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
}