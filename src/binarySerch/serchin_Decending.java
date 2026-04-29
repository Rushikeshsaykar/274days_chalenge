package binarySerch;

import java.util.Scanner;

public class serchin_Decending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter array length");
        int n=sc.nextInt();

        System.out.println("enter array element");
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target element: ");
        int target=sc.nextInt();
        int hi=0;
        int lo=arr.length-1;


        while(hi<lo){
            int mid=(hi+lo)/2;
            if(arr[mid]>target){
                hi=mid+1;

            }
            if (arr[mid]<target){
                lo=mid-1;
            }
            else {
                System.out.println("target fount at index: "+mid);
                break;
            }
        }

    }

}
