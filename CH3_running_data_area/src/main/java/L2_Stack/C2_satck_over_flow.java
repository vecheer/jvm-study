package L2_Stack;


// -Xss108K
public class C2_satck_over_flow {

    static int num = 1;

    public static void main(String[] args) {
        int[] memKeiller = new int[512];
        System.out.println("现在递归深度是[" + (num++) + "]");
        main(args);
    }
}
