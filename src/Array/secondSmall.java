package Array;

public class secondSmall {
    public static void main(String[] args) {
        int[] arr={20,33,1,8,2,44,88,55,11};
        int small=arr[0];
        int secondSmall=arr[0];

        for(int i=0;i<arr.length;i++){
        if(small>arr[i]){
            small=arr[i];
        }
        }

        for (int i=0;i<arr.length;i++){
            if (secondSmall>arr[i] && secondSmall!=small){
                secondSmall=arr[i];
            }
        }


        System.out.println("Smalest elemnt:");
        System.out.println(small);
        System.out.println("second smallest");
        System.out.println(secondSmall);

    }
}
