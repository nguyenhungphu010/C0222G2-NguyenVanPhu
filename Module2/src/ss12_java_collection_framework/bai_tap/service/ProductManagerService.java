package ss12_java_collection_framework.bai_tap.service;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.LinkedList;
import java.util.Scanner;
public class ProductManagerService implements IProductManager{
    static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Product> productList = new LinkedList<>();
    static {
        productList.add(new Product(4,"Snack",15000));
        productList.add(new Product(1, "IceCream", 20000));
        productList.add(new Product(2, "Water", 5000));
        productList.add(new Product(3, "Rice", 21000));
        productList.add(new Product(5,"Noodle",8000));
    }

    @Override
    public void add() {
        System.out.print("add id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.print("add name: ");
        String name = scanner.nextLine();
        System.out.print("add price: ");
        Integer price = Integer.parseInt(scanner.nextLine());

        productList.add(new Product(id, name, price));

    }

    @Override
    public void update() {
        System.out.print("Enter id for update: ");
        Integer idUpdate = Integer.parseInt(scanner.nextLine());
        boolean IdUpdate = false;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i).getId()).equals(idUpdate)) {
                IdUpdate = true;
                index = i;
            }
        }
        if(IdUpdate){
            System.out.print("Update name : ");
            String nameUpdate = scanner.nextLine();
            System.out.print("Update price : ");
            Integer priceUpdate = Integer.parseInt(scanner.nextLine());
            productList.get(index).setName(nameUpdate);
            productList.get(index).setPrice(priceUpdate);
//          productList.remove(productList.get(index));
//          productList.add(index, new ProductSs12(idUpdate, nameUpdate, priceUpdate));
        }else {
            System.out.println("this id is not exist to update");
        }

    }

    @Override
    public void delete() {
        System.out.print("Enter id for delete: ");
        Integer idDelete = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (Product x : productList) {
            if (x.getId().equals(idDelete)) {
                productList.remove(x);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("deleted");
        } else {
            System.out.println("this id is not exist to delete");
        }

    }

    @Override
    public void display() {
        for (Product x : productList) {
            System.out.println(x);
        }
    }

    @Override
    public void search() {
        System.out.print("Enter name of product to search: ");
        String nameSearch = scanner.nextLine();
        for (Product x : productList){
            if(x.getName().contains(nameSearch)){
                System.out.println(x);
            }
        }
    }

    @Override
    public void sort() {
        System.out.println("Sort by price");
        System.out.println("1. High to low");
        System.out.println("2. low to high");
        boolean flag = true;
        do{
            System.out.print("Enter number on menu to sort: ");
            Integer pickSort = Integer.parseInt(scanner.nextLine());
            switch (pickSort){
                case 1:
                    SortPriceHighToLow sortPriceHighToLow = new SortPriceHighToLow();
                    productList.sort(sortPriceHighToLow);
                    display();
                    flag =false;
                    break;
                case 2:
                    SortPriceLowToHigh sortPriceLowToHigh = new SortPriceLowToHigh();
                    productList.sort(sortPriceLowToHigh);
                    display();
                    flag =false;
                    break;
                default:
                    System.out.println("Please Enter right number");
            }
        }while (flag);

    }
}
