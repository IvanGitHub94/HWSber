import java.util.Scanner;

public class Hw01Task04 {
    public static void main(String[] args) {
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        int count;
        int resHours;
        int resMinutes;

        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        resHours = count / SECONDS_PER_MINUTE / MINUTES_PER_HOUR;
        resMinutes = count / SECONDS_PER_MINUTE % MINUTES_PER_HOUR;

        System.out.println(resHours + " " + resMinutes);
    }
}
