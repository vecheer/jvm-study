package L3_instructions;

public class C1_LV_stack_op {

    public static Object obj = new Object();

    // iload
    // 0 getstatic #2 <java/lang/System.out : Ljava/io/PrintStream;>
    // 3 iload_0
    // 4 invokevirtual #3 <java/io/PrintStream.println : (I)V>
    // 7 getstatic #2 <java/lang/System.out : Ljava/io/PrintStream;>
    //10 lload_1
    //11 invokevirtual #4 <java/io/PrintStream.println : (J)V>
    //14 getstatic #2 <java/lang/System.out : Ljava/io/PrintStream;>
    //17 iload_3
    //18 invokevirtual #3 <java/io/PrintStream.println : (I)V>
    //21 return
    public static void pushLV(int a,long b,int c){
        System.out.println(a);
        System.out.println(b);
        // 注意此时, iload时, LV表的索引值
        System.out.println(c);
    }


    // iconst bipush sipush ldc
    // 0 iconst_5
    // 1 istore_0
    // 2 bipush 6
    // 4 istore_1
    // 5 bipush 100
    // 7 istore_2
    // 8 sipush 128
    //11 istore_3
    //12 sipush 32760
    //15 istore 4
    //17 ldc #5 <100000>
    //19 istore 5
    //21 aconst_null
    //22 astore 6
    //24 getstatic #6 <L3_instructions/C1_LV_stack_op.obj : Ljava/lang/Object;>
    //27 astore 6
    //29 return
    public static void pushConstant(){
        int a = 5;
        int b = 6;
        int c = 100;
        int d = 128;
        int e = 32760;
        int f = 100000;
        Object o = null;
        o = obj;
    }

    // istore
    // 0 iconst_5
    // 1 istore_0
    // 2 ldc2_w #7 <12000.0>
    // 5 dstore_1
    // 6 getstatic #6 <L3_instructions/C1_LV_stack_op.obj : Ljava/lang/Object;>
    // 9 astore_3
    //10 return
    public static void popToLV(){
        int a = 5;
        double b = 12000D;
        Object o = obj;
    }

}

