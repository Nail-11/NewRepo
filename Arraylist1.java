package Colllection;
import java.util.ArrayList;
import java.util.List;


public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String>arraylist = new ArrayList<>();
        arraylist.add("Nail");
        arraylist.add("Zaur");
        arraylist.add("Mariya");
       // arraylist.add(50);
        System.out.println(arraylist);

        ArrayList<String>arraylist2 = new ArrayList<>(200);
        List<String> arraylist3 = new ArrayList<>();

        ArrayList<String>arraylist4 = new ArrayList<>(arraylist);
        System.out.println(arraylist4);
    }
}
