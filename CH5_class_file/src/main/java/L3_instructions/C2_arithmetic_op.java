package L3_instructions;

import org.junit.Test;

public class C2_arithmetic_op {
    public static void Infinity_NaN(){
        /*
        int r1 = 100/0;
        System.out.println(r1); // 除以0异常
        */

        double r2 = 100/0.0;
        System.out.println(r2); // Infinity

        double r3 = 0.0/0.0;
        System.out.println(r3); // NaN
    }


    public void iinc(){

        int a = 5;
        a = a + 5;


        int b = 5;
        b += 5;

        byte c = 5;
        //c = c + 5;

        byte d = 5;
        d += 5;

    }


    public void mul(){
        int a = 5;
        int b = 8;
        int c = 20;

        int s = a + b*c;
    }

    @Test
    public void i_plus_plus(){
        int i = 10;

        i = i++;

        System.out.println(i);  //10
    }

    @Test
    public void i_plus_plus1(){
        int i = 10;

        i = i++ + i;

        System.out.println(i);  // 21
    }

    @Test
    public void i_plus_plus2(){
        int i = 10;

        i = i++ + ++i;

        System.out.println(i);  // 22
    }

    public static void main(String[] args) {
        Infinity_NaN();
    }
}
