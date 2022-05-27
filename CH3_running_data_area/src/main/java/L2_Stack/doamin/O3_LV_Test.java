package L2_Stack.doamin;

public class O3_LV_Test {

    public int fun(int num,float numF){
        int num_plus = num * 10;
        int numF_plus = (int)numF * 10;
        return num_plus + numF_plus;
    }

    public int func(int a, long b){
        int c = a;
        int d = (int)b;
        int e = c - d;
        return e;
    }

    public Object funct2(){
        O1_MathsUtils a = new O1_MathsUtils();
        O1_MathsUtils b = new O1_MathsUtils();
        b.result = a.result * 2;
        return b;
    }


}
