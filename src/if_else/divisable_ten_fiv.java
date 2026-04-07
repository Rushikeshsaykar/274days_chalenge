package if_else;

import java.util.Scanner;

public class divisable_ten_fiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int a=sc.nextInt();

        if(a%5==0 && a%10==0){
            System.out.println("yest its divisible ");
        }
        else{
            System.out.println("Noooo! its not");
        }
    }
}
