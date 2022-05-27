package com.wyq.L2_ClassLoader;

import org.junit.Test;

public class C1_ClassLoaders {
    public static void main(String[] args) {


    }


    // 获取 系统类加载器
    @Test
    public void getSystemClassLoader(){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // sun.misc.Launcher$AppClassLoader@14dad5dc
    }

    // 获取 扩展类加载器
    @Test
    public void getExtClassLoader(){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);  // sun.misc.Launcher$ExtClassLoader@5caf905d
    }

    // 获取 根类加载器(引导类加载器)
    @Test
    public void getBootstrapClassLoader(){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = systemClassLoader.getParent();
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);  // null 因为是C语言写的
    }

    // 获取 用户自定义类 的类加载器
    @Test
    public void userClassLoader(){
        ClassLoader thisClassLoader = this.getClass().getClassLoader();
        System.out.println(thisClassLoader);  // sun.misc.Launcher$AppClassLoader@14dad5dc
    }

    // java核心 类库 所用的类加载器
    @Test
    public void javaLibClassLoader(){
        ClassLoader intClassLoader = int.class.getClassLoader();
        System.out.println(intClassLoader);  // null

        ClassLoader StringClassLoader = String.class.getClassLoader();
        System.out.println(StringClassLoader);  // null
    }
}
