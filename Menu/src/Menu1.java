import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("<<<<<========MENU=========>>>>>\n" +
                    "<<<<< 1.Hien Thi Danh Sach >>>>>\n" +
                    "<<<<< 2. Them >>>>>\n" +
                    "<<<<< 3.Sua >>>>>\n" +
                    "<<<<< 4.Xoa >>>>>\n" +
                    "<<<<< 5.Thoat >>>>>\n");


            try {
                choice = scanner.nextInt();


            } catch (InputMismatchException e) {
                System.out.println(" Nhap khong dung");
                scanner.nextLine();
            }


            switch (choice) {
                case 1:
                    System.out.println("Danh sach la :............");
                    break;
                case 2:
                    System.out.println("Them :.......");
                    break;
                case 3:
                    System.out.println("Sua : .......");
                    break;
                case 4:
                    System.out.println("Xoa :...........");
                    break;
            }
        }
        while (choice != 5);
    }
}
