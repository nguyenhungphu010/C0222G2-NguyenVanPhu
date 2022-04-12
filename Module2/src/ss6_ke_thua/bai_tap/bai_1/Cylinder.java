package ss6_ke_thua.bai_tap;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius, String color ){
        super(radius,color);
        this.height = height;

    }
    public double getVolume(){
        return getRadius()*getRadius()*Math.PI*height;
    }
    public String toString(){
        return "Cylinder has the hieght of "
                + height
                + " and the volume is "
                + getVolume()
                + super.toString();
    }
}
