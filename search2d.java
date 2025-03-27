package Matrix;

public class search2d {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int left =0 ,right = (n*m)-1;
        while(left<=right){
            int mid=left +(right-left)/2;
            int midele = matrix[mid/m][mid%m];
            if(midele == target){
                return true;
            }
            else if(midele < target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return false;
    }
}