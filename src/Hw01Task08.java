import java.util.Scanner;

public class Hw01Task08 {
    public static void main(String[] args) {
        final double DAYS_PER_MONTH = 30.0;
        int money;
        double budget_per_day;

        Scanner scanner = new Scanner(System.in);
        money = scanner.nextInt();

        budget_per_day = money / DAYS_PER_MONTH;

        System.out.println(budget_per_day);
    }
}
