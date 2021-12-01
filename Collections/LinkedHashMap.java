import java.util.*;
public class Teachers {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Sowmya");
        map.put(2, "Sheeba");
        map.put(3, "Nandini");
        for(Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        }
}