package com.wyq.L2_ClassLoader;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.sql.DriverManager;
import java.util.Arrays;

public class C2_Urls {

    // 展示 启动类加载器 加载的 类路径
    @Test
    public void showBootStrapCLUrls(){
        /*URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        Arrays.stream(urls).forEach(
                System.out::println
        );*/
    }

    // 展示 扩展类加载器 加载的 类路径
    @Test
    public void showExtCLUrls(){
        /*String path_String =  System.getProperty("java.ext.dirs");
        String[] paths = path_String.split(";");

        Arrays.stream(paths).forEach(
                System.out::println
        );*/
    }

    // 获取类加载器
    @Test
    public void getClassLoader() throws ClassNotFoundException {
        ClassLoader cl_1 = this.getClass().getClassLoader();
        ClassLoader cl_2 = Thread.currentThread().getContextClassLoader();
        ClassLoader cl_3 = ClassLoader.getSystemClassLoader();

        System.out.println(cl_1);
        System.out.println(cl_2);
        System.out.println(cl_3);
    }

    @Test
    public void myTest(){
        Method[] methods = int.class.getMethods();
        Arrays.stream(methods).forEach(
                method -> {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    try {
                        System.out.println(method.invoke(1, (Object) parameterTypes));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    public static void main(String[] args) {
        Method[] methods = Class.class.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Class<?>[] parameterTypes = methods[i].getParameterTypes();
            try {
                System.out.println(methods[i].invoke(1, (Object) parameterTypes));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        /*Arrays.stream(methods).forEach(
                method -> {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    try {
                        System.out.println(method.invoke(1, (Object) parameterTypes));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
        );*/
    }
}
