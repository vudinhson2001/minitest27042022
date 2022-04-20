package Stack;

import java.util.Stack;

public class DaoNguocSo {
    public static void main(String[] args) {
        Stack<Integer>  number = new Stack<>();
    number.push(9);
    number.push(6);
    number.push(1);

        System.out.println("So :" +number);
        int phanTu = number.pop();
        System.out.println(phanTu);
        int phanTu1 = number.pop();
        System.out.println(phanTu1);
        int phanTu2 = number.pop();
        System.out.println(phanTu2);
        System.out.println("-----------------------");
        int phanTu3=number.push(1);
        System.out.println(phanTu3);
        int phanTu4=number.push(6);
        System.out.println(phanTu4);
        int phanTu5=number.push(9);
        System.out.println(phanTu5);
        System.out.println("Mang sau khi dao nguoc : "+number);
    }

}
