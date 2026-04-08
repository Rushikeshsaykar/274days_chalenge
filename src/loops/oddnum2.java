package loops;

public class oddnum2 {
    public static void main(String[] args) {
        int total = 0;
        for(int i=3;i<=100;i+=3){
            total=total+1;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(total);
    }
}
