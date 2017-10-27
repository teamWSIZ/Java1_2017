package zajecia3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<String> pesele = new ArrayList<>();

        pesele.add("123XX1");
        pesele.add("X1234A");
        pesele.add("222ABC");
        pesele.add("X1234A");
        pesele.add("X1234B");
        pesele.add("X1234Z");
        pesele.add("X1234A");

        System.out.println(pesele);         //wypisuje liste na konsole
        System.out.println(pesele.size());  //wielkość listy
        System.out.println(pesele.get(1));  //drugi element listy
        pesele.remove(0);   //usuwa pierwszy element listy
        System.out.println(pesele);

        System.out.println(pesele.contains("X1234A"));
        System.out.println(pesele.contains("X1234A****"));

        System.out.println(pesele.indexOf("X1234A"));

        Collections.sort(pesele);
        System.out.println(pesele);

        for(String s : pesele) {

            if (s.contains("C")) {
                System.out.println(s + "<---- zawiera 'C'");
            } else {
                System.out.println(s);
            }
        }
        String s = null;
        System.out.println("----");
        System.out.println(s.isEmpty());
    }
}

/*
 * Zadanie 1: dana jest lista napisów (jak powyżej); sprawdzić,
 * czy w tej liście któryś napis się powtarza.
 * przykład ['aa','ab,'aa','cc'] --> tak, 'aa'
 * przykład ['aa','ab','ac'] --> nie
 *
 * Zadanie 2: Mając daną listę napisów stworzyć nowy napis, który
 * jest skejeniem wszystkich napisów listy.
 * przykład ['aa','ab,'aa','cc'] --> "aaabaaac"
 *
 */
