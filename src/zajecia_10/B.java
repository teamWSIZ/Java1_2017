package zajecia_10;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] a = new int[10];  //tablica mająca 10 elementów, numerowanych 0..9

        a[5] = 10;  //przypisanie
        a[1] = 3;

        for (int i = 0; i < a.length; i++) {
            a[i]--;  //to samo co a[i] = a[i] - 1;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = 10 - i;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + i;
        }

        for (int i = 0; i < 5; i++) {
            a[i] = 1 + i;
            a[9-i] = 1 + i;
        }

        System.out.println(Arrays.toString(a));

        System.out.println("--------------");
        //----------------------------------

        //deklaracja i inicjacja tablicy dwu-wymiarowej
        int[][] d = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        d[1][2] = 13;   //przypisanie wartości w rzędzie "1", kolumnie "2" (licząc od zera)
        d[2][0] = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(d[i]));
        }

        //zadanie: sprawdzić czy istnieje kolumna taka, że wszystkie liczby
        //w tej kolumnie są takie same...

        for (int kolumna = 0; kolumna < d[0].length; kolumna++) {
            int szukana = d[0][kolumna];
            int licznik = 0;
            for (int rzad = 0; rzad < d.length; rzad++) {
                if (d[rzad][kolumna]==szukana) {
                    licznik++;
                }
            }
            //sprawdzenie czy licznik jest dość duży...
            if (licznik==d.length) {
                System.out.println("Kolumna nr. " + kolumna + " jest OK");
            }
        }


    }
}
