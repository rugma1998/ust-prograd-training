package Java;
import java.util.LinkedList;
public class Birds {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("parrot");
        linkedList.add("peacock");
        linkedList.add("pigeon");
        linkedList.add("dove");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        linkedList.forEach(birds -> System.out.println(birds));
        System.out.println(linkedList.lastIndexOf("dove"));

    }
}
