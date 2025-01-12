package ArrayBasic;

public class ArrayReverse {
 public static void main(String[] args) {
	 int[] array = {1,2,3,4,5,6,7};
	 int[] reverseArr = new int[array.length];
	 int reverseIndex = 0;
	 
	 for(int i =array.length-1;i>=0;i--) {
		 reverseArr[reverseIndex] = array[i];
		 reverseIndex++;
	 }
     System.out.print("Reversed Array: ");
     for (int num : reverseArr) {
         System.out.print(num + " ");
     }
}
}
