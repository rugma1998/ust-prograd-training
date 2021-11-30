class Print <E> {
    public void displayArray(E[] array) {
        for (int i = array.length-1;i>=0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
public class Reversearray {
    public static void main(String[] args){
        Integer[] integerArray = new Integer[]{1, 2, 3};
        String[] stringArray = new String[]{"Hello", "All"};
        Print<Integer> obj1 = new Print<Integer>();
        Print<String> obj2 = new Print<String>();
        obj1.displayArray(integerArray);
        obj2.displayArray(stringArray);
    }
}