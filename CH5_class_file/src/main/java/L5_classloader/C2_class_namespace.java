package L5_classloader;


import lombok.extern.log4j.Log4j;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


class MyCL extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classFilePath = "D:\\我的编程\\StudyProject\\JVM\\CH5_class_file\\out\\production\\classes\\L5_classloader\\";
        // try-witch-resource
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(classFilePath + name + ".class"));
                ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            int len;
            byte[] data = new byte[1024];
            while ((len = bis.read(data)) != -1) {
                baos.write(data, 0, len);
            }
            //获取内存中的完整的字节数组的数据
            byte[] classByteArray = baos.toByteArray();
            //将字节数组转换为Class的实例
            return defineClass(null, classByteArray, 0, classByteArray.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}

@Log4j
class Person{
    static {
        log.info("Person clinit!");
    }
}

public class C2_class_namespace {
    public static String path = "Person";

    public static void main(String[] args) throws Exception {

        MyCL loader1 = new MyCL();
        Class<?> klass1 = loader1.findClass(path);

        MyCL loader2 = new MyCL();
        Class<?> klass2 = loader2.findClass(path);

        System.out.println(klass1 == klass2);
        System.out.println(klass1.getClassLoader());
        System.out.println(klass2.getClassLoader());

    }


}
