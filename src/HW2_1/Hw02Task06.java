package HW2_1;

import java.util.Scanner;

public class Hw02Task06 {
    public static void main(String[] args) {
        String[] morze = new String[]{".-", "-...", ".--", "--.", "-..", ".", "...-",
                "--..", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", ".-.", "...", "-", "..-", "..-.",
                "....", "-.-.", "---.", "----", "--.-", "--.--",
                "-.--", "-..-", "..-..", "..--", ".-.-"};

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] letters = s.toCharArray();

        int sum = 0;
        for (int i = 0; i < letters.length; i++) {
            sum = (int) letters[i] - 1040;
            System.out.print(morze[sum] + " ");
        }
    }
}
