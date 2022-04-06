package ss2_vong_lap_trong_Java.bai_tap;
import java.util.Scanner;
public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to");
        int quantity = scanner.nextInt(); 
        int num = 1;
        for (int i = 1; i <= quantity ;) {
            int flag = 0;
            num ++;
            for (int j = 2; j < num ; j++) {
                if (num%j ==0 ){
                    flag = 1;
                    break ;
                }
            }
            if (flag ==0 ){
                i++;
                System.out.println(num);
            }
        }
    }
}
