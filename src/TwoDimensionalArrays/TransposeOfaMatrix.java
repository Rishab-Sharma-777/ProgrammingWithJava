package TwoDimensionalArrays;

public class TransposeOfaMatrix {
	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
        int[][] result = new int[n][m]; // Initialize the result array
        // Traverse the matrix column-wise
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = mat[i][j]; // Store the current element in the result array
            }
        }

        return result;
	}
}
