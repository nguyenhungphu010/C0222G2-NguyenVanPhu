package ss6_ke_thua.bai_tap;

public class Point {
    float x;
    float y;

    public Point() {

    }

    public Point(float x, float y) {
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

    public float[] getXY() {
        float[] arrayPoint = new float[2];
        arrayPoint[0] = x;
        arrayPoint[1] = y;
        return arrayPoint;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
