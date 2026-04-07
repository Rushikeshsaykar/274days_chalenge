package if_else;

import java.util.Scanner;

public class divbyfive {
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("the number is divisible by 5");

        }
        else{
            System.out.println("the number is not divisible by 5");
        }
    }

}
