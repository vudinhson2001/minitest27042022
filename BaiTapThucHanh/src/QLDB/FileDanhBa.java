package QLDB;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileDanhBa {
    public static void writeToFile(String path , List<DanhBa> danhBas) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "name,phone,addres,email"+"\n";
        for(DanhBa db: danhBas){
            str+=db.getName()+","+db.getPhone()+","+db.getAddress()+","+db.getEmail()+"\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }
}
