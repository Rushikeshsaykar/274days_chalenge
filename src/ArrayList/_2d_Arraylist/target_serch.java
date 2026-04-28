package ArrayList._2d_Arraylist;

public class target_serch {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{8,8,8,8},{22,3,4,1}};
        int target=10;
        boolean result=false;
        for(int[] a:arr){
            for(int element: a){
                if (element== target){
                    result=true;
                }
            }
        }
        System.out.println(result);
    }
}
