public class RectangleArea {
    public double area(double l, double b) {
        if (l <= 0 || b <= 0) {
            throw new ArithmeticException("Length and Breadth can't be negative number");
        }
        return l * b;
    }
}
