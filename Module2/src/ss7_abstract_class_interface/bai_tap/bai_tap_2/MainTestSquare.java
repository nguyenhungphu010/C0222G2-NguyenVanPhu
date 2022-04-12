package ss7_abstract_class_interface.bai_tap.bai_tap_2;


import ss7_abstract_class_interface.bai_tap.bai_tap_1.Rectangle;

public class MainTestSquare {
    public static void main(String[] args) {
        Square[] square = new Square[2];
        square [0] = new Square();
        square [1] = new Square();

        for (Square x: square
             ) {
            if( x instanceof Square){
                System.out.println(x.getArea());
                x.howToColor();
                System.out.println(x.howToColor());

            }
        }
    }

}
