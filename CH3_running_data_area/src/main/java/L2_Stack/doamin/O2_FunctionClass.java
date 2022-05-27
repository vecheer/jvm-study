package L2_Stack.doamin;

public class O2_FunctionClass {
    void fun1(){
        fun2();
    }
    void fun2(){
        fun3();
    }
    void fun3(){
        fun4();
    }
    void fun4(){
        int a = 1;
    }


    void A(){
        B();
    }

    void B(){}

    void main(String[] args) {
        fun1();
    }
}
