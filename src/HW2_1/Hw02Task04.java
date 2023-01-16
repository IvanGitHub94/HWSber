package HW2_1;

public class Hw02Task04 {
    public static void main(String[] args) {
        int count = 0;
        int gemini = -1000;
        int tempCount = 0;

        int[] arr = new int[]{7, 0, 7, 10, 26, 26, 26, 7, 1, 7, 10, 0, 26};


        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = 1000;
        }

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];

            if (j == gemini) continue;
            else {
                for (int k : arr) {
                    if (j == k) count++;
                }
            }
            gemini = j;

            for (int e : temp) {
                if(e == j) {
                    tempCount = 1;
                    break;
                }
                else tempCount = 0;
            }
            if (tempCount == 0) System.out.println(count + " " + j);

            temp[i] = arr[i];

            count = 0;
        }

        for (int a : temp) {
            System.out.print(a + " ");
        }

    }
}
