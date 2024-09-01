import java.util.* ;

public class Kadane {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
	
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length-1; i++) {
			 int Sum = 0;
			 for (int j = i; j < arr.length-1; j++) {
				 Sum = Sum + arr[i];
				 if(Sum>maxSum){
					 maxSum = Sum;
				 }
			 }
			
		}
		
		
return maxSum;
	}

 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		int[] arr = new int[n];
 }
}
