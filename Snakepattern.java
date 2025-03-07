import java.util.*;

public class Snakepattern {
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList <Integer> res = new ArrayList<>();
        int R = matrix.length;
        int C = matrix[0].length;

            for (int i = 0;i<R;i++){
                if (i%2==0){
                    for (int j=0;j<C;j++){
                        res.add(matrix[i][j]);
                    }
                }
                    else {
                        for (int j =C-1;j>=0;j--){
                        res.add(matrix[i][j]);
                    }
                }
            }
            return res;

    }
}
