package ss15_xu_ly_ngoai_le_debug.bai_tap;
import java.util.Scanner;
public class MainTriagle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{
        boolean flag ;
        do {
            flag = false;
            System.out.println(" nhap canh a:");
            Double a = Double.parseDouble(scanner.nextLine());
            System.out.println(" nhap canh b:");
            Double b = Double.parseDouble(scanner.nextLine());
            System.out.println(" nhap canh c:");
            Double c = Double.parseDouble(scanner.nextLine());
            try {
                new Triagle(a,b,c);
            }catch (Exception e){
                e.printStackTrace();
                flag = true;
            }
        }while (flag);
    }
}
