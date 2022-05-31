package L1_optimize_tools;

import java.util.concurrent.TimeUnit;


// -Xms30M -Xmx30M
public class C4_MAT_dominator_tree {
    public static void main(String[] args) throws InterruptedException {
        ElementHolder eh = new ElementHolder();
        eh.letEleSleep();

        TimeUnit.SECONDS.sleep(120);
    }

}


class ElementHolder{
    int[] memKiller = new int[1024 * 1024]; // memKiller 4M
    Element element = new Element();

    public void letEleSleep(){
        element.sleep();
    }

}

class Element{
    byte[] memKiller = new byte[10 * 1024 * 1024]; // memKiller 10M

    public void sleep(){
        try {
            TimeUnit.SECONDS.sleep(120);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}