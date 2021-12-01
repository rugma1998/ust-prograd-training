package Java;
import java.util.Stack;
public class Colors {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("White");
        stack.push("Black");
        stack.push("Blue");
        stack.push("Yellow");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.indexOf("White"));
    }
}
