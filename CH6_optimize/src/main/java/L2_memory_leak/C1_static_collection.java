package L2_memory_leak;

import java.util.HashMap;

public class C1_static_collection {

    // 静态 集合
    static HashMap<String,String> map = new HashMap<>();

    // 业务代码
    public void biz_service(){
        // put map
        map.put("k1","v1");
    }

}
