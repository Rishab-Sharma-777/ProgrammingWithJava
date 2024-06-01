package Test2;

public class Print2DArray {
	public static void print2DArray(int input[][]) {
		int rows=input.length;
		int cols=input[0].length;
		int n=cols;
		// Write your code here
		for(int i=0;i<rows;i++){
			for(int k=n;k>0;k--){
			for(int j=0;j<cols;j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
			}
			n--;
		}
	}
}
