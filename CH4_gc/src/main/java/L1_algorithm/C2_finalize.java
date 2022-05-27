package L1_algorithm;

import java.util.concurrent.TimeUnit;

class Holder {
    static Holder contained;

    @Override
    protected void finalize() throws Throwable {
        contained = this;
    }
}

public class C2_finalize {
    public static void main(String[] args) throws InterruptedException {
        Holder.contained  = new Holder();

        Holder.contained = null;

        System.gc();
        TimeUnit.SECONDS.sleep(2);
        System.out.println( Holder.contained==null); // false

        Holder.contained = null;
        System.gc();
        TimeUnit.SECONDS.sleep(2);
        System.out.println( Holder.contained==null); // true  因为 finalize 只会调用一次
    }
}
