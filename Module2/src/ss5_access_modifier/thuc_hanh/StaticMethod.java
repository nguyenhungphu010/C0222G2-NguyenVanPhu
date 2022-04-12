package ss5_access_modifier.thuc_hanh;

public class StaticMethod {
    private int rollno;
    private String name;
    // creat the static variable;
    private static String college = "BBDIT";

    // constructor to initialize the variables
    StaticMethod (int r, String n ){
        rollno = r;
        name = n ;
    }

    // static method to change the value of static variables;
     static void change(){
        college = "CODE GYM";
     }

     // method to display the value ;
    void display (){
        System.out.println(rollno + " "+ name + " " + college );
    }
}
