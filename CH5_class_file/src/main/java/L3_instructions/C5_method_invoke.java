package L3_instructions;


import org.junit.Test;

interface Human {

    static void sayHi(){
        System.out.println("Human say hi");
    }

    default void  work(){
        System.out.println("Human working");
    }

}

class Driver implements Human {
    void  work(int days){
        System.out.println("Driver working for " + days + "days");
    }
}

public class C5_method_invoke {





    public static void main(String[] args) {
        Human driver = new Driver();
        driver.work();
        Human.sayHi();
    }




    public void getSum(){

        int sum = add(1,2);

    }

    public int add(int x,int y){
        return x+y;
    }

    int num = 7;

    @Test
    public int dup_x1(){
        return num++;
    }





}
