package ArrayBasic;

public class RemoveDupliates {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,5,6,7,4,3,5,7,7};
		boolean[] duplicates = new boolean[array.length];
		int[] newArray = new int[array.length];
		int newArrIndex = 0;
		for(int i=0;i<array.length;i++) {
			if(duplicates[i]) {
				continue;
			}
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						duplicates[i] = true;
					}
				}
		}
		for(int i=0;i<duplicates.length; i++) {
			if(!duplicates[i]) {
				newArray[newArrIndex] = array[i];
				newArrIndex++;
			}
		}
		System.out.print("Unique values are: ");
		for(int i=0;i<newArrIndex;i++) {
			System.out.print(" " +newArray[i]);
		}
	}
	
}
