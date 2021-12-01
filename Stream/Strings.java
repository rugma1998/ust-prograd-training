import java.util.*;
public class Strings {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(List.of("Kerala", "TamilNadu", "Karnataka", "New Delhi", "Kashmir"));
        System.out.println("Places starting with letter K");
        array.stream()
                .filter(var -> var.startsWith("K"))
                .forEach(System.out::println);

        System.out.println("Places ending with letter a");
        array.stream()
                .filter(var -> var.endsWith("a"))
                .forEach(System.out::println);
    }
}