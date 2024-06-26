package TwoDimensionalArrays;

public class QueryAndMatrix {
	public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Write your code here.
		int k = 0;
        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';
            if (queryType == 2) {
                k++;
            }
        }
        int[] result = new int[k];
        int j = 0;
        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';
            char dimensions = query.charAt(1);
            int index = query.charAt(2) - '0';
            if (queryType == 1) {
                if (dimensions == 'R') {
                    flipRow(mat, index, n);
                } else if (dimensions == 'C') {
                    flipColumn(mat, index, m);
                }
            } else if (queryType == 2) {
                int count = 0;
                if (dimensions == 'R') {
                    count = countZerosInRow(mat, index, n);
                } else if (dimensions == 'C') {
                    count = countZerosInColumn(mat, index, m);
                }
                result[j] = count;
                j++;
            }
        }
        return result;
    }

    private static void flipRow(int[][] matrix, int rowIndex, int n) {
        for (int j = 0; j < n; j++) {
            matrix[rowIndex][j] ^= 1;
        }
    }

    private static void flipColumn(int[][] matrix, int colIndex, int m) {
        for (int i = 0; i < m; i++) {
            matrix[i][colIndex] ^= 1;
        }
    }

    private static int countZerosInRow(int[][] matrix, int rowIndex, int n) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (matrix[rowIndex][j] == 0) {
                count++;
            }
        }
        return count;
    }

    private static int countZerosInColumn(int[][] matrix, int colIndex, int m) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (matrix[i][colIndex] == 0) {
                count++;
            }
        }
        return count;
	}
}
