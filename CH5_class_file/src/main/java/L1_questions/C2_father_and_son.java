package L1_questions;

class Father{
    int x = 555;

    public Father() {
        this.print();
        this.x = 666;
    }

    public void print(){
        System.out.println("in father: x=" + this.x);
    }
}


class Son extends Father{
    int x = 777;

    public Son() {
        this.print();
        x = 888;
    }

    public void print(){
        System.out.println("in Son: x=" + this.x);
    }
}

public class C2_father_and_son {

    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }

}
