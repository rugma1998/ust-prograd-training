import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TryCatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int x = in.nextInt();
            int y = in.nextInt();
            int r = x/y;
            System.out.println(r);
        }
        catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}