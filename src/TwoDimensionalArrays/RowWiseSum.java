package TwoDimensionalArrays;

public class RowWiseSum {
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
	if (mat.length == 0) {
            return;
        }
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum = sum + mat[i][j];
            }
            System.out.print(sum + "\t");
            sum = 0;
        }
        System.out.println();
    }
}
