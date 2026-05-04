package binarySerch;
// lover bound example we 4 is a target we have to print greter than or equalto element
public class loverbound {
    public static void main(String[] args) {
       int[] n= {1,2,3,3,5,6,7,8,8,9,10};
       int target=4;

       int low=0;
       int high= n.length-1;
       int ans=n.length;

       while(low<=high){
           int mid=low+(high-low)/2;

           if(n[mid]>=target){
               ans=mid;
               high=mid-1;
           }
           else {
               low=mid+1;
           }
       }
        System.out.println(ans);
    }
}
