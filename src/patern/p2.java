package patern;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        for(int i=1;i<col;i++){
            for (int j=1;j<=col;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
