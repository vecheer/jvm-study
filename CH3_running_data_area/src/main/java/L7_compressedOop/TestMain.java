package L7_compressedOop;

import org.openjdk.jol.info.ClassLayout;


// -XX:-UseCompressedOops  -XX:-UseCompressedClassPointers
public class TestMain {
    public static void main(String[] args) {
        System.out.println("[-XX:-UseCompressedOops]关闭了指针压缩");

        Object o =  new Object();
        System.out.println(o);
        System.out.println(ClassLayout.parseInstance(o).toPrintable());


        //System.out.println("[-XX:+UseCompressedClassPointers]开启了Class对象压缩");
    }
}
