package ArrayList._2d_Arraylist;

import java.util.ArrayList;

public class printing {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(11); a.add(20); a.add(13);

        ArrayList<Integer> b=new ArrayList<>();
        b.add(11); b.add(33); b.add(22);

        ArrayList<Integer> c=new ArrayList<>();
        c.add(99); c.add(92); c.add(22);

        ArrayList<ArrayList<Integer> > arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

//        for(ArrayList<Integer>list :arr){
//            for (int element: list){
//                System.out.print(element+" ");
//            }
//            System.out.println();
//        }
        for (int i=0;i<arr.size();i++ ){
            for (int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
