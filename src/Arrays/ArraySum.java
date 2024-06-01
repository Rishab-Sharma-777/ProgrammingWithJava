package Arrays;

public class ArraySum {
	public static int sum(int[] arr) {
		int sum=0;
		//Your code goes here
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {12,45,46,98,23};
		sum(arr);
	}
}
