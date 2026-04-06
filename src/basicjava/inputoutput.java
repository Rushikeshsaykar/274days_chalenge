package basicjava;

import java.util.Scanner;

public class inputoutput {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter your intrest:");
        double intrest= sc.nextDouble();


        System.out.println("enter your Time duration:");
        double time=sc.nextDouble();

        System.out.println("Enter your principal amount");
        double principal=sc.nextDouble();

        double simpIntrest=(intrest*time*principal)/100;

        System.out.println("The simple intrest amount is:"+simpIntrest);




    }

}
