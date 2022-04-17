package ss10_danh_sach.bai_tap;

public class TestMylist {
    public static class Student {
        private int id;
        private String name;

        public Student() {
            // ko co tham so
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

    public static void main(String[] args) {
        Student student1 = new Student(10, "Hung");
        Student student2 = new Student(10, "Phu");
        Student student3 = new Student(10, "long");
        Student student4 = new Student(10, "Chau");
        Student student5 = new Student(10, "Tuan");
        Student student6 = new Student(10, "Toan");
        Student student7 = new Student(10, "Love");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> myNewStudentList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        studentMyList.add(student6);
//        studentMyList.add(student7, 2);
//        studentMyList.clear();
        System.out.println(studentMyList.size());
        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println(studentMyList.get(2).getName());
        System.out.println(studentMyList.indexOf(student3));
        System.out.println(studentMyList.indexOf(student7));
        System.out.println(studentMyList.containing(student7));
        System.out.println(studentMyList.containing(student2));
// Kiem tra phuong thuc Clone;
        myNewStudentList = studentMyList.clone();

        for (int i = 0; i <myNewStudentList.size()  ; i++) {
            System.out.println(myNewStudentList.get(i).getName());
        }
// kiem tra phuong thuc remove.
        Student student = myNewStudentList.remove(1);
        System.out.println("do tuong dc remove:  "+student.getName());
    }
}


