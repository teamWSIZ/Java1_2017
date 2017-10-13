package zajecia2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Complete {
    public static void main(String[] args) {
        String s = "aax";

        //Instrukcje warunkowe
        if (s.equals("aaa")) {
            System.out.println("OK");
        } else if (s.startsWith("aa")) {
            System.out.println("not so good but ok");
        } else {
            System.out.println("Bad luck");
        }

        //warunki na liczbach
        int x = 10, y = 10;
        if (x>y) {
            System.out.println("x większe");
        } else if (x<y) {
            System.out.println("x mniejsz");
        } else {
            System.out.println("x == y");
        }
        if (x==y) {
            System.out.println("tak -- są równe, to już wiemy");
        }

        //dwa warunki jednocześnie
        String r = "[asdasd]";
        if (r.startsWith("[") && r.endsWith("]")) {
            System.out.println("coś jest w nawiasie kwadratowym");
        }

        //jeden lub drugi warunek
        String p = "1231!@#!@#24hacker2131241@#!2#!@#";
        if (p.contains("hacker") || p.contains("HACKER")) {
            System.out.println("Hacker inside!");
        }

        //// Kolekcje (dodatkowy materiał)

        //definicja prostej kolejcji, i przypisanie jej początkowej zawartości
        List<String> kraje = new ArrayList<>();
        kraje.add("Andorra");
        kraje.add("Danemark");
        kraje.add("Catalonia");
        kraje.add("Bahrain");
        System.out.println(kraje);  //ładne wydrukowanie kolekcji na konsoli
        System.out.println("Jest Bahrain: "  + kraje.contains("Bahrain"));
        System.out.println("Liczba krajów: " + kraje.size());

        //Kilka ważnych operacji na kolekcjach
        Collections.sort(kraje);
        System.out.println(kraje);
        Collections.reverse(kraje);
        System.out.println(kraje);

        //pętla - czyli powtarzanie kawałka kodu dla różnych wartości zmiennej "kraj"
        int krajeZLiterkaA = 0;
        for(String kraj : kraje) {
            System.out.println("Zaczynam nowy kraj");
            System.out.println("[" + kraj.toUpperCase() + "]");
            if (kraj.contains("a")) krajeZLiterkaA += 1;
        }

        //proste działania
        x = 0; //przypisanie
        x += 2;  //zwiększenie x o 2
        x /= 2;  //x zamienia sie na wynik działania (x/2)
        x++;    //to samo co x+=1; zwiększenie o 1

        //inny rodzaj pętli -- po liczbach

        int suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 7);  //tylko wypisujemy
            suma += i;      //tu sobie zbieramy sumę wszystkich liczb
        }
        System.out.println("suma od 0 do 9 włącznie to: " + suma);







    }
}
