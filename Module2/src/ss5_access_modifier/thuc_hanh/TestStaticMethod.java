package ss5_access_modifier.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change(); // calling the change method

        // create the object
        StaticMethod s1 = new StaticMethod(111,"Nam");
        StaticMethod s2 = new StaticMethod(222,"Hoang");
        StaticMethod s3 = new StaticMethod(333,"Tien");

        // calling the display method
        s1.display();
        s2.display();
        s3.display();

    }
}
