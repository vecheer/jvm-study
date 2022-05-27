package L2_Stack;

public class C4_operation_num_stack {


    public static void main(String[] args) {
        /*int a = 100;
        int b = 15;
        int k = a + b;*/

        int x = 5;
        x = x++;
        System.out.println("x = " + x);

    }

    public void selfIncrease(){
        // 问题 1
        // X=Y++ 还是 X=++Y
        int a = 7;
        int A = a++;

        int b = 100;
        int B =++b;

        // 问题 2
        // X=X++ 还是 X=++X
        int m = 8;
        m = m++;

        int n = 101;
        n = ++n;

        // 问题 3
        // X=Y++ + ++Y
        // X=++Y + Y++
        int p = 9;
        int p1 = p++ + ++p;
        int p2 = ++p + p++;

    }


}
