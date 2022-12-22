package HW1_2;

import java.util.Scanner;

public class Hw01Task23 {
    public static void main(String[] args) {
        String s;
        int cost;

        Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();
            cost = scanner.nextInt();

            if (s.contains("iphone") || s.contains("samsung")) {
                if(cost >= 50_000 && cost <= 120_000) {
                    System.out.println("Можно купить");
                } else {
                    System.out.println("Не подходит");
                }
            } else System.out.println("Не подходит");
    }
}
