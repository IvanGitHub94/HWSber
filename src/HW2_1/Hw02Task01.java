package HW2_1;

import java.util.Scanner;

public class Hw02Task01 {
    public static void main(String[] args) {
        int length;

        Scanner scanner = new Scanner(System.in);
            length = scanner.nextInt();
        double[] array = new double[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println(avg(array));
    }

    public static double avg(double[] array) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
