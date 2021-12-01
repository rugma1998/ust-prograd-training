import java.util.*;
public class Employees {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aswathy");
        map.put(2, "Akshaya");
        map.put(3, "Anju");
        map.put(4, "Akshara");
        System.out.println(map);
        map.putIfAbsent(2, "Rugma");
        map.remove(4);
        System.out.println(map);
    }
}