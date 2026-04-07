package if_else;

import java.util.Scanner;

public class absolutvalue {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        if (num<0){
            int i = num * (-1);
            System.out.println("num is nigative after conversion"+i);
        }
        else {
            System.out.println(num);
        }

    }
}
