import java.util.*;
public class SocialMedia {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(001, "WhatsApp");
        map.put(002, "Facebook");
        map.put(003, "Instagram");
        map.put(004, "YouTube");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("headmap: " + map.headMap(004));
    }
}