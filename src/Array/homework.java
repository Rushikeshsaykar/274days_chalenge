package Array;

public class homework {
    public static void main(String[] args) {
        int[] arr={2,5,8,7,5};
        print(arr);
        for (int i=0;i<arr.length;i++){
            if(i%2==0) {
                arr[i]=arr[i]*2;
            }
            else {
                arr[i]=arr[i]+10;
            }
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
