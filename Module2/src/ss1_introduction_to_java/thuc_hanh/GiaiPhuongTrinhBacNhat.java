package ss1_introduction_to_java.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("linear Equation Resolver");
        System.out.println("Given a equation as 'a* x+b =c'");
        Scanner scam = new Scanner(System.in);

        System.out.print("a: ");
        double a = scam.nextDouble();

        System.out.print("b: ");
        double b = scam.nextDouble();

        System.out.print("c: ");
        double c = scam.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("equation pass with x = %f!\n",answer);
        }else{
            if(b==c ){
                System.out.print("the solution is all xl");
            }else{
                System.out.print("No Solution ");
            }
        }

    }
}
