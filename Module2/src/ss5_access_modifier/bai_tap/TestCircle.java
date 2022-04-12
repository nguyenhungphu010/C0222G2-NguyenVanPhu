package ss5_access_modifier.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
        System.out.println("ban kinh cua hinh tron la " + c1.getRadius());
        System.out.println("dien tich cua hinh tron la " + c1.getArea());
    }
}
