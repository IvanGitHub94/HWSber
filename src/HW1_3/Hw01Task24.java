package HW1_3;

public class Hw01Task24 {
    public static void main(String[] args) {
        int number = 1;

        while (number < 10) {
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " x " + i + " = " + i * number);
            }
            number++;
        }
    }
}
