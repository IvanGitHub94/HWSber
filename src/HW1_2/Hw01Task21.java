package HW1_2;

import java.util.Scanner;

public class Hw01Task21 {
    public static void main(String[] args) {
        String s;
        String message;
        char temp;
        int countOfBigLetters = 0;
        int countOfSmallLetters = 0;
        int countOfNumbers = 0;
        int countOfSymbols = 0;

        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        if(s.length() < 7) {
            message = "пароль не прошел проверку";
        } else {
            for (int i = 0; i < s.length(); i++) {
                temp = s.charAt(i);
                if(temp >= 65 && temp <= 90) countOfBigLetters++;
                else if (temp >= 97 && temp <= 122) countOfSmallLetters++;
                else if (temp >= 48 && temp <= 57) countOfNumbers++;
                else countOfSymbols++;
            }
            message = (countOfBigLetters == 0 ||
                    countOfSmallLetters == 0 ||
                    countOfNumbers == 0 ||
                    countOfSymbols == 0) ?
            "пароль не прошел проверку" : "пароль надежный";
        }
        System.out.println(message);
    }
}
