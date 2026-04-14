package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortmethod {
    public static void main(String[] args) {
int[] arr={2,10,3,40,4};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    public static void print(int[] arr){
        for ( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
