package Array;

public class accendingarray {
    public static void main(String[] args) {

        int[] arr={0,2,1,3};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
