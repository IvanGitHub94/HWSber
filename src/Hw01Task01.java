import java.util.Scanner;

public class Hw01Task01 {
    public static void main(String[] args) {
        double volume;
        int radius;

        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();

        volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);

        System.out.println(volume);
    }
}
