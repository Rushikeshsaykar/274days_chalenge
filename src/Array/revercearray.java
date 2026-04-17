package Array;
//array reverce
public class revercearray {
    public static void main(String[] args) {
        int[] arr={2,1,9,10,22,3,88};
        int n=arr.length;
        int i=0,j=n-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int element:arr){
            System.out.print(element+" ");
        }

    }
}
