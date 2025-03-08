
class Transpose { 
	
    public void transpose(int n, int mat[][]) {
        for (int i= 0;i<n;i++){
            for (int j =i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
    }
}