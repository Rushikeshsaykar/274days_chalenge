package Array;

public class lasttofirst {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        int last=arr.length-1;
        for (int i=arr.length-1;i>0;i--){
             int temp=arr[i];
             arr[i]=arr[i-1];
             arr[i-1]=temp;
        }
for(int element:arr){
    System.out.print(element+" ");
}
    }
}
