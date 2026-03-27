import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet<Integer> s = new TreeSet<>();

        // 🔹 1. add()
        s.add(30);
        s.add(10);
        s.add(20);

        // 🔹 Automatically sorted → [10, 20, 30]

        // 🔹 2. remove()
        s.remove(10);

        // 🔹 3. contains()
        System.out.println(s.contains(20));

        // 🔹 4. first() → smallest element
        System.out.println(s.first());

        // 🔹 5. last() → largest element
        System.out.println(s.last());

        // 🔹 6. headSet(x) → elements < x
        System.out.println(s.headSet(25));

        // 🔹 7. tailSet(x) → elements ≥ x
        System.out.println(s.tailSet(20));

        // 🔹 8. Traversal
        for(Integer i : s) {
            System.out.println(i);
        }
    }
}