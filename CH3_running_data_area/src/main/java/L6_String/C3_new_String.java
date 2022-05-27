package L6_String;

public class C3_new_String {
    public static void main(String[] args) {
        /*long startTime1 = System.nanoTime();
        String a = new String("wyq wyq wyq wyq 1111" + "111");
        long endTime1 = System.nanoTime();
        System.out.println("字符串第一次被创建的耗时: " + (endTime1-startTime1));

        long startTime2 = System.nanoTime();
        String b = new String("wyq wyq wyq wyq 1111" + "1" + "11");
        long endTime2 = System.nanoTime();
        System.out.println("创建重复字符串耗时: " + (endTime2-startTime2));*/


       String str1 = "wyq1";
       String str2 = "wyq2";
       String str3 = "wyq1";
       String str4 =  new Object().toString();
       int i = 1234567890;
       String str5 = str3 + i;


       String x = new String("AX");

    }
}
