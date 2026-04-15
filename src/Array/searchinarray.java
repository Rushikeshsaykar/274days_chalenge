package Array;

import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("number of array:");
        int x=sc.nextInt();

        int[] arr=new int[x];
        System.out.println("element of array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("search elemnt of array:");
        int n=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("true");
            }

        }
    }
}
