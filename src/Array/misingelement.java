package Array;

public class misingelement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n+2;i++){
            sum=sum+i;
        }
       // System.out.println(sum);
        for (int i=0;i<n;i++){
            sum=sum-arr[i];
        }
        System.out.println(sum);
    }
}
