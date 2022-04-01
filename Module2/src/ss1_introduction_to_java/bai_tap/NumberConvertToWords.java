package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberConvertToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number with 3 digits");
        int z = scanner.nextInt();
        if (z < 0 || z > 999)
            System.out.println("wrong input number");
        else {
            int last = z % 10; // last digit
            int tt = z / 10;
            int second = tt % 10; // second digit
            int first = z / 100; // first digit;
            String[] tenWords = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String[] numWords = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};
            String hw = "Hundred";
            if (z < 20)
                System.out.println(numWords[z]);
            else if (z < 100)
                System.out.println(tenWords[second] + "" + numWords[last]);
            else
                System.out.println(numWords[first] + hw + tenWords[second] + "" + numWords[last]);
        }


    }
}
