import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();

        //add
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(40);

        //print all
        for(Integer i:alist){System.out.print(i+"\t");}

        //set
        alist.set(alist.indexOf(40), 10);

        //print index
        System.out.println("");
        System.out.println("index:"+ alist.indexOf(10));
        System.out.println("lastindex:"+ alist.lastIndexOf((10)));


    }
}
