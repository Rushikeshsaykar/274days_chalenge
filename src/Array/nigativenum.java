package Array;

import java.util.Scanner;

public class nigativenum {
    public static void main(String[] args) {
        int[] arr =new int[4];
        Scanner sc=new Scanner(System.in);
        //input array
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //output array
        for(int i=0;i<arr.length;i++){
            if (arr[i]<0)
                System.out.print(arr[i]+" ");
        }

    }
}
