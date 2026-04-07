package if_else;

import java.util.Scanner;

public class gretestAmongThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c)
            System.out.println(a+"is greter" );
        if(b>a && b>c)
              System.out.println(b+"is greter");
        else {
            System.out.println(c+"is greter");
        }
    }
}
