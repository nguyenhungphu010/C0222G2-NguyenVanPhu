package ss6_ke_thua.bai_tap;

public class Point3D extends Poind2D{
    private float z ;

    Point3D (){
        // no parameter
    }
    Point3D (float x , float y, float z){
        super(x,y);
        this.z = z ;
    }
    public float getZ(){
        return this.z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array3D = new float[3];
        array3D[0] = super.getX();
        array3D[1] = super.getY();
        array3D[2] = z;
        return array3D;
    }
    @Override
    public String toString (){
        return "Point with 3 Dimension has {"
                + " z is " + z
                + "the subclass of "
                + super.toString();

    }
}
