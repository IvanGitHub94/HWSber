package HW1_2;

import java.util.Scanner;

public class Hw01Task15 {
    public static void main(String[] args) {
        int count;
        String s;

        Scanner scanner = new Scanner(System.in);
            count = scanner.nextInt();

        if(count < 500) {
            s = "beginner";
        } else if (count < 1500) {
            s = "pre-intermediate";
        } else if (count < 2500) {
            s = "intermediate";
        } else if (count < 3500) {
            s = "upper-intermediate";
        } else {
            s = "fluent";
        }

        System.out.println(s);
    }
}
