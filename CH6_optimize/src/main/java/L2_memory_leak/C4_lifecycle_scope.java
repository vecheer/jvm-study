package L2_memory_leak;

public class C4_lifecycle_scope {


    public static void main(String[] args) {
        Calculate cal = new Calculate();
        cal.add();
    }


}


class Calculate{

    Integer a = 88;
    Integer b = 6;

    public Integer add(){
        return a + b;
    }

    public Integer minus(){
        Integer a = 88;
        Integer b = 6;
        return a - b;
    }

}