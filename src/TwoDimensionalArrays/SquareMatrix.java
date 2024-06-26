package TwoDimensionalArrays;

public class SquareMatrix {
	public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
    {
        // Write your code here.
        if (n != m) {
            return "NO\n";
        }

        StringBuilder diagonalElements = new StringBuilder();

        for (int i = 0; i < n; i++) {
            diag[i] = mat[i][i];
            diagonalElements.append(mat[i][i]);
            if (i < n - 1) {
                diagonalElements.append(" ");
            }
        }

        return "YES\n" + diagonalElements.toString() ;
    }
}
