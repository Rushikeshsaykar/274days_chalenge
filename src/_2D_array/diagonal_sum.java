package _2D_array;

import static _2D_array.addition_2Array.print;

//write digonal sum of 2D array add cros element [1][1],[2][2]
public class diagonal_sum {
    public static void main(String[] args) {
       int[][] matrix = {{1, 2, 3},{4, 6, 6},{7, 8, 9}} ;
       print(matrix);
       int sum=0;
//       for(int i=0;i<matrix.length;i++){
//           for (int j=0;j<matrix[0].length;j++){
//               if (i==j) sum=sum+matrix[i][j];
//           }
//       }
//        System.out.println(sum);

        //left dogonal sum

        print(matrix);

        for(int i=matrix.length-1;i>=0;i--){
            for (int j=matrix[0].length-1;j>=0;j--){
                if (i==j) sum=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }

}
