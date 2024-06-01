package TwoDimensionalArrays;

public class TotalSumOntheBoundariesandDiagonals {
	public static void totalSum(int[][] mat) {
		//Your code goes here
		int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }

        System.out.println(sum);
	}

}
