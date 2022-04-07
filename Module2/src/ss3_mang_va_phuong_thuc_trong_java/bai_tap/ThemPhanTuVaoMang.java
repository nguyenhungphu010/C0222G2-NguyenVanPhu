package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.print("Origin Array: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.print("\nEnter your value : ");
        int value = input.nextInt();
        int index;
        do {
            System.out.print("Enter your index : ");
            index = input.nextInt();
            if (index < 0 || index > array.length - 1) {
                System.out.println("Cant do this!");
            }
        } while (index < 0 || index > array.length - 1);

        System.out.println("check!");

        boolean flag = false;
        int temp = 0;
        int temp2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (flag) {
                temp2 = array[i];
                array[i] = temp;
                temp = temp2;
            }
            if (i == index) {
                temp = array[i];
                array[i] = value;
                flag = true;
            }
        }
        System.out.print("New Array: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
