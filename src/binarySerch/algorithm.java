package binarySerch;


public class algorithm {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,22,33,44};
        int target=10;
        int lo=0; int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
            else{ System.out.println("target found at index"+mid);
                       break;
        }
        }

    }
}
