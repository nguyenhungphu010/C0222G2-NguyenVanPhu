package ss7_abstract_class_interface.bai_tap.bai_tap_1;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("blue", false);
        rectangle.resize(30);
        System.out.println(rectangle);

        rectangle = new Rectangle("blue", true, 10, 15);
        rectangle.resize(30);
        System.out.println(rectangle);
    }
}
