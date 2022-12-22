package HW1_2;

import java.util.Scanner;

public class Hw01Task22 {
    public static void main(String[] args) {
        String mailPackage, message;

        Scanner scanner = new Scanner(System.in);
            mailPackage = scanner.nextLine();

        if(mailPackage.contains("камни!") &&
                mailPackage.contains("запрещенная продукция")) {

            message = "в посылке камни и запрещенная продукция";

        } else if (mailPackage.startsWith("запрещенная продукция") ||
                mailPackage.endsWith("запрещенная продукция")) {

            message = "в посылке запрещенная продукция";

        } else if (mailPackage.startsWith("камни!") ||
                mailPackage.endsWith("камни!")) {

            message = "камни в посылке";

        } else {
            message = "все ок";
        }
        System.out.println(message);
    }

    /*mailPackage.contains("камни в посылке") &&
            mailPackage.contains("запрещенная продукция"*/
}
