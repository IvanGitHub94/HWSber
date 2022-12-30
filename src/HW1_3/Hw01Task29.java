package HW1_3;

import java.util.Scanner;

public class Hw01Task29 {
    public static void main(String[] args) {
        int n;
        int countOfNominal = 4;

        Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

        System.out.print( n / (int)Math.pow(2, countOfNominal - 1) );
        for (int i = countOfNominal - 2; i >= 0 ; i--) {
            /*if(i == countOfNominal - 1) {
                System.out.print( n / (int)Math.pow(2, i) );
            } else {*/
                System.out.print(" " + n / (int) Math.pow(2, i) % 2);
            //}
        }
    }
}
