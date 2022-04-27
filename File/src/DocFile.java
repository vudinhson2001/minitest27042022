import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) throws IOException {
        File file = new File("fileQG.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner sc= new Scanner(file);
        String line = "";
        while ((line =bufferedReader.readLine())!= null){
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
