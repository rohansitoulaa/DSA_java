package ArrayBasic;

public class SumOfAllElements {
	public static void main(String[] args) {
		int[] array = {1, 0, 2, 3, 0, 5, 4, 5, 6, 0, 7, 8, 0, 5, 3, 2, 3, 0};
		int sum = 0;
		for(int i =0;i<array.length;i++) {
			sum += array[i];
		}
		System.out.println("The sum of all array elements is  "+ sum);
	}
	
}
