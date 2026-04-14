package Array;
//input arr

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        int[] arr=new int[8];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array element");

        //input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //output

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
