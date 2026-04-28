package _2D_array;
//lower trangular matrix  Setting zero in lower triangular matrix
public class lower_trangullar {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{2,3,1,5}};

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i !=0&& j<i){
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


    }
}
