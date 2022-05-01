

//import java.io.*;
//import java.util.List;
//
//public class FileStaff {
//    public static void writeToFile(String path, List<Staff> staffList) throws IOException {
//        FileWriter fileWriter = new FileWriter(path);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        String str = "Name,Type,Status,Salary" + "\n";
//        for (Staff st :staffList ) {
//            str += st.getName() + " , " + st.getType() +  " , " + st.getStatus() + " , " + st.getSalary() + "\n";
//        }
//        bufferedWriter.write(str);
//        bufferedWriter.close();
//        fileWriter.close();
//    }
//
//    public static List<Staff> readFromFile(String path) throws IOException {
//        FileReader fileReader = new FileReader(path);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String content = bufferedReader.readLine();
//        while ((content = bufferedReader.readLine()) != null) {
//            System.out.println(content);
//        }
//        return null;
//    }
//}
