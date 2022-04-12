package ss6_ke_thua.thuc_hanh;

public class Shape {
    public String color = "green";
    public boolean filled = true;
    public Shape(){
        // khong co tham so
    }
    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f ;
    }
   public String getColor(){
        return color ;
   }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return " A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? " filled" : " not filled");
    }

}
