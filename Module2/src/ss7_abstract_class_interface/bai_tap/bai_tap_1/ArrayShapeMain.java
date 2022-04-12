package ss7_abstract_class_interface.bai_tap.bai_tap_1;

import java.sql.SQLOutput;

public class ArrayShapeMain {
    public static void main(String[] args) {
        int random = (int) (Math.random() *100);
        System.out.println("random percent" +random +"%");
        Shape [] shapes = new Shape[3];

        shapes [0] = new Circle();
        shapes [1] = new Rectangle();
        shapes [2] = new Square();

        for (Shape x: shapes
             ) {
            if( x instanceof Circle ){
                System.out.println("the Circle Area is: " + ((Circle) x).getArea() );
                ((Circle)x).resize(random);
                System.out.println("the Circle Area is: " + ((Circle) x).getArea() );
            }
            else if (x instanceof Rectangle){
                System.out.println("the Rectangle's Area is: " + (((Rectangle) x).getArea()));
                ((Rectangle)x).resize(random);
                System.out.println("the Rectangle's Area is: " + (((Rectangle) x).getArea()));
            }
            else if(x instanceof Square){
                System.out.println("the Square Area is: " + ((Square) x).getArea());
                ((Square)x).resize(random);
                System.out.println("the Square Area is: " + ((Square) x).getArea());
            }
        }
    }
}
