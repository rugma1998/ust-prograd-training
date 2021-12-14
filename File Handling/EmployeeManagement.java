package File;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagement
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("C:\\Users\\user\\IdeaProjects\\Filehandling\\src\\Details");
        FileWriter writer = new FileWriter(file, true);
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Read Details 2.Add Details ");
        int choice= Integer.parseInt(scanner.nextLine());

        switch (choice)
        {
            case 1:
            {
                int rd = reader.read();
                if (rd != -1) {
                    Scanner scanner1 = new Scanner(file);
                    System.out.println(scanner1.nextLine());
                    while (scanner1.hasNext()) {
                        System.out.println(scanner1.nextLine());
                    }
                }
                else
                {
                    System.out.println("File is Empty");
                }
                reader.close();
            }
            break;
            case 2:
            {
                System.out.print("Enter the name : ");
                String w = scanner.nextLine();
                writer.append(w);
                writer.append("\n");
                System.out.print("Enter the employee ID : ");
                String r = scanner.nextLine();
                writer.append(r);
                writer.append("\n");
                System.out.print("Enter the Mobile Number : ");
                String i = scanner.nextLine();
                writer.append(i);
                writer.append("\n");
                System.out.print("Enter the age : ");
                String t = scanner.nextLine();
                writer.append(t);
                writer.append("\n");
                System.out.print("Enter the position : ");
                String x = scanner.nextLine();
                writer.append(x);
                writer.append("\n");
                writer.close();
            }
            break;
        }
    }
}
