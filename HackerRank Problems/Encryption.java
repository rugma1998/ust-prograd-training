import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();
        int rowSize = (int)Math.floor(Math.sqrt(size));
        int colSize = (int)Math.ceil(Math.sqrt(size));
       
        while(colSize>rowSize){
            colSize--;
            if((colSize*rowSize)<size){
                colSize++;
                break;
            }
        }
        while((colSize*rowSize)<size&&(colSize>rowSize)){
            rowSize++;
        }
        
        for(int i =0;i<colSize;i++){
            
            int row = 0;
            while(row<=rowSize-1){
                if((i+row*colSize)<size)
                {
                    System.out.print(input.charAt(i+row*colSize)); 
                     row++;
                }     else{
                    break;
                }        
             
            }
            System.out.print(" ");
        }
    }
}
