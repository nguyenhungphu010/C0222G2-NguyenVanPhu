package ss4_lop_va_doi_tuong.bai_tap;
import java.util.Scanner;
public class LopPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The QuadraticEquation is : ax^2+bx+c=0");
        System.out.print("Enter your a: ");
        double a = input.nextDouble();
        System.out.print("Enter your b: ");
        double b = input.nextDouble();
        System.out.print("Enter your c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.display());


        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("This QuadraticEquation have 1 root : " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("This QuadraticEquation have 2 root, root1 is : " + quadraticEquation.getRoot1() + " ,root2 is: " + quadraticEquation.getRoot2() + " ");
        } else {
            System.out.print("This equation has no roots");
        }

    }

    public static class QuadraticEquation {
        double a;
        double b;
        double c;

        public QuadraticEquation() {
        }

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return b * 2 - 4 * a * c;
        }

        public double getRoot1() {
            return (-b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
        }

        public double getRoot2() {
            return (-b - Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
        }

        public String display() {
            return "this quadratic equation is : " + a + "x^2+" + b + "x+" + c + "=0";
        }

    }
}
