package ArrayBasic;

public class RotateByKPosition {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int position = 4; 

        if (position > 0 && position < array.length) {
            int[] temp = new int[position];
            
            for (int i = 0; i < position; i++) {
                temp[i] = array[i];
            }
            
            for (int i = position; i < array.length; i++) {
                array[i - position] = array[i];
            }
            
            for (int i = 0; i < temp.length; i++) {
                array[array.length - position + i] = temp[i];
            }
            
        }

        System.out.print("After rotating by " + position + " positions, the array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
