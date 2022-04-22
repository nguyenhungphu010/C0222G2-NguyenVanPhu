package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSortStep {
    public static void main(String[] args) {
        int [] array2 = {7,4,90,3,23,6,34,65,89};
        insertionSortStep(array2);
    }
    public static void insertionSortStep(int[] array){
        int index;
        int min;
        for(int i = 0; i < array.length; i++){
            System.out.println("min = array["+i+"] = "+array[i]);
            min = array[i];
            index = i;
            while(index > 0 && min < array[index-1]){
                System.out.println("chèn array["+(index-1)+"] = "+array[index-1]+" vào array["+index+"] = "+array[index]);
                array[index] = array[index-1];
                index--;
                System.out.println(Arrays.toString(array));
            }
            System.out.println("array["+index+"] = min = "+min);
            array[index] = min;
            System.out.println("xong lần "+i+": "+Arrays.toString(array));
        }
        System.out.println("mảng cuối: "+Arrays.toString(array));
    }

}
