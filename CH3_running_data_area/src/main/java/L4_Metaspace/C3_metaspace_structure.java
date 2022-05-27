package L4_Metaspace;

import java.io.Serializable;

public class C3_metaspace_structure
        extends ClassLoader
        implements Serializable {

    // 字段
    private static final int num = 110;
    private String str = "its a simple str";

    // 方法
    public static int getNumber(){
        return C3_metaspace_structure.num;
    }

}
