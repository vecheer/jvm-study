package L1_algorithm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person{
    int[] memKiller = new int[250_1000];
    Person friend;
    /*public Person() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }*/
}

public class C1_reference_counting {
    public static void main(String[] args) throws InterruptedException {

        Person Jack = new Person();

        Person a = new Person();
        Person b = new Person();
        Person c = new Person();
        a.setFriend(b);
        b.setFriend(c);
        c.setFriend(a);

        Jack.setFriend(a);

        Jack.setFriend(null);
        a=null;
        b=null;
        c=null;

        TimeUnit.SECONDS.sleep(20);
        System.gc();
        TimeUnit.SECONDS.sleep(1000);

    }
}
