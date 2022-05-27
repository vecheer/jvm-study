package L2_Stack.doamin;


public class O1_MathsUtils {

    public int result;

    // 加法
    public int plus(int a,int b){
        return a + b;
    }

    // 减法
    public int minus(int a,int b){
        // a - b =  a + (-b)
        int minsNum = -b;
        return plus(a,minsNum);
    }
}
