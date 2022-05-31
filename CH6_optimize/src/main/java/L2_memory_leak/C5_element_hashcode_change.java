package L2_memory_leak;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;


@Data
@AllArgsConstructor
@EqualsAndHashCode
class Point {
    int x;
    int y;
}

public class C5_element_hashcode_change {


    static HashSet<Point> set = new HashSet<>();

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        set.add(p1);
        System.out.println("set.remove(p1) = " + set.remove(p1)); // true
        System.out.println(set.size());

        Point p2 = new Point(7, 8);
        set.add(p2);
        p2.setX(1000);
        System.out.println("set.remove(p2) = " + set.remove(p2)); // false
        System.out.println(set.size());
    }
}


