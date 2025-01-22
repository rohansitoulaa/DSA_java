package ArrayBasic;

public class FrequencyChecker {
	//array sort function
	static int[] arraySort(int[] arr) { 
		for(int i = 0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
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
		int[] arr= {3, 5, 1, 6, 2, 4, 6, 1, 3, 2, 5, 4, 6, 3, 2,1};
		int[] sortedArr = arraySort(arr);
		int[] uniqueArr = new int[sortedArr.length];
		int index =0;
		
		//Sort an array
		   System.out.print("The sorted value is: ");
			for(int i=0;i<sortedArr.length;i++) {
				System.out.print(sortedArr[i]+" ");
			}
			System.out.println("\n");
		
			//Separate the unique values and the count the number of duplicates
		for(int i = 0;i<sortedArr.length;i++) {
			int count =1;
			while(i<sortedArr.length -1 && sortedArr[i]==sortedArr[i+1]) {
				i++;
				count++;
			}
			uniqueArr[index] = sortedArr[i];
			System.out.println("The repetion of element "+ uniqueArr[index] +" is "+count);
			index++;
		}
		System.out.print ("Unique elements of an array are: ");
		  for(int i = 0; i < index; i++)  {
	            System.out.print(uniqueArr[i] + " ");   
	    }
		
		
	}
}
