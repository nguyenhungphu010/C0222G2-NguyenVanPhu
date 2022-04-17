package ss10_danh_sach.bai_tap;

public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // phan tu dau tien cua danh sach
    private Node head;
    // so luong phan tu trong danh sach
    private int numNodes = 0;

    public MyLinkedList() {
        //
    }

    public void adddFirst(E element) {
        // khia bao 1 bien tam temp tro den gia tri cua head.
        Node temp = head;
        // bien head se nhan gia tri la 1 node moi
        head = new Node(element);
        // head.next den temp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        // khia bao bien temp tro den head
        Node temp = head;
        // se cgho contro tro den phan tu cuoi cung trong danh sach;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        // khai bao bien Temp  tro den head
        Node temp = head;
        // Khia bao 1 node la holder;
        Node holder;
        // con tro tro den vi tri index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        // cho holder tham chieu den vi tri index
        holder = temp.next;
        // Node tai vi tri index-1 sex tro toi Node moi
        temp.next = new Node(element);
        // node moi se tro den Holder
        temp.next.next = holder;
        // tang so luong danh sach len 1;
        numNodes++;
    }

    // phuong thuc get
    public Object get(int index) {
        // khai bao bien temp con tro toi head;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // phuong thuc tra ve so luong phan tu size;
    public int size() {
        return numNodes;
    }

    // phuong thuc remove 1 phan tu
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error Index: " + index);
        }
        // khai bao 1 bien temp tro den head 
        Node temp = head;
        Object data;

        // new index = 0 se tra ve data hien tai; 
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    // phuong thuc remove voi element
    public boolean remove(E element) {
        // remove doi tuong neu elemenent la head;
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
    public MyLinkedList<E> clone(){
        // Kiem tra LinkedList co phan tu hay ko  ?
        if(numNodes == 0){
            throw new NullPointerException("Linked List nay la null");
        }
        // khia bao Linked List tra ve;
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        // khai bao 1 temp tro den head;
        Node temp= head;
        // add temp vao danh sach tra ve lam head;
        returnLinkedList.adddFirst((E)temp.data);
        temp = temp.next;
        while(temp != null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    // phuong thuc kiem tra 1 phan tu co trong mang hay ko ?
    public boolean contain(E element){
        Node temp = head;
        while (temp.next != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if(temp.getData().equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }


}
