package main;

import QLDB.DanhBa;
import QLDB.FileDanhBa;
import QLDB.QuanLyDanhBa;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
        int choice;
        do {
            System.out.println("=====MENU=======");
            System.out.println(
                    "1. Xem Danh Sach\n" +
                            "2. Them moi\n" +
                            "3. Cap Nhap\n" +
                            "4. Xoa\n" +
                            "5. Tim Kiem\n" +
                            "6. Doc tu file\n" +
                            "7. Ghi vao file\n" +
                            "8. Thoat\n");
            System.out.println("chon chuc nang :");

            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 2) {
                System.out.println("nhap ten : ");
                String nhapTen= scanner.nextLine();
                System.out.println("nhap sdt : ");
                int nhapSo = scanner.nextInt();
                System.out.println("nhap dia chi : ");
                String nhapDiaChi = scanner1.nextLine();
                scanner.nextLine();
                System.out.println("Nhap email : ");
                String nhapEmail = scanner.nextLine();
                DanhBa danhBa = new DanhBa(nhapTen,nhapSo,nhapDiaChi,nhapEmail);
                quanLyDanhBa.add(danhBa);
            } else if (choice == 1) {
            quanLyDanhBa.print();
            } else if (choice == 3) {
                System.out.println("tim sdt can cap nhap :");
                int nhapvao = scanner1.nextInt();
                System.out.println("nhap ten : ");
                String nhapTen= scanner.nextLine();
                System.out.println("nhap sdt : ");
                int nhapSo = scanner1.nextInt();
                System.out.println("nhap dia chi : ");
                String nhapDiaChi = scanner.nextLine();
                scanner1.nextLine();
                System.out.println("Nhap email : ");
                String nhapEmail = scanner1.nextLine();
                DanhBa danhBa1 = new DanhBa(nhapTen,nhapSo,nhapDiaChi,nhapEmail);
                quanLyDanhBa.update(nhapvao, danhBa1);
            } else if (choice == 4) {
                System.out.println("Nhap ten can xoa :");
                String xoaTen = scanner.nextLine();
            quanLyDanhBa.remove(xoaTen);
            } else if (choice == 5) {
                System.out.println(" Tim kiem ten : ");
                String timKiem = scanner.nextLine();

            quanLyDanhBa.search(timKiem);
            } else if (choice == 6) {

            } else if (choice == 7) {
                FileDanhBa.writeToFile("file3.csv",quanLyDanhBa.getDanhBaList());
            } else if (choice == 8) {
                System.exit(0);
            }
        } while (choice != 0);
    }
}
