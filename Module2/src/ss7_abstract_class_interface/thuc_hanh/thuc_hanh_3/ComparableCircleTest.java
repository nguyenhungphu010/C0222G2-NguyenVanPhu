package ss7_abstract_class_interface.thuc_hanh.thuc_hanh_3;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles [0] = new ComparableCircle(3.7);
        circles [1] = new ComparableCircle();
        circles [2] = new ComparableCircle("red",false,5.9);
        System.out.println(" trươc khi sort: ");
        for (ComparableCircle x :circles
             ) {
            System.out.println(x);
        }

        Arrays.sort(circles);
        for (ComparableCircle x : circles
             ) {
            System.out.println(x);
        }
    }
}
