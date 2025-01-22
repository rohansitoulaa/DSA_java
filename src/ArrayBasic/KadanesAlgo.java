//code quality :- optimum
package ArrayBasic;

public class KadanesAlgo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5,-2,-4,7,6,-3};
		int sum=0, maximum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			if(sum>maximum) {
				maximum = sum;
			}
			
			if(sum<0) {
				sum = 0;
			}
		}
		System.out.println("The maximum contigious subarray :"+maximum);
	}
}
