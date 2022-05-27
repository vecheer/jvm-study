package L6_String;

public class C7_intern {
    public static void main(String[] args) {
        String str1 = "123456x";
        String str2 = new String("123456x");
        String str3 = str2.intern();
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);


        String s1 = new String("wdnm");
        s1.intern();
        String s2 = "wdnm";
        System.out.println(s1==s2); //false

        // intern后，放入到字符串常量池中的串，指向的实际上还是堆中的对象
        String s3 = new String("A") + "B";
        s3.intern();
        String s4 = "AB";
        System.out.println(s3==s4); //true

        String s5 = new String("A") + "B";
        String s6 = "AB";
        s3.intern();
        System.out.println(s5==s6); //true

        String x ="XXX!";
        String s7 = new String("XXX") + "!";
        String s8 = s7.intern();
        System.out.println(s8 == "XXX!");
        System.out.println(s7 == "XXX!");
    }
}
