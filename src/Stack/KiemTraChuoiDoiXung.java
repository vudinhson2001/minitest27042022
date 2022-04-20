package Stack;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class KiemTraChuoiDoiXung {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi cần kiểm tra:");
        Scanner sc=new Scanner(System.in);
        String inputString = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Day la chuoi doi xung.");
        else
            System.out.println("Day khong phai la chuoi doi xung.");
    }
}
