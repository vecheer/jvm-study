package L2_Stack;


interface Func{
    void doFunc();
}

class FuncUser{
    public void useFunc(Func func){
        func.doFunc();
    }
}

public class C7_invoke_method {
    public static void main(String[] args) {
        FuncUser funcUser = new FuncUser();
        //funcUser.useFunc(() -> System.out.println("hello"));
    }
}


class A{


    static void showStatic(){
        System.out.println("A static func");
    }

    private void showPrivate(){
        System.out.println("A private func");
    }

    public final void showFinal(){
        System.out.println("A final method");
    }

    A(){
        System.out.println("building A");
    }

    public void show(){
        showStatic();
        showPrivate();
        showFinal();
    }
}

class subA extends A{
    subA() {
        System.out.println("building subA");
    }
    static void showStatic(){
        System.out.println("sub static func");
    }

    private void showPrivate(){
        System.out.println("sub private func");
    }

    void showSubFunc(){
        System.out.println("sub private func");
    }

    public void show(){
        showStatic();
        super.showStatic();
        showPrivate();
        showSubFunc();
        showFinal();
        super.showFinal();
    }
}

