package ss10_danh_sach.bai_tap;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
                // ConStructor khong co tham so;
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();

        Student student1 = new Student(1, "Hung");
        Student student2 = new Student(2, "Phu");
        Student student3 = new Student(3, "Hoa");
        Student student4 = new Student(4, "Trang");
        Student student5 = new Student(5, "Hanh");
        Student student6 = new Student(6, "Hieu");

        myLinkedList.adddFirst(student1);
        myLinkedList.adddFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(3,student4);

        myLinkedList.remove(student1);

        // kiem tra remove phan tu
//        myLinkedList.remove(3);
        MyLinkedList<Student> myCloneLinkedList =  myLinkedList.clone();

        for (int i = 0; i < myCloneLinkedList.size(); i++) {
            // ep kieu ve dang Student moi xu dung duoc phuong thuc getName();
            System.out.println( ((Student)myCloneLinkedList.get(i)).getName());
        }

        System.out.println(myLinkedList.contain(student3));
        System.out.println(myLinkedList.indexOf(student3));
    }
}
