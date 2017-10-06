package zajecia1;


public class A {
    //psvm + [tab]
    public static void main(String[] args) {
        //sout  +  [tab]
        System.out.println("hello world!!");
        System.out.println(2 + 3);       //[ctrl] + d

        System.out.println("abra" + " " + "kadabra");

        System.out.println("abra kadabra".toUpperCase());

        //-------
        System.out.println("wynik=" + (2 + 2));
        System.out.println("------");
        int bank = 10;

        System.out.println(bank);
        System.out.println(bank * bank * bank);

        bank = bank + 11;
        System.out.println("na koniec w banku jest " + bank);
        //-------

        String w = "abcd";
        System.out.println(w + w);
        System.out.println(w.toUpperCase());

        w = "[" + w + "]";
        System.out.println(w);

        w = "Lorem ipsom dolor sit";
        System.out.println(w.contains("dolor"));
        System.out.println(w.contains("dolox"));


    }
}
