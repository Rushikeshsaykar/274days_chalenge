package _2D_array;

public class transpose_matrix {
    public static void print(int[][] arr){
        for(int[] a:arr){
            for(int element:a){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{50,60,70,80},{11,22,33,44},{55,66,77,88}};
        System.out.println("normal array");
        print(arr);
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("transpose array");
        print(arr);
    }
}
