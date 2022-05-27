package L2_Stack;

public class C8_virtual_method_invoke {
    public static void main(String[] args) {

    }
}

class Person{
    public void sayHi(){
        System.out.println("person hi");
    }

    public void info(){
        System.out.println("my name is person");
    }
}

class User extends Person{
    @Override
    public void sayHi() {
        System.out.println("User say hi");
    }

    @Override
    public void info() {
        System.out.println("my name is User");
    }
}