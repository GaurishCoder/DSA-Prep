package DAY5;

import java.util.HashSet;

public class SetInterface {

    static void HashSetExample() {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(5);
        hs.add(1);
        hs.add(76);
        hs.add(8);
        hs.add(90);

        System.out.println(hs);
    }

    public static void main(String[] args) {
        /**
         * HashSet => uniqueness,unordered,hashing technique
         * LinkedHashSet => unqiue,ordered,linkedlist + hashing
         * TreeSet => unique,sorted ordered
         */
        HashSetExample();
    }
}
