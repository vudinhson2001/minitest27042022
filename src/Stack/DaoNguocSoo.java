package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocSoo {
    public static void main(String[] args) {
        Stack<String> number= new Stack<>();
        Scanner sc= new Scanner(System.in);
        String numbers = sc.nextLine();
        for (int i = 0; i <numbers.length(); i++) {
        number.push(numbers.charAt(i)+"");
        }
        for (int i = 0; i < numbers.length(); i++) {
            System.out.print(number.pop());
        }
    }
}
