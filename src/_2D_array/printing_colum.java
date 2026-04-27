package _2D_array;

public class printing_colum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        for(int j=0;j<arr[0].length;j++){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
