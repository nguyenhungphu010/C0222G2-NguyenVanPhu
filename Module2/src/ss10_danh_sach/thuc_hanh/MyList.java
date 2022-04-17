package ss10_danh_sach.thuc_hanh;

import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    // cai đặt phương thức tăng gấp đôi kích thước mảng.
    private void ensureCapa(){
        int newSize = element.length *2;
        element = Arrays.copyOf(element,newSize);
    }
    // cài đặt phương thức add()
    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
        element[size++] =e;
    }
    // cai đặt phương thức get()
    public E get (int i ){
        if(i >= size || i<0){
            throw new IndexOutOfBoundsException("Index: "+ i+ ", Size " +i);

        }
        return (E) element[i];
    }
}
