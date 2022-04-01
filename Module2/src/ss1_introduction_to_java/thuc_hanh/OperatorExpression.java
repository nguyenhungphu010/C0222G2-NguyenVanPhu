package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // Nhap chieu rong

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // nhap chieu cao


        float area = height * width;
        System.out.println(" Area is "+ area);
    }
}
