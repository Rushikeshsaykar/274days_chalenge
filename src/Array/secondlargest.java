package Array;

import java.util.Arrays;

import static Array.sortmethod.print;

public class secondlargest {

    public static void main(String[] args) {
        int[] arr={100,44,88,14,1,0,88,101,7,2};
        Arrays.sort(arr);
        print(arr);
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
           temp=arr[i];
        }
        System.out.print("second lsrgest is:");
        System.out.println(temp);
    }
}
