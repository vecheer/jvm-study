package L1_algorithm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Animal{
    String name;
    int age;
}

public class C3_GC_Roots {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 1000; i++) {
            int[] memKiller = new int[256*1024];
            TimeUnit.MILLISECONDS.sleep(20);
            Animal animal = new Animal("dog",i);
        }


        TimeUnit.SECONDS.sleep(1000);

    }

}
