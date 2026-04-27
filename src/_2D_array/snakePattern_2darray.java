package _2D_array;

public class snakePattern_2darray {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{50,60,70,80},{11,22,33,44},{55,66,77,88}};

        for (int i=0;i<arr.length;i++){
            if(i==0){
                for (int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
          else if(i%2!=0){
                for (int j=arr[0].length-1;j==0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
          else {
                for (int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
