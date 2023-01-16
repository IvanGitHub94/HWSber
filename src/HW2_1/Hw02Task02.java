package HW2_1;

import java.util.Scanner;

public class Hw02Task02 {
    public static void main(String[] args) {
        int[] arr1 = completeArrays();
        int[] arr2 = completeArrays();
        System.out.println(compareArrs(arr1, arr2));
    }

    public static int[] completeArrays() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static boolean compareArrs(int[] array1, int[] array2) {
        boolean b = true;

        if(array1.length != array2.length) {
            b = false;
        }
        else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}
