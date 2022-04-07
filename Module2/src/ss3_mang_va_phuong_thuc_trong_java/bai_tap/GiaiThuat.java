package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class GiaiThuat {
    public static void main(String[] args) {
        int h = 6;
        for (int i = 2; i <= h; i++) {
            for (int k = i; k <= h; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                if (j == 1 || (j == (i * 2) - 1)) {
                    System.out.printf("%d", i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lộn ngược
        for (int i = 5; i >= 2; i--) {
            for (int j = i; j <= h - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i * 2; k > 0; k--) {
                if (k == 1 || (k == (i * 2) - 1)) {
                    System.out.printf("%d", i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
