package ss2_vong_lap_trong_Java.bai_tap;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong");
        int width = scanner.nextInt();
        System.out.println("nhap chieu cao");
        int height = scanner.nextInt();
        for (int i = 0; i <height ; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
        }
        System.out.println("\n----------------------------------");
        System.out.println("in hinh tam giac buttom-left");
        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n----------------------------------");
        System.out.println("in hinh tam giac top-left");
        for (int i = height; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n----------------------------------");
        System.out.println("in hinh tam giac top-right");
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <=height ; j++) {
                if(j<i)
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n----------------------------------");
        System.out.println("in hinh tam giac buttom -right");
        for (int i = 1; i <= height; i++) {
            for (int k = height; k >= i; k--)
                System.out.print(" ");
            for (int j = 1; j <= i  ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
