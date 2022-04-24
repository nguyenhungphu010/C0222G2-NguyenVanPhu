package ss15_xu_ly_ngoai_le_debug.bai_tap;

public class Triagle {
    private Double a;
    private Double b;
    private Double c;


    public Triagle(Double a, Double b, Double c) throws Exception {
        if (a<= 0|| b <= 0 || c <= 0 ){
            throw new TriangleException (" 3 canh nho hon hoac bang 0 ");
        }else if (a+b < c || a+c <b || c+b<a) {
            throw new  TriangleException ("tong 2 canh cua tam giac nho hon 2 canh con lai");
        }
        System.out.println("Triangle");
    }

}
