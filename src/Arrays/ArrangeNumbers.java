package Arrays;

public class ArrangeNumbers {
	public static void arrange(int[] arr, int n) {
        int right=n-1;
        int left=0;
        boolean flag=true;
    	//Your code goes here
        for(int i=1;i<=n;i++){
            if(flag){
                arr[left]=i;
                left++;
                flag=false;
            }
            else{
                 arr[right]=i;
                 right--;
                 flag=true;
            }
        }
    }
	public static void main(String[] args) {
		int n=5;
		int arr[]= new int[n];
		arrange(arr,n);
	}

}
