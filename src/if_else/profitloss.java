package if_else;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        System.out.println("Enter a ptofit and loss");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the buying prince:");
        int bp=sc.nextInt();
        System.out.println("Enter the sellig praice");
         int sp=sc.nextInt();

         if(bp>sp){
             System.out.println("there is loss of "+(sp-bp));

         }
         else if(bp<sp){
             System.out.println("there is profit of "+(bp-sp));

         }
         else {
             System.out.println("there is no loss no profit");
         }


    }
}
