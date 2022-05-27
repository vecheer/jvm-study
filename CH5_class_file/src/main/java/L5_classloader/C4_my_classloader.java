package L5_classloader;

import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;



class MyClassLoader extends ClassLoader {
    // 字节码文件地址
    private String classFilePath;

    // 构造器 1    可以传入: 字节码文件地址
    public MyClassLoader(String classFilePath){
        this.classFilePath = classFilePath;
    }

    // 构造器 2    可以传入: 字节码文件地址 + parent
    public MyClassLoader(String classFilePath,ClassLoader parent){
        super(parent);
        this.classFilePath = classFilePath;
    }

    // 读取字节码文件，将其存到内存的数组中，将该数组读取并生成 Class 对象，完成类加载
    @Override
    protected Class<?> findClass(String className) {
        Class<?> klass = null;

        // 全限定名: x.x.XXX  -->  x/x/XXX.class
        String fullyQualifiedName = className.replace('.', '/').concat(".class");
        // 1.生成字节码文件路径: rootPath + x/x/XXX.class  -->  rootPath/x/x/XXX.class
        String filePath = classFilePath + fullyQualifiedName;
        try(
            // 2.获取文件输入流，来自字节码文件
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
            // 3.生成文件输出流，到一个字节数组
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ){
            // 4.将文件流输出到数组
            int len;
            byte[] data = new byte[1024]; //一次读 1KB
            while((len = bis.read(data))!=-1){
                baos.write(data, 0,len);
            }
            byte[] byteCodes = baos.toByteArray();

            // 5.读取数组中的字节码，实现加载
            klass = defineClass(null,byteCodes, 0,byteCodes.length);
        }catch (Exception e){
            e.printStackTrace();
        }
        return klass;
    }
}


public class C4_my_classloader {
    @SneakyThrows
    public static void main(String[] args) {
        //String path = "D:\\我的编程\\StudyProject\\JVM\\CH5_class_file\\out\\production\\classes\\";


        String path = "d:/";

        MyClassLoader cl = new MyClassLoader(path);
        Class<?> aClass = cl.loadClass("TestClass");
        aClass.newInstance();
        System.out.println(aClass.getClassLoader());

        MyClassLoader cl2 = new MyClassLoader(path);
        Class<?> aClass2 = cl2.loadClass("TestClass");
        aClass2.newInstance();
        System.out.println(aClass2.getClassLoader());
    }
}
