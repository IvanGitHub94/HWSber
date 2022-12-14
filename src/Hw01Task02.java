import java.util.Scanner;

public class Hw01Task02 {
    public static void main(String[] args) {
        int a;
        int b;
        double result;

        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();

        result = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);

        System.out.println(result);
    }
}
