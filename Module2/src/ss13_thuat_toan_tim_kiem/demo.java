package ss13_thuat_toan_tim_kiem;

public class demo {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(array1,2));

    }

    public static int binarySearch(int[] arr, int value) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return -1;

    }
}
