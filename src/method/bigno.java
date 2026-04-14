package method;
//Find Smallest Number Among Three
public class bigno {
    public static int small(int a,int b,int c){
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else
            return c;

    }

    public static void main(String[] args) {
        System.out.println(small(8,3,10));
    }

}
