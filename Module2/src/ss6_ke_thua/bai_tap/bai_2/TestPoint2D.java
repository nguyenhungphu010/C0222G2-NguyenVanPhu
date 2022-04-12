package ss6_ke_thua.bai_tap;

import java.security.cert.PolicyNode;

public class TestPoint2D {
    public static void main(String[] args) {
        Poind2D point2 = new Poind2D();
        System.out.println(point2);
        point2 = new Poind2D(5,7 );
        System.out.println(point2);

        Point3D point3 = new Point3D();
        System.out.println(point3);

        point3 = new Point3D(4,5,6);
        System.out.println(point3);

    }
}
