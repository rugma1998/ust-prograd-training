import java.util.HashSet;
import java.util.List;
public class Interns {
    public static void main(String[] args) {
        HashSet<Integer> details1 = new HashSet();
        HashSet<Integer> details2 = new HashSet(List.of(5,10,15,20));
        details1.add(7);
        details1.add(12);
        details1.add(17);
        details1.add(11);
        System.out.println("Register number of interns completed programming tasks");
        System.out.println(details1);
        System.out.println("Register number of interns completed assessments");
        System.out.println(details2);
    }
}
