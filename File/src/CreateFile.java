import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
            File f1 = new File("output.txt");
            File f = new File("file3.txt");
        PrintWriter printWriter = new PrintWriter(f1);
        Scanner scanner = new Scanner(f);
        printWriter.println(" ");
        printWriter.close();

    }
}
