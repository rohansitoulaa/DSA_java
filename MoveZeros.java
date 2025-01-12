package ArrayBasic;

public class MoveZeros {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 0, 5, 4, 5, 6, 0, 7, 8, 0, 5, 3, 2, 3, 0};

        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                for (int j = i; j < n - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                n--;
                i--;
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
