import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NhapVaoFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\sonvu\\IdeaProjects\\untitled4\\file3.txt");
        if(f.exists()){
            System.out.println("da co file nay");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(f);
        output.print("Pham Huy Bich");
        output.print(90);
        output.print("Luffy");
        output.print(50);
        output.close();
//        f.delete();
////        if(f.exists()){
////            System.out.println("da co file nay");
////            System.exit(1);
////        }

    }
}
