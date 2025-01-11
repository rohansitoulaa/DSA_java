package ArrayBasic;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,91,0,3,4,56,6,4,5,4,5,6,60};
		int max = array[0];
		int secMax = array[0];
		for(int i =0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		for(int i =0; i<array.length;i++) {
			if(array[i]<max) {
				if(secMax <array[i]) {
					secMax = array[i];
				}
			}
		}
		System.out.println("The max value is: "+max);
		System.out.println("The second max value is: "+secMax);
	}
}
