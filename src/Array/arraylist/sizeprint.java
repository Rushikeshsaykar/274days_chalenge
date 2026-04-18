package Array.arraylist;

import java.util.ArrayList;

public class sizeprint {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<Integer>();

        for (int i=0;i<=5;i++){
            nums.add(i);
        }
        System.out.print("size of arraylist: ");
        System.out.println(nums.size());

        System.out.print("element in arraylist are:");
        for (int i=0;i<=5;i++){
            System.out.print(nums.get(i)+" ");
        }
    }
}
