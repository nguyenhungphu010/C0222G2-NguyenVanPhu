package ss7_abstract_class_interface.thuc_hanh.thuc_hanh_2;
import java.util.Arrays;
import java.util.Comparator;
import ss7_abstract_class_interface.bai_tap.bai_tap_1.Circle;
public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle [0] = new Circle(3.6);
        circle [1] = new Circle();
        circle [2] = new Circle("blue",false ,3.6 );

        System.out.println("pre-sorted: ");
        for (Circle x : circle
             ) {
            System.out.println(x);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle,circleComparator);
        System.out.println("after sorted: ");
        for (Circle x: circle
             ) {
            System.out.println(x);
        }
    }
}
