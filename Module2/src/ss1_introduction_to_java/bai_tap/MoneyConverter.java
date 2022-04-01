package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("input the dollar");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.print(vnd+" dong");
    }
}
