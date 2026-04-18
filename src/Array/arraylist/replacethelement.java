package Array.arraylist;

import java.util.ArrayList;

public class replacethelement {
    public static void main(String[] args) {
        //repllece value of specific index

        ArrayList<Integer> arr=new ArrayList<>();

        for (int i=0;i<=5;i++){
            arr.add(i);
        }
        System.out.println(arr);

        arr.set(1,100);

        System.out.println(arr);

    }
}
