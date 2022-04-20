package bai_tap_nang_cao_Arraylist.service.implement;

import bai_tap_nang_cao_Arraylist.controller.VehicleControl;
import bai_tap_nang_cao_Arraylist.model.Car;
import bai_tap_nang_cao_Arraylist.model.Moto;
import bai_tap_nang_cao_Arraylist.service.IMotorService;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MotorService implements IMotorService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Moto> motoList = new ArrayList<>();

    static {
        motoList.add(new Moto("43D2-989899", "Yamaha", 2012, "Chau",125));
        motoList.add(new Moto("43D2-324435", "Ducati", 2016, "Tuan",120));
        motoList.add(new Moto("43D2-323435", "Agusta", 2014, "LeVu",126));
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
        System.out.print("input the number of horse power: ");
        int  horsepower = Integer.parseInt(scanner.nextLine()) ;
        Moto motor = new Moto(plates,maker,yearsOfMaking,owner,horsepower);
        motoList.add(motor);
    }

    @Override
    public void display() {
        for (Moto x: motoList
             ) {
            System.out.println(x);
        }
    }

    @Override
    public void delete(String plate) {
        for (Moto x : motoList
        ) {
            String plateInfor = x.getPlates();
            if (plateInfor.contains(plate) ){
                boolean flag = true;
                System.out.println("Are you really want to delete this: " +x);
                System.out.println("1. yes");
                System.out.println("2. no");
                do {
                    System.out.println("Enter: ");
                    int confirm = Integer.parseInt(scanner.nextLine());
                    switch (confirm){
                        case 1:
                            motoList.remove(x);
                            VehicleControl.display();
                            flag = false ;
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
        for (Moto x : motoList
        ) {
            String plateInfor = x.getPlates();
            if (plateInfor.contains(plate)){
                System.out.println(x);
                return true;
            }
        }
        return false;
    }
}
