package Array;

public class secondlarge {
    public static void main(String[] args) {
        int[] arr={2,3,9,10,10};
        int max=arr[0];
        int secLarg=arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]>secLarg && arr[i]<max){
                secLarg=arr[i];
            }
        }
        System.out.println("maximum no is:");
        System.out.println(max);
        System.out.println("second max no is:");
        System.out.println(secLarg);

    }
}
