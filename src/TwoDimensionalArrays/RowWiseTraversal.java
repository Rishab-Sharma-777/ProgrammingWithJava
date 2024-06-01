package TwoDimensionalArrays;

public class RowWiseTraversal {
	public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int rows = a.length;
			int cols = a[0].length;
            int[] arr=new int[rows*cols];
            int k=0;
			for(int i = 0; i < rows; i++){
				for(int j = 0; j < cols; j++){
					//System.out.print(a[i][j] + " ");
                    arr[k]=a[i][j];
                    k++;
				}
				//System.out.println();
			}
            return arr;


    }
	}
