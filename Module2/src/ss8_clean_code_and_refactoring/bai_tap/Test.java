package ss8_clean_code_and_refactoring.bai_tap;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};

        System.out.println(Test.solution(arr));

    }
    public static boolean solution(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            int firstSum = 0;
            int secondSum = 0;
            for (int j = 0; j < i; j++) {
                firstSum += arr[j];
                System.out.println("first: " + arr[j]);
            }
            for (int j = i + 1; j < arr.length; j++) {
                secondSum += arr[j];
                System.out.println("second: " + arr[j]);
            }
            if (firstSum == secondSum) {
                return true;
            }
        }
        return false;
    }
}
