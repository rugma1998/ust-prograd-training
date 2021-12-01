import java.util.LinkedHashSet;
import java.util.List;
public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet();
        hs.add(50);
        hs.add(25);
        hs.addAll(List.of(15,10,20));
        hs.add(75);
        System.out.println(hs);
    }
}