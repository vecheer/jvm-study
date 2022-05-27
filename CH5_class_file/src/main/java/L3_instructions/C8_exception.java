package L3_instructions;

import org.junit.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

class MyE extends Exception{

}

public class C8_exception {


    public void func1(){
        throw new RuntimeException("hi");
    }

    public void func2(){
        func1();
    }


    public void func3() throws MyE{
        int a = 5;
        if (a>3)
            throw new MyE();
        else
            a =8;
    }


    public int func4(){
        int result = 0;

        try{
            func3();
        }catch (MyE e){
            result = 999;
        }

        return result;
    }


    class MyResource implements AutoCloseable{

        public void info(){
            System.out.println("i am resource");
        }

        @Override
        public void close() throws Exception {
            System.out.println(this + " is closing!");
        }
    }

    public void func5(){
        try(MyResource r = new MyResource()){
            r.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public void fun6(){
        try{
            throw new MyE();
        }catch (MyE e){
            e.printStackTrace();
        }
    }

    public void func7(){
        try{
            func3();
        }catch (MyE e){
            e.printStackTrace();
        }finally {
            System.out.println("hello");
        }

    }




    public int func8(){
        try{
            return 4;
        }finally {
            return 5;
        }
    }

    public int func9(){
        int a = 4;
        try{
            return a;  // return结果是 4
        }finally {
            a = 5;
        }
    }

    public int func10(){
        int a = 5;
        a = 6;
        return a;
    }


    @Test
    public void finally_return(){
        System.out.println(func8());
        System.out.println(func9());
    }


    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            throw new RuntimeException();
        }).start();

        TimeUnit.SECONDS.sleep(3);
        System.out.println("main thread is still running");


    }
}
