import java.util.Scanner;

class rotate90 {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][], int N) {
        //Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //Reverse each column
        for (int i = 0; i < N; i++) {
            int low = 0, high = N - 1;
            while (low < high) {
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
    }
    static void printMatrix(int mat[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N x N): ");
        int N = sc.nextInt();

        int mat[][] = new int[N][N];

        System.out.println("Enter the matrix elements row-wise:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        rotateby90(mat, N);

        System.out.println("Matrix after 90-degree anticlockwise rotation:");
        printMatrix(mat, N);

        sc.close();
    }
}
