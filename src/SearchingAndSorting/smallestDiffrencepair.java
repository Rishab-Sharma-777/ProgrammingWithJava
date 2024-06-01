package SearchingAndSorting;

public class smallestDiffrencepair {
	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int diff=Math.abs(arr1[i]-arr2[j]);
                if(diff<mindiff){
                    mindiff=diff;
                }
            }
        }
        return mindiff;
    }
}
