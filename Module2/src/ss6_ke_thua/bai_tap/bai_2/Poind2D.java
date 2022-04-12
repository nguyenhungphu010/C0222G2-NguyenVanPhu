package ss6_ke_thua.bai_tap;

public class Poind2D {
    private float x;
    private float y;

    public Poind2D() {

    }

    public Poind2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(float x, float y) {
        float[] array2D = new float[2];
        array2D[0] = x;
        array2D[1] = y;
        return array2D;
    }

    @Override
    public String toString() {
        return "Point 2 Dimension has {"
                + " x is"
                + x
                + " y is"
                + y
                + " }";
    }
}
