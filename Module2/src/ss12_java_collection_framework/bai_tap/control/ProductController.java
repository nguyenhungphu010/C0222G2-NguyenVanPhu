package ss12_java_collection_framework.bai_tap.control;
import java.util.Scanner;

import ss12_java_collection_framework.bai_tap.service.IProductManager;
import ss12_java_collection_framework.bai_tap.service.ProductManagerService;
public class ProductController {
    static Scanner scanner = new Scanner(System.in);

    static IProductManager productManager = new ProductManagerService();
    public static void mainMenu(){
        while (true){
            System.out.println("welcome - This is Menu of program");
            System.out.println("1. Add product");
            System.out.println("2. Update product by id");
            System.out.println("3. Delete product by id");
            System.out.println("4. Display all product");
            System.out.println("5. Search product by name");
            System.out.println("6. Sort");
            System.out.println("7. Exit");
            System.out.print("Enter the function: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.update();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter right number on menu");
            }
        }
    }

}
