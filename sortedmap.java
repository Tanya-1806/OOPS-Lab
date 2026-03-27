import java.util.*;

public class sortedmap {
    public static void main(String[] args) {

        SortedMap<Integer, String> sm = new TreeMap<>();

        sm.put(3, "C");
        sm.put(1, "A");
        sm.put(2, "B");

        sm.remove(1);

        System.out.println(sm.get(2));

        System.out.println(sm.containsKey(2));

        System.out.println(sm.firstKey());

        System.out.println(sm.lastKey());

        System.out.println(sm.headMap(3));

        System.out.println(sm.tailMap(2));

        for(Map.Entry<Integer, String> e : sm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}