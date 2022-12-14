import java.util.Scanner;

public class Hw01Task07 {
    public static void main(String[] args) {
        int number;
        int first;
        int second;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        first = number % 10;
        second = number / 10;

        System.out.print(first);
        System.out.println(second);
    }
}
