package L3_instructions;

import org.junit.Test;

public class C7_goto {
    public static void main(String[] args) {
        int a = 1000;
        int b = 1000;

        int i = 0;
        while(i<1000){
            System.out.println("hi");
            i++;
        }

        int j;
        for (j = 0; j < 1000; j++) {
            System.out.println("hi");
        }

    }
    
    
    public void forLoop(){
        int i;
        for (i = 0; i < 1000; i++) {
            System.out.println("hi");
        }
    }

    public void whileLoop(){
        int i = 0;
        while(i<1000){
            System.out.println("hi");
            i++;
        }
    }

    public void forLoopFOR1(){
        for (;;) {
            System.out.println("hi");
        }
    }

    public void whileLoopWHILETRUE(){
        while(true){
            System.out.println("hi");
        }
    }


    public void short_i_loop(){
        short i;
        for (i = 0; i < 1000; i++) {
            System.out.println("hi");
        }
    }

    public void shortIINC(){

        byte a = 16;
        a +=4;

        short b = 17;
        b +=4;

        int c = 19;
        c +=6;


        int i = 0;

        for (i = 0; i < 1000; i++) {

        }

    }

    @Test
    public void efficiency_int(){
        int i = 0;
        long start = System.nanoTime();
        for (i = 0; i < 1000; i++) {

        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    @Test
    public void efficiency_short(){
        short i = 0;
        long start = System.nanoTime();
        for (i = 0; i < 1000; i++) {

        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

}
