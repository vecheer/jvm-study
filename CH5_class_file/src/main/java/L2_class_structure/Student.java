package L2_class_structure;

public class Student {
    int id;
    String name;

    protected int printId(String name,int id){
        System.out.println("my name is " + name + " and id is " + id);
        return id;
    }


    void say(){
        int a = 2;
        int b = a * 2;
    }
}
