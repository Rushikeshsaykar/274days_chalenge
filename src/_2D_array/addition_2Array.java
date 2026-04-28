package _2D_array;

public class addition_2Array {
    public static void print(int[][] arr){
        for(int [] a: arr){
            for(int element:a){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{5,6},{7,8}};
print(arr1);

print(arr2);

   for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
            arr1[i][j]= arr1[i][j]+arr2[i][j];
            }
       }
        System.out.println("after addition");
        print(arr1);
    }
}
