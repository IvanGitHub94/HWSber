package HW1_2;

import java.util.Scanner;

public class Hw01Task16 {
    public static void main(String[] args) {
        String s;

        Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();

        System.out.println(s.substring(0, s.indexOf(" ")));
        System.out.println(s.substring(s.indexOf(" ") + 1));
    }
}
