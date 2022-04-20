package bai_tap_nang_cao_Arraylist.controller;

import bai_tap_nang_cao_Arraylist.model.Truck;
import bai_tap_nang_cao_Arraylist.service.ICarService;
import bai_tap_nang_cao_Arraylist.service.IMotorService;
import bai_tap_nang_cao_Arraylist.service.ITruckService;
import bai_tap_nang_cao_Arraylist.service.implement.CarService;
import bai_tap_nang_cao_Arraylist.service.implement.MotorService;
import bai_tap_nang_cao_Arraylist.service.implement.TruckService;

import java.util.Scanner;

public class VehicleControl {
    public static ICarService carService = new CarService();
    public static ITruckService truckService = new TruckService();
    public static IMotorService motorService = new MotorService();

    public static Scanner scanner = new Scanner(System.in);

    // method hien thi menu hien thi chuc nang ban dau.
    public static void display() {
        while (true) {
            System.out.println("welcome to the vehicle manager");
            System.out.println("choose the function");
            System.out.println("1. Adding more vehicle.\n" +
                    "2. Displaying the vehicle.\n" +
                    "3. Deleting the vehicle.\n" +
                    "4. Searching the vehicle by license plates.\n" +
                    "5. Exit.\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addingVehicle();
                    break;
                case 2:
                    displayVehicle();
                    break;
                case 3:
                    deleteVehicle ();
                    break;
                case 4:
                    searchVehicle();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("please input the right number");
            }
        }
    }

    // menu hien thi danh sach thiet bi trong danh sach.
    public static void displayVehicle() {
        while (true) {
            System.out.println("1. Truck,\n" +
                    "\t2. Car,\n" +
                    "3. Moto.\n");
            System.out.println("please pick the Vehicle: ");
            int type = Integer.parseInt(scanner.nextLine());

            switch (type) {
                case 1:
                    truckService.display();
                    break;
                case 2:
                    carService.display();
                    break;
                case 3:
                    motorService.display();
                    break;
            }
        }

    }

    public static void addingVehicle() {
        while (true) {
            System.out.println("1. Add Truck,\n" +
                    "2. Add Car,\n" +
                    "3. Add Motor.\n");
            System.out.println("please pick the Vehicle: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    truckService.add();
                    break;
                case 2:
                    carService.add();
                    break;
                case 3:
                    motorService.add();
                    break;
            }
        }
    }

    public static void deleteVehicle() {
        System.out.println(" please input the license Plate");
        String plate = scanner.nextLine();
        truckService.delete(plate);
        carService.delete(plate);
        motorService.delete(plate);

    }

    public static void searchVehicle() {
        System.out.println(" please input the license Plate");
        String plate = scanner.nextLine();
        if (truckService.search(plate)){
            System.out.println("this is your search result");
        }else if (carService.search(plate)){
            System.out.println("this is your search result");
        }else if (motorService.search(plate)){
            System.out.println("this is your search result");
        }else {
            System.out.println("no search result");
        }

    }
}
