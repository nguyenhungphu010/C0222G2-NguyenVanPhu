package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tao doi tuong Scanner
        System.out.print("which month that you wanna count days: ");
        int month = scanner.nextInt();

        String dayInMonth = "";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 2:
                System.out.print("the "+ month +" has 28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";
        }
        if(!dayInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, dayInMonth);
        }else  System.out.print("Invalid input!");
    }
}
