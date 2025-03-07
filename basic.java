public class basic {
    public static void main (String []args){
        // int [][]arr = {{1,2,3,8,9} ,
        // {4,5,6}};

        // for (int i = 0;i<arr.length;i++){
        //     for(int j=i;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }
        int m =2,n=3;
        int arr[][]=new int[m][n];
        for (int i = 0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                arr[i][j]=10;
                System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}
