package L4_Metaspace;

/*
引入依赖
<dependency>
    <groupId>org.openjdk.jol</groupId>
    <artifactId>jol-core</artifactId>
    <version>0.10</version>
</dependency>
 */

import org.openjdk.jol.vm.VM;

class A{

}

public class C5_object_mem {
    public static void main(String[] args) {
        A a  = new A();
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println(VM.current().addressOf(a));
    }
}
