package Matrix;
import java.util.*;

public class matrixbeautiful {

    public static int findMinOperation(int[][] mat) {
        int n = mat.length;
        int[] rows = new int[n];
        int[] cols = new int[n];
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rows[i] += mat[i][j];
                cols[j] += mat[i][j];
                maxSum = Math.max(maxSum, Math.max(rows[i], cols[j]));
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += maxSum - rows[i];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        int result = findMinOperation(mat);
        System.out.println("Minimum operations required: " + result);

    }
}
