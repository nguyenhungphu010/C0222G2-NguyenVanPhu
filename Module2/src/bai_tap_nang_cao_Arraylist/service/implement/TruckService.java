package bai_tap_nang_cao_Arraylist.service.implement;

import bai_tap_nang_cao_Arraylist.controller.VehicleControl;
import bai_tap_nang_cao_Arraylist.model.Car;
import bai_tap_nang_cao_Arraylist.model.Moto;
import bai_tap_nang_cao_Arraylist.model.Truck;
import bai_tap_nang_cao_Arraylist.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Truck> truckList = new ArrayList<>();


    static {
        truckList.add(new Truck("43D2-343767", "Misubishi", 2019, "Phuong", 10000));
        truckList.add(new Truck("43D2-237263", "DongFeng", 2018, "Yai", 12000));
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
        System.out.print("input the weight: ");
        int  weight = Integer.parseInt(scanner.nextLine()) ;
        Truck truck = new Truck(plates,maker,yearsOfMaking,owner,weight);
        truckList.add(truck);
    }

    @Override
    public void display() {
        for (Truck x : truckList
             ) {
            System.out.println(x);
        }

    }

    @Override
    public void delete(String plate) {
        for (Truck x : truckList
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
                            truckList.remove(x);
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
        for (Truck x : truckList
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
