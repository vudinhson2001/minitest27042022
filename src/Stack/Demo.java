package Stack;


import java.util.Stack;

public class Demo {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        animals.push("dog");
        animals.push("cat");
        animals.push("fish");
        animals.push("Horse");
        animals.push("Chicken");
        animals.push("Bird");
        animals.push("Snake");
        System.out.println("Stack : " + animals);


        boolean ketQua = animals.empty();
        System.out.println("ngan xep co trong khong ???" + ketQua);
        System.out.println("-------------------");
        int ViTri = animals.search("dog");
        System.out.println("Vi tri cua cho : "+ ViTri);
        System.out.println("-------------------");
        String phanTu = animals.pop();
        System.out.println("Xoa phan tu :" + phanTu);
        System.out.println("-------------------");
        String phanTu2= animals.push("Gnar");
        System.out.println(" Them phan tu :"+phanTu2);
        System.out.println("------------Sau khi them phan tu-------------");
        System.out.println("Stack : "+animals);
        System.out.println("-------------------");
        String phanTu1 = animals.peek();
        System.out.println("phan tu tren cung : "+phanTu1);
    }
}