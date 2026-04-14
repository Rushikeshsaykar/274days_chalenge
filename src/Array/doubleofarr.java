package Array;

import java.util.Scanner;

public class doubleofarr {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner sc= new Scanner(System.in);
//input array
        System.out.println("eneter the array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      //output array

      for (int i=0;i<arr.length;i++){
          System.out.print(arr[i]+arr[i]+" ");
      }

    }
}
