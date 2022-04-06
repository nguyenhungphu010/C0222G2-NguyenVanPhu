package ss2_vong_lap_trong_Java.thuc_hanh;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 2){
            System.out.println(num + " is not a prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num + " is a prime");
            else
                System.out.println(num + " is not a prime");
        }

    }
}
