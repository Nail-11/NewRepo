package Colllection;



import java.util.ArrayList;

public class ArraylistMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Nail");
        arraylist1.add("Zaur");
        arraylist1.add("Mariya");
        System.out.println(arraylist1);
        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("!!!");
        arraylist2.add("???");
        //method addAll
        arraylist1.addAll( 1,arraylist2);
        System.out.println(arraylist1);


        //clear
        arraylist1.clear();
        System.out.println(arraylist1);


    }
}
