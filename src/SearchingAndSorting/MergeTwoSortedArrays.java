package SearchingAndSorting;

public class MergeTwoSortedArrays {
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
               arr3[k]=arr2[j];
                j++;
                k++;
 
            }
            
        }
        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }

}
