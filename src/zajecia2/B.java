package zajecia2;

public class B {
    public static void main(String[] args) {

        int x = 11;

        if (x > 5) {
            System.out.println("x jest > 5");
            System.out.println("druga instrukcja");
        } else {
            System.out.println("x jest <=5");
            System.out.println("inna instrukcja");
        }

        String a = "abcd";
//        a.startsWith()
//        a.endsWith()
//        a.contains()

        if (a.startsWith("ab")) {
            System.out.println("Zaczyna się od ab");
        } else {
            System.out.println("Nie zaczyna się od ab");
        }

        int y = 12;
        if (x * y > 100) {
            System.out.println("duże liczby");
        }

        //sprawdzić czy y=10
        if (y==10) {
            System.out.println("y jest równe 10");
        }

        String nazwisko = "Kowalski";
        String imie = "Adam";

        if (nazwisko.equals("Kowalski") && imie.startsWith("A")) {
            System.out.println("Znaleziono hackera Kowalskiego");
        }

        if (x>10 && y>10) {
            System.out.println("Obie liczby są większe niż 10");
        }



        System.out.println("koniec programu");
    }
}
