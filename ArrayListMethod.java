package Colllection;


import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Nail");
        arraylist.add("Zaur");
        arraylist.add("Mariya");
        arraylist.add( 1,"Misha");
        for (String s : arraylist) {
            System.out.println(s + "");

        }
        System.out.println();
        ArrayList<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(5);
        arraylist2.add(6);
        System.out.println(arraylist2);

        //get
        for(int i=0 ; i<arraylist.size(); i++)
        System.out.println(arraylist.get(i));
        System.out.println(arraylist.get(2));

        //set

        arraylist.set(1,"MASHA");
        System.out.println(arraylist);

        //remove

        arraylist.remove(2);
        System.out.println(arraylist);

        //addAll

    }
}
