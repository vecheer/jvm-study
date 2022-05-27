package L4_class_load_details;

import org.junit.Test;

import java.io.*;

class Y implements Serializable {

    public static int NUM = 555;
    public static final int NUM_CONSTANT = 888;

    public static void sayHello(){
        System.out.println("hello!");
    }

    static {
        System.out.println("Y#<clinit> executing");
    }
}

public class C5_class_active_using {

    static {
        System.out.println("C5_class_active_using clinit exec");
    }

    @Test
    public void newInstance() throws IOException, ClassNotFoundException {
        Y y = new Y();

        // 序列化成 二进制流, 并 写入文件
        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("./y.txt"));
        objOut.writeObject(y);

    }

    @Test
    public void deserialize() throws IOException, ClassNotFoundException {
        // 读出内容, 并反序列化
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("./y.txt"));
        Y y = (Y)objIn.readObject();
        System.out.println(y);
    }


    @Test
    public void invokeStatic(){
        Y.sayHello();
    }

    @Test
    public void getStatic(){
        System.out.println(Y.NUM);
    }

    @Test
    public void getStatic_final(){
        System.out.println(Y.NUM_CONSTANT);
    }

    @Test
    public void reflect_mehod(){
        System.out.println(Y.NUM_CONSTANT);
    }

    static class Parent{
        static {
            System.out.println("parent clinit");
        }
    }
    static class Sub extends Parent{
        public static int NUM = 12;

        static {
            System.out.println("sub clinit");
        }
    }

    @Test
    public void testParent(){

    }

    public static void main(String[] args) {
        System.out.println(Sub.NUM);
    }

}
