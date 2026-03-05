package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));

        mySet.forEach(e-> System.out.println(e));
        System.out.println();

        mySet.add(23);
        mySet.forEach(e-> System.out.println(e));
        System.out.println();

        mySet.remove(67);
        mySet.forEach(e-> System.out.println(e));
        System.out.println();

        System.out.println(mySet.contains(23));
        System.out.println(mySet.size());
    }
}
