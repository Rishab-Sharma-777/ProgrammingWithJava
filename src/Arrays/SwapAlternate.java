package Arrays;

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
        int temp=0;
    	//Your code goes here
        for(int i=0;i<arr.length-1;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
	public static void main(String[] args) {
		int n=5;
		int arr[]= new int[n];
		swapAlternate(arr);
	}
}
