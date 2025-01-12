package ArrayBasic;

public class OccuranceChecker {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,3,9,2,1,5,6,7,7,7,8,4,3,2,9,9,4,7,8};
		int n = array.length;
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]) {
				continue;//skip the values
			}
			int count =1;
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j]) {
					visited[j]=true;
					count++;
				}
			}
			System.out.println("The occurance of "+array[i]+" is "+count);
		}
		
	}
}
