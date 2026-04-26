package _2D_array;

import static java.util.Arrays.sort;

public class largest_sum_row {
    public static void main(String[] args) {
        int[][]arr={{2,8,3,4,7 },{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int sum=0;
        int[] sumarry=new int[arr.length];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            sumarry[i]=sum;
            sum=0;

        }
      sort(sumarry);
        System.out.println();

    }
}
