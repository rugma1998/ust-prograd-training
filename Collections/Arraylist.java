import java.util.ArrayList;
import java.util.List;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(25);
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(5,10,15,20,30));
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(11);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
    }
}