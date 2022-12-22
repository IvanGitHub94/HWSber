package HW1_2;

import java.util.Scanner;

public class Hw01Task20 {
    public static void main(String[] args) {
        int a, b, c, max;

        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            max = a > b ? a : (b > c ? b : c);
        //System.out.println(max);

        System.out.println(max == a ?
                b + c > a : max == b ?
                a + c > b : max == c ?
                a + b > c : false);

            /*switch (max) {
                case a:
                    System.out.println(b + c > a);
                    break;
                case b:
                    System.out.println(a + c > b);
                    break;
                case c:
                    System.out.println(b + a > c);
                    break;
            }*/
    }
}
