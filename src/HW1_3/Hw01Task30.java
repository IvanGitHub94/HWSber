package HW1_3;

import java.util.Scanner;

public class Hw01Task30 {
    public static void main(String[] args) {
        String s;

        Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();
        int count = s.length();

        for (int i = 0; i < count; i++) {
            if(s.charAt(i) == ' ') {
                count = count - 1;
            }
        }
        System.out.println(count);
    }
}
