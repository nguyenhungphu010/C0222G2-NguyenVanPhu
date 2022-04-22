package ss14_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int index;
        int min;
        for (int i = 1; i <array.length; i++) {
            min = array[i];
            index = i;
            while (index > 0 && min <array[index -1]){
                array[index] = array[index -1];
                index--;
            }
            array [index] = min;
        }
    }
}
