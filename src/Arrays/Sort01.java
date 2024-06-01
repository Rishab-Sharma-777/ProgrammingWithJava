package Arrays;

public class Sort01 {
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int nextZeroes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZeroes];
                arr[nextZeroes]=arr[i];
                arr[i]=temp;
                nextZeroes++;
            }
        }
        }
}
