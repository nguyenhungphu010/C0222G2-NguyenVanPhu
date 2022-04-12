package ss6_ke_thua.bai_tap;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){

    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y,float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] container = new float[2];
        container[0] = xSpeed;
        container[1] = ySpeed;
        return container;
    }
    MoveablePoint move(){
        super.x += xSpeed;
        super.y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint: " + super.toString() +", speed= ("+xSpeed+", "+ ySpeed+")";
    }
}
