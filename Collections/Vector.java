package Java;
import java.util.Vector;
public class Cars {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>(10);
        vector.add("Audi");
        vector.add("BMW");
        vector.add("Benz");
        vector.addElement("Tesla");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.contains("Ford"));

    }
}