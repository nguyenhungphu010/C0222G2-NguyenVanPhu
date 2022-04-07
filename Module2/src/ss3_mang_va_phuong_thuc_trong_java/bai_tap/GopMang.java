package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = {5, 7, 4, 4, 7, 8};
        int[] array2 = {1, 1, 4, 4, 7, 8, 7, 4, 8, 1};

        int[] array3 = new int[array1.length + array2.length];

        int i = 0;
        while (i != array1.length) {
            array3[i] = array1[i];
            i++;
        }
        int j = 0;
        while (j != array2.length) {
            array3[i] = array2[j];
            i++;
            j++;
        }

        System.out.print("new array: ");
        for (int a : array3) {
            System.out.print(a + " ");
        }
    }
}
