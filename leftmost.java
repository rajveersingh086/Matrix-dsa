package SString;

public class leftmost {
    static final int CHAR = 256;
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String S)
    {
        int n = S.length();
        boolean[] visited= new boolean[CHAR];
        int res = -1;
        for (int i=n-1;i>=0;i--){
            if(visited[S.charAt(i)])
            res =i;
            else
            visited[S.charAt(i)] = true;
        }
        return res;
    }
}
