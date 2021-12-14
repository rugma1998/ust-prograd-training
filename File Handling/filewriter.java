import java.io.*;

public class filewriter {
    public static void main(String[] args)throws IOException {
        FileWriter writer=new FileWriter("C:\\Users\\user\\IdeaProjects\\Filehandling\\src\\Details", true);
        writer.write("Anju\n");
        writer.write("223445\n");
        writer.write("99778854\n");
        writer.write("24\n");
        writer.write("Manager\n");
        writer.close();
    }
}
