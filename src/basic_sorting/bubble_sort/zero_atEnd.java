package basic_sorting.bubble_sort;

public class zero_atEnd {
    public static void main(String[] args) {

        int[] arr={2,3,0,2,0,1};
        int n=arr.length;

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int element: arr){
            System.out.print(element+" ");
        }
    }
}
