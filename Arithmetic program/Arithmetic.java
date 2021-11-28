package Java;
interface Addition {
    public int add(int a, int b);
}
interface Subtraction {
    public int sub(int a, int b);
}
interface Multiplication {
    public int mul(int a, int b);
}
public class Arithmetic {
    public static void main(String[] args){
        Addition addition=(a, b) -> {
            return a+b;
        };
        Subtraction subtraction=(a, b) -> {
            return a - b;
        };
        Multiplication multiplication=(a, b) -> {
            return a * b;
        };
        System.out.println(addition.add(10, 15));
        System.out.println(subtraction.sub(10, 30));
        System.out.println(multiplication.mul(5, 5));
    }
}
