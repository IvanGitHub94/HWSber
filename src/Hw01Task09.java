import java.util.Scanner;

public class Hw01Task09 {
    public static void main(String[] args) {
        int fullBudget;
        int onePersonBudget;
        int countOfPersons;

        Scanner scanner = new Scanner(System.in);
        fullBudget = scanner.nextInt();
        onePersonBudget = scanner.nextInt();

        countOfPersons = fullBudget / onePersonBudget;
        System.out.println(countOfPersons);
    }
}
