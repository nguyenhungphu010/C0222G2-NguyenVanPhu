package bai_tap_nang_cao_Arraylist.service;

public interface IVehicleService<T> {
    void add();
    void display();
    void delete(String plate);
    boolean search(String plate);
}
