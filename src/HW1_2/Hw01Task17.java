package HW1_2;

import java.util.Scanner;

public class Hw01Task17 {
    public static void main(String[] args) {
        String s;

        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        System.out.println(s.substring(0, s.lastIndexOf(" ")));
        System.out.println(s.substring(s.lastIndexOf(" ") + 1));
    }
}
