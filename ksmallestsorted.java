package Matrix;
public class ksmallestsorted {

    public int kthSmallest(int[][] matrix, int k) {
        // nive approach time complexity O(n^2 log n^2)
       // int n = matrix.length;
      //  int [] one_d = new int [n*n];
      //  for (int i=0;i<n;i++){
      //      for (int j=0;j<n;j++){
        //    one_d[i*n+j] = matrix[i][j];
          //  }
        //}
        //return one_d[k-1];
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
    
    private int countLessEqual(int[][] matrix, int target) {
        int n = matrix.length;
        int i = n - 1;
        int j = 0;
        int count = 0;
        
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= target) {
                count += (i + 1);
                j++;
            } else {
                i--;
            }
        }
        return count;
    }
}