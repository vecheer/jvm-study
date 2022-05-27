package L3_instructions;

import org.junit.Test;

public class C6_compare {


    @Test
    public void l_f_d_compare(){
        long a = 10L;
        long b = 7L;

        if (a > b)
            System.out.println(a  + " > " + b);
    }


    @Test
    public void compare_jump(){
        int a = 32;
        int r;

        if (a > 0)
            r = a+111;
        if (a < 0)
            r = a+222;
        if (a == 0)
            r = a+333;
    }


    @Test
    public void compare_jump_f_l(){
        long a = 32L;
        long b = 45L;
        int r;

        if (a > b)
            r = 888;
        if (a < b)
            r = 999;
        if (a == b)
            r = 101010;
        else
            r = 1111;
    }


    public void compare_jump_int(int a,int b){
        int r;

        if (a > b)
            r = 888;
        else
            r = 1111;
    }

    public void compare_a(Object a,Object b){
        int r;

        if (a == b)
            r = 888;
        if (a != b)
            r = 999;
    }

}
