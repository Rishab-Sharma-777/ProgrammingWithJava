package Arrays;

public class PairSum {
	public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int numpairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    numpairs++;
                }
            }
        }
        return numpairs;
    }
}
