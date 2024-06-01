package SearchingAndSorting;

public class countsmall {
	public static void main(String[] args) {
		int a[]= {0,2,3};
		int b[]= {1,5};
		countS(2,3,a,b);
	}
	public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int count=0,len=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(b[j]<=a[i]){
                    count++;
                }
            }
            len++;
        }  
        int count1=0,len1=0,k=0;
        int arr[]=new int[len];
        for(int i=0;i<n;i++){
            count1=0;
            for(int j=0;j<m;j++){
                if(b[j]<=a[i]){
                    count1++;
                    arr[k]=count1;                    
                }

            }
            len1++;
            k++;
        }
        return arr;
    }

}
