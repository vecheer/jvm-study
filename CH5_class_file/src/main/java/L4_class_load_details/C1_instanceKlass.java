package L4_class_load_details;



class Student {
    static {
        System.out.println("Student.class is loading by jvm now");
    }
}

public class C1_instanceKlass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Student instance =  Student.class.newInstance();

        Class<? extends Student> cls1 = new Student().getClass();
        Class<? extends Student> cls2 = Student.class;
        Class<?> cls3 = Class.forName("L4_class_load_details.C1_instanceKlass");

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
    }
}
