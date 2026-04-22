package basic_sorting.bubble_sort;

public class bubble_sot {
    public static void print(int[] arr){

        System.out.println("arr is");

        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {

            int[] arr={-1,4,7,1,7,5,3,2,6};
            int n=arr.length;
            print(arr);
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            print(arr);
        }
    }

