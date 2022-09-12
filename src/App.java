import java.util.Scanner;
//troong oke roi nhung con 1 luopt test deo nop
public class App {

    /**
     * a.
     */
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int x = Math.min(a, b);
        while (x > 0) {
            if (a % x == 0 && b % x == 0) {
                return x;
            }
            x--;
        }

        return 1;
    }
    //a
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.print(gcd(a, b));
    }
}
