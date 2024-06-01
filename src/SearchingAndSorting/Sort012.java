package SearchingAndSorting;

public class Sort012 {
	public static void main(String args[]) {
		int arr[]= {2,1,0,0,2,0};
		Sort012 sort=new Sort012();
		sort.sort012(arr);
	}
	public static void sort012(int[] arr){
    	//Your code goes here
       int i=0;
        int nextZeros = 0;
        int nextTwo = arr.length - 1;
    	while(i<=nextTwo){
            if(arr[i]==0){
                int temp = arr[nextZeros];
                arr[nextZeros] = arr[i];
                arr[i] = temp;
                i++;
                nextZeros++;
            }else if(arr[i]==2){
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            }else{
                i++;
            }
        }
           }

}
