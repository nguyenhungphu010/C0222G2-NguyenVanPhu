package ss5_access_modifier.bai_tap;

public class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Hanh");
        System.out.println(s1.getName());
        s1.setClass("C03");
        System.out.println(s1.getClasses());
    }
}
