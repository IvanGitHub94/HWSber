package HW2_1;

import java.util.Scanner;

public class Hw02Task09 {
    public static void main(String[] args) {
        int length;
        String gemini = "";
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        for (String s : arr) {
            for (String k : arr) {
                if(s.equals(k)) {
                    count++;
                }
            }
            if(count > 1) {
                gemini = s;
                break;
            }
            count = 0;
        }
        System.out.println(gemini);
    }
}
