package ss12_java_collection_framework.bai_tap.service;
import java.util.Comparator;
import ss12_java_collection_framework.bai_tap.model.Product;
public class SortPriceHighToLow implements Comparator<Product>{

    @Override
    public int compare( Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
