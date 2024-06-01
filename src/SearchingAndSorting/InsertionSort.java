package SearchingAndSorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }


	}}
