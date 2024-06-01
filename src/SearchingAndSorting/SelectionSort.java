package SearchingAndSorting;

public class SelectionSort {
	    public static void selectionSort(int[] arr) {
	        //Your code goes here
	        for(int i=0;i<arr.length-1;i++){
	            int min=arr[i],minindex=i;
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[j]<min){
	                    min=arr[j];
	                    minindex=j;
	                }
	            }
	            int temp=arr[i];
	            arr[i]=arr[minindex];
	            arr[minindex]=temp;
	        }
	    }
	}

