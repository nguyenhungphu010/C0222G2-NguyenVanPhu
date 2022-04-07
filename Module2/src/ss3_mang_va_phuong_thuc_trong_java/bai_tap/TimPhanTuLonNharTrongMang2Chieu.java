package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TimPhanTuLonNharTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your row numbers matrix: ");
        int row = input.nextInt();
        System.out.print("Enter your collum numbers matrix: ");
        int collum = input.nextInt();

        int[][] matrix = new int[row][collum];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                System.out.print("Enter your value at Matrix[" + i + "][" + j + "] : ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The Matrix : ");
        int max = matrix[0][0];
        int locationRow = 0;
        int locationCollum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                System.out.print(matrix[i][j] + " ");
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    locationRow = i;
                    locationCollum = j;
                }
            }
            System.out.print("\n");
        }

        System.out.print("The max value of Matrix is : " + max + "\nAt row: " + locationRow + " | collum: " + locationCollum);
    }
}
