package ss2_vong_lap_trong_Java.bai_tap;
import java.util.Scanner;
public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"nhap so max\"");
        int max = scanner.nextInt();
        for (int i = 2; i <= max ; i++) {
            int flag = 0;
            for (int j = 2; j < i ; j++) {
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }if( flag == 0){
                System.out.println(i + " ");
            }
        }
    }
}
