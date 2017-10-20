package zajecia3;


import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<String> pesele = new ArrayList<>();

        pesele.add("123XX1");
        pesele.add("X1234A");
        pesele.add("222ABC");
        pesele.add("X1234A");
        pesele.add("X1234A");

        System.out.println(pesele);         //wypisuje liste na konsole
        System.out.println(pesele.size());  //wielkość listy
        System.out.println(pesele.get(1));  //drugi element listy
        pesele.remove(0);   //usuwa pierwszy element listy
        System.out.println(pesele);

        System.out.println(pesele.contains("X1234A"));
        System.out.println(pesele.contains("X1234A****"));

        System.out.println(pesele.indexOf("X1234A"));


    }
}
