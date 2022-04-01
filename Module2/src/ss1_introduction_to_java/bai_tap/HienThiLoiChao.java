package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.print("input the name");
        name = scanner.nextLine();

        if(!name.equals("")){
            System.out.print("Hello "+name+" !");
        }else {
            System.out.print("no name was input");
        }
    }
}
