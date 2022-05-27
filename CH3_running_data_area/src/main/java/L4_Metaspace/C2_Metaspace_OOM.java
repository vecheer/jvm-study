package L4_Metaspace;


import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.net.URL;
import java.net.URLClassLoader;

// -XX:MaxMetaspaceSize=10M
public class C2_Metaspace_OOM extends ClassLoader{
    public static void main(String[] args) {

        int finishedFlags = 0;
        C2_Metaspace_OOM thisObj = new C2_Metaspace_OOM();

        try {
            for (int i=0;i<1000*1000;i++){
                // 生成二进制字节码
                ClassWriter writer =  new ClassWriter(0);
                // 指定版本号 修饰符 类名 父类 接口
                writer.visit(
                        Opcodes.V1_8,
                        Opcodes.ACC_PUBLIC,
                        "MyClass"+i,
                        "com/wyq/myclass",
                        "java/lang/Object",
                        null
                );
                // 返回字节码二进制流
                byte[] classBytes = writer.toByteArray();
                thisObj.defineClass("MyClass"+i,classBytes,0,classBytes.length);
                finishedFlags++;
            }
        }finally {
            System.out.println(finishedFlags);
        }
    }
}

class MyClassLoader extends ClassLoader {

}
