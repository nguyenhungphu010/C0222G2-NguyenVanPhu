package ss2_vong_lap_trong_Java.thuc_hanh;
import java.util.Scanner;
public class UngDungTinhLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        // nhap so tien gui vao;
        System.out.println("Moi nhap so tien gưi : ");
        money = input.nextDouble();

        // nhap so thang gui;
        System.out.println("nhap so thang : ");
        month = input.nextInt();

        // nhap lai xuat;
        System.out.println("nhap lai xuat hang nam: ");
        interestRate = input.nextDouble();

        // tinh lai xuat nhan duoc;
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng số lãi là: " + totalInterest);
    }
}
