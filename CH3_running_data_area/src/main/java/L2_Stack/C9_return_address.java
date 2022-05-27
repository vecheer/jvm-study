package L2_Stack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class C9_return_address {

    void func() throws Exception{}

    public void main() {
        try{
            func();
        }catch(IOException ioe){
            f1();
        }catch(NullPointerException npe){
            f2();
        }catch(Exception e){
            f3();
        }
    }


    public void forNeverOver(Integer n){
        ArrayList<Integer> integers = new ArrayList<>();
    }



    static {
        System.out.println("hello");
    }
    public char f1(){
        return '男';
    }
    public Object f2(){
        return new Object();
    }
    public void f3(){

    }
}





