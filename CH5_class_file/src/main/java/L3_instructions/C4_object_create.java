package L3_instructions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person{
    private int age;
    public String name;
}

public class C4_object_create {



    @Test
    public void class_create(){
        Person person = new Person();
        new Person();

        int[] arr1 = new int[10];

        int[][] arr2 = new int[10][];

        int[][] arr3 = new int[10][7];

        Person[] arr4 = new Person[10];

    }


    static class InnerClass{
        static int staticNum = 10;
        int normalNum = 10;

        static {
            int a = 1;
        }
    }

    @Test
    public void staticField(String[] args) {

        InnerClass cls = new InnerClass();

        int a = cls.staticNum;
        int b = cls.normalNum;

        cls.staticNum = 1;
        cls.normalNum = 5;

    }

    @Test
    public void test() {

        InnerClass cls = new InnerClass();
        int a = cls.staticNum;



        int b = InnerClass.staticNum;


    }


    @Test
    public void arrayOp(){
        byte[] bytes = new byte[15];
        char[] chars = new char[15];
        int[] nums = new int[15];

        nums[3] = 1234;

        int s = nums[5];

        int x = chars.length;
    }


    @Test
    public void type_trans(){
        Object o = new Object();
        Person p = new Person();
        Person pp;
        if (p instanceof Object){
            System.out.println("1");
        }else{
            pp = (Person)o;
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clz = loader.loadClass("L3_instructions.C4_object_create$InnerClass");
        InnerClass cls = new InnerClass();*/

        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> clz = loader.loadClass("L3_instructions.C4_object_create$InnerClass");

        clz.newInstance();


    }
}
