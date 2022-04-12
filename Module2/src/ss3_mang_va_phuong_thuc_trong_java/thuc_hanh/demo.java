package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] myList = new int[4][4];
        System.out.println("Enter " + myList.length + "row and "+ myList[0].length+"columns: ");
        for (int i = 0; i < myList.length ; i++) {
            for (int j = 0; j < myList[i].length; j++) {
//                myList[i][j] = scanner.nextInt();
                // nhập các giá trị ngẫu nhiên vào mảng
                myList [i][j] = (int) (Math.random()*16);
            }
        }
        int maxRow = 0;
        int indexOfMaxRow = 0;
// Get sum of the first row in maxRow
        for (int column = 0; column < myList[0].length; column++) {
            maxRow += myList[0][column];
        }
        for (int row = 1; row < myList.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < myList[row].length; column++)
                totalOfThisRow += myList[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

        int x =1;
        System.out.println("Before the call, x is:"+ x);
        increment(x);
        System.out.println("After the call, x is:"+ x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is "+ n);
    }
}
