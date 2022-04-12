package ss5_access_modifier.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","four-cylinder ");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("GLC300","four-cylinder ");
        System.out.println(Car.numberOfCar);
    }
}
