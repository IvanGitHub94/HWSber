package HW2_1;

import java.util.Scanner;

    /**
         Создать программу генерирующую пароль.
         На вход подается число N — длина желаемого пароля.
         Необходимо проверить, что N >= 8,
         иначе вывести на экран "Пароль с N количеством символов небезопасен" (подставить вместо N число)
         и предложить пользователю еще раз ввести число N.

         Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и вывести его на экран.
         В пароле должны быть:
         - заглавные латинские символы
         - строчные латинские символы
         - числа
         - специальные знаки(_*-)
    */

public class Hw02Task11 {
    public static void main(String[] args) {
        System.out.println("Ваш пароль: " + generatePassword(enterAndCheckPassLength()) );
    }

    /**
        В данном методе пользователем задается длина пароля (больше или равная 8).
        Введенное значение проверяется.
        Запрос на ввод происходит до тех пор, пока не будет введено корректное значение.
    */
    public static int enterAndCheckPassLength() {
        int len;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину генерируемого пароля: ");

        do {
            len = scanner.nextInt();
            if(len < 8) {
                System.out.println("Пароль с " + len + " количеством символов небезопасен.\n" +
                        "Введите число больше или равное 8:");
            }
            else break;
        } while (true);

        return len;
    }

    /**
        Данный метод генерирует массив char для будущего преобразования в строку пароля.
            1. Создается массив arr на количество символов в размере passLength;
            2. Создается массив specialSymbol для спец.символов (3 символа по заданию);
            3. Первым четырем ячейкам присваиваются значения сразу, так как в пароле должны быть:
                - минимум 1 заглавная латинская буква (arr[0]);
                - минимум 1 строчная латинская буква (arr[1]);
                - минимум 1 цифра (arr[2]);
                - минимум 1 спец.символ из набора в условии задачи (arr[3]).
            4. Создается вспомогательная переменная choose
                для генерации случайных символов в остальных ячейках массива (диапазон от 0 до 3 включительно);
            5. В зависимости от случайного значения choose происходит генерация символа соответствующей категории
                и присваивается в ячейку массива arr;
            6. Вызывается метод shuffle, с arr в качестве параметра.
    */

    public static String generatePassword(int passLength) {

        char[] arr = new char[passLength];

        char[] specialSymbol = new char[]{'_', '*', '-'};

        arr[0] = (char)( (int)(65 + Math.random() * 26) ); // Генерация заглавной латинской буквы
        arr[1] = (char)( (int)(97 + Math.random() * 26) ); // Генерация строчной латинской буквы
        arr[2] = (char)( (int)(48 + Math.random() * 10) ); // Генерация цифры
        arr[3] = specialSymbol[(int)(Math.random() * 3)]; // Генерация спец.символа

        int choose;
        for (int i = 4; i < arr.length; i++) {
            choose = (int)(Math.random() * 4);
            switch (choose) {
                case 0 -> arr[i] = (char) ((int) (65 + Math.random() * 26));
                case 1 -> arr[i] = (char) ((int) (97 + Math.random() * 26));
                case 2 -> arr[i] = (char) ((int) (48 + Math.random() * 10));
                case 3 -> arr[i] = specialSymbol[(int) (Math.random() * 3)];
            }
        }

        shuffle(arr);

        return new String(arr);
    }

    /**
        Данный метод перемешивает элементы массива, который передается как параметр (generateChars).
        Так как первые четыре символа в массиве генерируются со строгой привязкой к категориям
        (минимум 1 заглавная буква, минимум 1 строчная и т. д.), необходимо переставить их на случайные позиции.
        Иначе эти первые четыре символа в пароле будут всегда предсказуемыми (относительно).
    */
    public static void shuffle(char[] generateChars) {

        for(int i = 0; i < generateChars.length; i++) {
            int index = (int) (Math.random() * generateChars.length);
            char a = generateChars[index];
            generateChars[index] = generateChars[i];
            generateChars[i] = a;
        }

    }
}
