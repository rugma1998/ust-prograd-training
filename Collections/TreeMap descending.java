import java.util.*;
public class Descending {
    public static void main(String[] args) {
        TreeMap<Integer, String> desc = new TreeMap<>();
        desc.put(02, "February");
        desc.put(12, "December");
        desc.put(05, "May");
        desc.put(01, "January");
        System.out.println("Before Descending");
        for (Map.Entry<Integer, String> map : desc.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        Set<Integer> keySet = desc.descendingKeySet();
        System.out.println("After Descending");
        for (Integer key : keySet) {
            System.out.println(key + " " + desc.get(key));
        }
    }
}