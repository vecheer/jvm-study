package L4_class_load_details;


import java.util.Random;

class GrandParent{
    static int NUM = 111;
    static {System.out.println("GrandParent clinit exec");}
}

class Parent extends GrandParent {
    static {System.out.println("Parent clinit exec");}
}

class Sub extends Parent {
    static {System.out.println("Sub clinit exec");}
}


class NumHolder{
    public static final int NUM = new Random().nextInt();

    static {
        System.out.println("NumHolder clinit");
    }
}

public class C6_class_passive_using {
    public static void main(String[] args) {
        //System.out.println("Sub.NUM = " + Sub.NUM);

        //Sub[] ints = new Sub[100];

        int num = NumHolder.NUM;

    }
}
