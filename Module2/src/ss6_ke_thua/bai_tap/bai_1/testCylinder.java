package ss6_ke_thua.bai_tap;

public class testCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5, "violet");
        System.out.println(circle);


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5, 4.0, "grey");
        System.out.println(cylinder);
    }
}
