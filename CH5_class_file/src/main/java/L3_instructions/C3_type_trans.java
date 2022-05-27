package L3_instructions;

import org.junit.Test;

public class C3_type_trans {
    public static void main(String[] args) {
        int i = 10;
        long l = i;
        float f = i;
        double d = i;
    }

    @Test
    public void lostPrecision(){
        long l = 12345678910L;

        float f = l;
        double d = l;

        System.out.println(f);
        System.out.println(d);
    }

    @Test
    public void trans(){
        long l = 12345678910L;

        byte b = (byte)(0.0/0.0);
        System.out.println(b);


        short b2 = (short)(1/0.0);
        System.out.println(b2);

    }
}
