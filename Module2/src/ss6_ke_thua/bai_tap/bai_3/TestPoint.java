package ss6_ke_thua.bai_tap;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3,5);
        System.out.println(point);

        MoveablePoint pointMove = new MoveablePoint();
        System.out.println(pointMove);

        pointMove = new MoveablePoint(3,4,5,6);
        System.out.println(pointMove);
    }
}
