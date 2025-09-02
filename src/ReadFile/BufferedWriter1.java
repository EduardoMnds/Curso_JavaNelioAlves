package ReadFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
    public static void main (String[] args) {

        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Evening"};

        String path = "C:\\Users\\eduar\\Downloads\\out.txt";

        //Parametro true é utilizado para incluir informações no arquivo caso ele já exista
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
