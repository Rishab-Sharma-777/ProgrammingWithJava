package FunctionVariablesAndTheirScope;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFahrenheitTable(0,100,20);
	}
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		 while(start<=end){
			 int ans=((start-32)*5)/9;
			 System.out.println(start+" "+ans);
			 start=start+step;

		 }
		
	}

}
