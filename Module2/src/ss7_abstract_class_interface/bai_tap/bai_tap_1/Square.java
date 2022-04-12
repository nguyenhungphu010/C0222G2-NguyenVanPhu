package ss7_abstract_class_interface.bai_tap.bai_tap_1;

public class Square extends Shape implements Resizeable {
    private double heigh = 1.0;

    public Square (){

    }
    public Square(String color, boolean filled, double heigh) {
        super(color, filled);
        this.heigh = heigh;
    }

    public Square(double heigh) {
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getArea(){
        return this.heigh * heigh;
    }

    @Override
    public String toString() {
        return "A Square with height="
                + heigh
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.heigh = heigh*(percent/100);
    }
}
