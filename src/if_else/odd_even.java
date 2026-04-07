package if_else;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("the number "+num+" is even");
        }
        else {
            System.out.println("the number "+num+" is odd");
        }
    }
}
