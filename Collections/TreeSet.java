import java.util.Scanner;
import java.util.TreeSet;
public class Gradelevel {
    public static void main(String[] args) {
        TreeSet<Integer> gradelevel = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students ");
        int student=sc.nextInt();
        System.out.println("Enter the number of students passed ");
        int passed=sc.nextInt();
        System.out.println("Enter the gradelevel of students ");
        for(int i=0;i<passed;i++)
        {
            gradelevel.add(sc.nextInt());
        }
        System.out.println("Position of students " + gradelevel);
    }
}
