package bai_tap_nang_cao_Arraylist.service.implement;

import bai_tap_nang_cao_Arraylist.controller.VehicleControl;
import bai_tap_nang_cao_Arraylist.model.Car;
import bai_tap_nang_cao_Arraylist.model.Vehicle;
import bai_tap_nang_cao_Arraylist.service.ICarService;
import bai_tap_nang_cao_Arraylist.view.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static Scanner scanner = new Scanner(System.in);
    // Interface List giúp khai báo kiểu đôi tượng <Car>
    // new ArrayList giúp khởi tạo đối tượng
    // Khai báo đối tượng kiểu Cha, khởi tạo đôi tượng kiểu Con.
    // <Car> là kiểu dữ liệu Khai báo : Declared type / nằm ở Stack
    // ArrayList <> là kiểu dữ liệu thực tế: Actual tupe / nằm ở HEAP

    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("43D2-29194", "Honda", 2022, "Phu", 18, "bus"));
        carList.add(new Car("43D2-29195", "Huyndai", 2018, "Hai", 4, "SUV"));
    }

    @Override
    public void add() {
        System.out.print("input the license plates: ");
        String plates = scanner.nextLine();
        System.out.print("input the Maker: ");
        String maker = scanner.nextLine();
        System.out.print("input the year of manufacturing: ");
        int yearsOfMaking = Integer.parseInt(scanner.nextLine());
        System.out.print("input the name of owner: ");
        String owner = scanner.nextLine();
        System.out.print("input the number of seats: ");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.print("input the type of car: ");
        String type = scanner.nextLine();
        Car car = new Car(plates, maker, yearsOfMaking, owner, seats, type);
        carList.add(car);
    }

    @Override
    public void display() {
        for (Car x : carList
        ) {
            System.out.println(x);
        }

    }

    @Override
    public void delete(String plate) {
        for (Car x : carList
        ) {
            String plateInfor = x.getPlates();
            if (plateInfor.contains(plate)) {
                boolean flag = true;
                System.out.println("Are you really want to delete this: " + x);
                System.out.println("1. yes");
                System.out.println("2. no");
                do {
                    System.out.println("Enter: ");
                    int confirm = Integer.parseInt(scanner.nextLine());
                    switch (confirm) {
                        case 1:
                            carList.remove(x);
                            VehicleControl.display();
                            flag = false;
                            break;
                        case 2:
                            VehicleControl.display();
                            break;
                        default:
                            System.out.println("choose the correct number");

                    }
                }
                while (flag);
            }
        }

    }

    @Override
    public boolean search(String plate) {
        for (Car x : carList
        ) {
            String plateInfor = x.getPlates();
            if (plateInfor.contains(plate)) {
                System.out.println(x);
                return true;
            }
        }
        return false;
    }
    // điều phối chương trình . hiển thị menu để quyêt định luồng chương trình.
    // view sẽ gọi chức năng của Controller.

}
