package ss5_access_modifier.bai_tap;

public class Circle {
    private double radisus = 1.0;
    private String color = "red";
    private double area = radisus * radisus * Math.PI;

    public Circle() {
        // constructor khong co tham so
    }
    public Circle(double r) {
        this.radisus = r;
    }

    public double getRadius() {
        return radisus;
    }

    public double getArea() {
        return area;
    }
}
