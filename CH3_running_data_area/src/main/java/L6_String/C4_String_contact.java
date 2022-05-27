package L6_String;

public class C4_String_contact {
    public static void main(String[] args) {
        String s1 = "Hotspot";
        String s2 = "VM";

        String s3 = "Hotspot" + "VM";
        String s4 = s1 + "VM";
        String s5 = "Hotspot" + s2;

        System.out.println(s3 == s4); //false
        System.out.println(s3 == s5); //false
        System.out.println(s4 == s5); //false

        s3.intern();
        s4.intern();
        s5.intern();

        System.out.println(s3 == s4); //false
        System.out.println(s3 == s5); //false
        System.out.println(s4 == s5); //false



        String s6 = "wu";
        String s7 = "yu";
        String s8 = "qi";
        String sx = (s6+s7+s8).intern();
        String s9 = "wuyuqi";
        String s10 = "wu" + "yuqi";
        System.out.println(sx == s9);  //true
        System.out.println(sx == s10); //true


        final String sA = "A";
        final String sB = "B";
        String sC = "AB";
        String sD = sA + sB;
        System.out.println(sC == sD); //true

    }
}

/*

*/
