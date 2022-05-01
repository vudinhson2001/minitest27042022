package QLDB;

import java.io.*;
import java.util.List;

public class FileDanhBa {
    public static void writeToFile(String path, List<DanhBa> danhBas) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "name,phone,addres,email" + "\n";
        for (DanhBa db : danhBas) {
            str += db.getName() + " , " + db.getPhone() +  " , " + db.getAddress() + " , " + db.getEmail() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<DanhBa> readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            System.out.println(content);
        }
        return null;
    }
}
