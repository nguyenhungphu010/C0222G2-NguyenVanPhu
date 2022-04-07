package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class TimPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] array = {4, 5, 3, 6, 7, 7, 5, 9, 4, 1};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print("min value in array is : " + min);
    }
}
