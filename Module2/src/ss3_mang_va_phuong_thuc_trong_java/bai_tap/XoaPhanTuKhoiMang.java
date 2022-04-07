package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println(array[0]);
        System.out.print("nhập phần tử cần xóa");
        int x = scanner.nextInt();
        int temp;
        for (int i = 0; i < array.length ; i++) {
            if (x == array[array.length -1]){
                array[array.length -1] = 0;
            }
            if (array[i] == x){
                temp = array[i];
                array[i] = array[i+1];
                array[i + 1] = temp;
            }
        }
        System.out.print("mảng sau xóa");
        for(int a : array){
            System.out.print(a+" ");
        }
    }
}
