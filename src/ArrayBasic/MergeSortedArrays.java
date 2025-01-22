//code quality :- above average
package ArrayBasic;

public class MergeSortedArrays {
	static int[] sortAnArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
public static void main(String[] args) {
	int[] arr = {1, 3, 5, 2, 6, 8, 4, 7, 0, 9};
	int[] arr2 = {15, 12, 18, 20, 13, 17, 11, 14, 19, 16};
	int[] newArray = new int[arr.length + arr2.length];
	for(int i=0;i<newArray.length;i++) {
		if(i<arr.length) {
			newArray[i] = arr[i];
		}
		else {
			newArray[i] = arr2[i-arr.length];
		}
	}
	int[] newSortedArray = sortAnArray(newArray);
	
	for(int arrs:newSortedArray) {
		System.out.print(" "+arrs);
	}
}
}
