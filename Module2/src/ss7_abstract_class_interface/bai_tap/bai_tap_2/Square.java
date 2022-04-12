package ss7_abstract_class_interface.bai_tap.bai_tap_2;
import ss7_abstract_class_interface.bai_tap.bai_tap_1.Shape;
public class Square extends Shape implements Colorable{
    private double edge = 1.0;

    public Square (){

    }
    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea(){
        return this.edge*edge;
    }
    @Override
    public void howToColor() {
        System.out.println("Color for all sides");
    }
}
