package FunctionVariablesAndTheirScope;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkMember(5);
	}
	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int a = 0, b = 1, c;
        while(a<n) {
            c = a + b;
            a = b;
            b = c;
        }
		if(a==n){
			return true;
		}
		else
		{
			return false;
		}
	}

}
