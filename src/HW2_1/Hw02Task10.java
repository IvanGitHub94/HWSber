package HW2_1;

import java.util.Scanner;

/**
 Необходимо реализовать игру. Алгоритм игры должен быть записан в отдельном методе.
 В методе main должен быть только вызов метода с алгоритмом игры.

 Условия следующие:
 Компьютер «загадывает» (с помощью генератора случайных чисел) целое число M в промежутке от 0 до 1000 включительно.
 Затем предлагает пользователю угадать это число. Пользователь вводит число с клавиатуры.
 Если пользователь угадал число M, то вывести на экран "Победа!".
 Если введенное пользователем число меньше M, то вывести на экран "Это число меньше загаданного."
 Если введенное число больше, то вывести "Это число больше загаданного."
 Продолжать игру до тех пор, пока число не будет отгадано или пока не будет введено любое отрицательное число.
 */
public class Hw02Task10 {

    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        int targetNumber = randomNumber();
        int userNumber;

        System.out.println("Отгадайте число от 0 до 1000 (включительно),\n" +
                "или введите отрицательное число для выхода:");

        Scanner scanner = new Scanner(System.in);

        do {
            userNumber = scanner.nextInt();

            if(userNumber == targetNumber) {
                System.out.println("Победа!");
                System.exit(0);
            } else if (userNumber < 0) {
                System.out.println("Выход из программы...");
                System.exit(0);
            } else if (userNumber <= 1000){
                if(userNumber < targetNumber) {
                    System.out.println("Это число меньше загаданного.");
                }
                else {
                    System.out.println("Это число больше загаданного.");
                }
            } else System.out.println("Некорректное значение. Введите число от 0 до 1000 (включительно),\n" +
                    "или отрицательное число для выхода:");
        } while (true);
    }

    public static int randomNumber() {
        return (int) (Math.random() * 1001);
    }
}
