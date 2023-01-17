package HW2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Hw02Task12 {
    public static void main(String[] args) {
        // Ввод данных
            int length;

            Scanner scanner = new Scanner(System.in);
            length = scanner.nextInt();

            int[] array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        // Ввод данных

        int[] res = new int[array.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < res.length; i++) {
            res[i] = array[i] * array[i];
            if(res[i] > max) {
                max = res[i];
            }
        }

        sortArrayOn(res, max);
    }

    /**
        Реализация алгоритма сортировки подсчетом, который имеет сложность O(n) - линейное время.
     */
    public static void sortArrayOn(int[] array, int max) {

        int[] tempArray = new int[max + 1];

        for (int value : array) {
            tempArray[value]++;
        }

        // Вставкак элементов в исходный массив
        int b = 0;
        for (int i = 0; i < max + 1; i++){
            for (int j = 0; j < tempArray[i]; j++) {
                array[b++] = i;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
