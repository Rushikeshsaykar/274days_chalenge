package _2D_array;

public class foreach_2darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        for(int[] a : arr){
            for(int element:a){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
