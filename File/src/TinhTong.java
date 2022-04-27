import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        file.createNewFile();
        File file1 = new File("file2.txt");
        file1.createNewFile();
        PrintWriter printWriter = new PrintWriter(file1);
        Scanner scanner = new Scanner(file);
        String str = scanner.nextLine();
        System.out.println(str);
        String[] arr = str.split(" ");
        int tong = 0, max = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            tong += Integer.parseInt(arr[i]);
            if(max<Integer.parseInt(arr[i])){
                max= Integer.parseInt(arr[i]);
            }
        }
        printWriter.println("Tong la : " + tong);
        printWriter.println("Gia tri lon nhat la : " + max);
        printWriter.close();

    }
}
