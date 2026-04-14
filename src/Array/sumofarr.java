package Array;

import java.util.Scanner;

public class sumofarr {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("number of arry:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("array element");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("the array you enter:");
        for (int i=0;i<arr.length;i++){
            temp=temp+arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("the sum of array is:"+temp);


    }
}
