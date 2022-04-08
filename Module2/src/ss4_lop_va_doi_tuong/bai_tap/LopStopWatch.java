package ss4_lop_va_doi_tuong.bai_tap;
import java.util.Scanner;
public class LopStopWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập độ dài của mảng : ");
        int number = input.nextInt();
        int[] arrayNumber = new int[number];

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(arrayNumber);
        stopWatch.stop();
        System.out.print("The time to do (millisecond) = " + stopWatch.getElapsedTime());

    }

    private static void selectionSort(int[] arrayNumber) {
        int location = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            int min = arrayNumber[i];
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (min > arrayNumber[j]) {
                    min = arrayNumber[j];
                    location = j;
                }
            }
            arrayNumber[location] = arrayNumber[i];
            arrayNumber[i] = min;
        }
    }


    public static class StopWatch {
        long startTime;
        long endTime;

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }
    }
}
