import java.io.*;


public class Demo {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("C:\\Users\\sonvu\\IdeaProjects\\untitled4\\file10.txt");
//            if(f.exists()){
//                System.out.println("da co file nay");
//            }else {
//                f.createNewFile();
//            }
//        System.out.println(f.getAbsolutePath());
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
