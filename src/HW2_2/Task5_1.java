package HW2_2;
import java.util.Scanner;

/*
На вход подается число N — количество строк и столбцов матрицы.
Затем передается сама матрица, состоящая из натуральных чисел.

Необходимо вывести true, если она является симметричной относительно побочной диагонали, false иначе.
Побочной диагональю называется диагональ, проходящая из верхнего правого угла в левый нижний.
*/


public class Task5_1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int lengthOfParts = (n * (n - 1)) / 2;
        // размер по количеству чисел в каждой полвине матрицы
        // по обе стороны от диагональной линии из верхнего правого угла к нижнему левому
        // например, если будет матрица такая:
            /*
            570 190 160 710 111
            141 790 187 111 710
            141 160 111 187 160
            100 111 160 790 190
            111 100 141 141 570

            111 - линия
            слева от нее 10 чисел и справа тоже
            количество этих чисел можно вычислить по формуле (n * (n - 1)) / 2
            при n = 5
            это 4 + 3 + 2 + 1
            */
        int[] aArr = new int[lengthOfParts];
        int[] bArr = new int[lengthOfParts];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int a = n - 1;
        int countA = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < a; j++) {
                aArr[countA] = matrix[i][j];
                countA++;
            }
            a--;
        }

        int f = 0;
        int c = n - 1;
        int countB = 0;
        for (int v = c; v > 0; v--) {
            for (int i = n - 1; i > f; i--) {
                bArr[countB] = matrix[i][v];
                countB++;
            }
            f++;
            c--;
        }

        boolean z = true;
        for (int i = 0; i < aArr.length; i++) {
            if(aArr[i] != bArr[i]) {
                z = false;
                break;
            }
        }
        System.out.println(z);
    }
}
