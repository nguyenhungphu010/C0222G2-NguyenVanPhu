package ss10_danh_sach.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    /**
     * số lượng phần tử có trong Array Líst
     */
    private int size = 0;
    /**
     * sức chứa của MyArrayList
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Khia báo Mảng chứa đối tượng
     */
    Object elements[];

    // constructor không tham số;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor có tham số;
    public MyList(int capacity) {
        if(capacity >0){
            elements = new Object[capacity];
        }else{
            throw new IllegalArgumentException("Capacity:  " + capacity);
        }
    }
    // phuong thuc tra ve size
    public int size (){
        return this.size;
    }

    // phuong thuc claer 1 Array;
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length ; i++) {
            elements[i] = null;
        }
    }
    // phuong thuc add 1 phan tu vao ArrayList
    public boolean add (E element ){
        if(elements.length  == size ){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size ++;
        return true;
    }
    // phuowng thuc bao loi neu phan tu truyen vao mang vuot qua kich thuoc cua mang.
    // phuong thuc tang kich thuoc cua mang;
    public void ensureCapacity(int minCapacity){
        if(minCapacity >=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapcacity: "+ minCapacity);
        }
    }
    // phuong thuc add 1 phan tu tao 1 vi tri nhat dinh
    public void add(E element, int index){
        if(index > elements.length){
            throw new IllegalArgumentException("Index:" + index);
        }else if (elements.length == size ) {
            this.ensureCapacity(5);
        }
        if(elements[index] == null){
            elements[index] = element;
        } else {
            for (int i = size +1 ; i > index ; i--) {
                elements[i] = elements[i-1];
            }
            elements [index] = element;
            size ++;
        }
    }
    // phuong thuc get 1 phan tu tai vi tri I
    public E get(int index){
        return (E) elements[index];
    }
    // phuong thuc tra ve chi so cua phantu
    public int indexOf( E element) {
        int index = -1;
        for (int i = 0; i < size ; i++) {
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    // phuong thuc kiem tra phan tu co ton tai trong mang hay khong.
    public boolean containing(E element){
        return this.indexOf(element) >= 0;
    }
    // phuong thuc clone mang
    public MyList<E> clone(){
        MyList<E> y = new MyList<>();
        y.elements = Arrays.copyOf(this.elements,this.size);
        y.size = this.size;
        return y;
    }
    // phuogn thuc xoa 1 phan tu tai 1 vi tri Index;
    public E remove (int index){
        if(index<0){
            throw new IllegalArgumentException("Error Index: " + index );
        }
        E element = (E) elements[index];
        for (int i = index; i < size -1 ; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size --;
        return element;
    }
}

