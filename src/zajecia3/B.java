package zajecia3;

import java.util.ArrayList;
import java.util.List;

public class B {
    public static void main(String[] args) {
        List<String> grupa = new ArrayList<>();

        grupa.add("Paweł");
        grupa.add("Antoni");
        grupa.add("Jakub");
        grupa.add("Szymon");
        grupa.add("Antoni");

        System.out.println(grupa);
        System.out.println(grupa.size());
        System.out.println(grupa.get(0));
        System.out.println(grupa.contains("Antoni"));
        grupa.remove(3);
        System.out.println(grupa);

        int x = 0;
        x = x + 1;  //to samo co:
        x += 1; //to samo co:
        x++;    //czyli zwiększanie zmiennej `x` o 1

        int ileAntonich = 0;

        for(String osoba : grupa) {
            System.out.println("Witaj " + osoba);
            System.out.println("----");
            if (osoba.equals("Antoni")) {
                ileAntonich++;
            }
        }
        //
        System.out.println("W liście mamy: " + ileAntonich + " Antonich");
        System.out.println("abcd".contains("x"));
        //sprawdzić ile imion z grupy zawiera literkę 'a'
    }
}
