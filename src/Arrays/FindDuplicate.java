package Arrays;

public class FindDuplicate {
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++){
              int j;
              for(j=i+1;j<arr.length;j++)
              {
                  if(arr[i]==arr[j]){
                      return arr[i];
                  }
              }
              
        }
        return Integer.MAX_VALUE;

    }

}
