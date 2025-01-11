package ArrayBasic;


public class MinMaxElement {
public static void main(String[] args) {
	int[] array = {1,2,3,4,5,6,7,8,91,0,3,4,56,6,4,5,4,5,6};
	int min = array[0];
	int max = array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]<min) {
			min = array[i];
		}
		if(array[i]>max) {
			max = array[i];
		}
	}
	System.out.println("The maximum value is :"+max);
	System.out.println("and the minimum value is: "+min);
  }	
}
