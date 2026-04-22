package basic_sorting.bubble_sort;

public class sortArray_desending {
    public static void main(String[] args) {
         int [] arr={2,4,1,4,6,50};
         int n=arr.length;

         for(int i=0;i<n-1;i++){
             for(int j=0;j<n-1-i;j++){
                 if(arr[j]<arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }

         }
         for(int element:arr){
             System.out.print(element+" ");
         }
    }
}
