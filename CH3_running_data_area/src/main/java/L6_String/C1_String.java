package L6_String;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;

public class C1_String {
    @Test
    public void direct() {
        String s1 = "我带你们打";
        String s2 = "我带你们打";
        System.out.println("String s1 = \"我带你们打\"");
        System.out.println("String s2 = \"我带你们打\"");
        System.out.println("地址判断: s1==s2 // " + (s1 == s2));
        System.out.println("内容判断: s1.equals(\"s2\") // " + s1.equals(s2));

        s1 = s1 + "dnm";
        System.out.println("地址判断: s1==s2 // " + (s1 == s2));
        System.out.println("内容判断: s1.equals(\"s2\") // " + s1.equals(s2));
    }

    @Test
    public void newString(){
        String s1 = new String("我带你们打");
        String s2 = new String("我带你们打");
        System.out.println("String s1 = new String(\"我带你们打\")");
        System.out.println("String s2 = new String(\"我带你们打\")");
        System.out.println("地址判断: s1==s2 // " + (s1 == s2));
        System.out.println("内容判断: s1.equals(\"s2\") // " + s1.equals(s2));
    }


    //-XX:StringTableSize=2000  ===== 16.40秒
    //-XX:StringTableSize=20000 ===== 16.40秒
    public static void main(String[] args) throws InterruptedException {
        long startTimer = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            String a = new String(" " + i);
            String b = new String(a + a + a + a + a + a+ a+ a + a + a);
            String c = new String(b + b + b + b + b + b+ b+ b + b + b);
            String d = new String(c + c + c + c + c + c+ c+ c + c + c);
            String e = new String(d + d + d + d + d + d+ d+ d + d + d);
            e.intern();
        }

        long endTimer = System.nanoTime();
        System.out.println("总耗时: " + (float)(endTimer - startTimer)/1000_000_000 + "秒");
    }
}
