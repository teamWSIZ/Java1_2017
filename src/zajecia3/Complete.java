package zajecia3;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Complete {
    public static void main(String[] args) throws Exception{
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
        int x; //definicja
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

        InetAddress[] machines = InetAddress.getAllByName("yahoo.com");
        for(InetAddress address : machines){
            System.out.println(address.getHostAddress());
        }

    }
}

/*
 * Zadania:
 *  - dwie listy słów; sprawdzić ile elementów jest wspólnych (występuje w obu listach).
 *  - dany jest String który ma być adresem IP; sprawdzić czy tak jest
 *       - ma zawierać trzy kropki
 *       - między kropkami mają być liczby między 0 i 255
 *  - dany jest napis składający się ze znaków 'L' i 'R'; sprwadzić ile razy w tym napisie
 *      'R' występuje bezpośrednio za 'L'
 *  (*) mając daną listę domen, np. ['google.pl', 'riotgames.com', 'wp.pl'] znaleźć listę
  *     adresów IP odpowiadających tym domenom (google: "java domain name to ip")
 */