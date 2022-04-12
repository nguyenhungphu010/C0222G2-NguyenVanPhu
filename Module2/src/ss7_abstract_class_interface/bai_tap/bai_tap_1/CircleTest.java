package ss7_abstract_class_interface.bai_tap.bai_tap_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        circle.resize(30);
        System.out.println(circle);

        circle = new Circle("Blue",false , 3.5);
        circle.resize(20);
        System.out.println(circle);
    }
}
