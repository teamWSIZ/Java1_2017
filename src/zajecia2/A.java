package zajecia2;

public class A {
    public static void main(String[] args) {
        String s = "abc.";
        System.out.println(s);

        if (s.equals("abc")) {
            System.out.println("OK");
        } else {
            System.out.println("nie OK");
        }

        int x = 12;
        int y = 12;
        if (x>y) {
            System.out.println("x>y");
        } else {
            System.out.println("x<=y");
        }

        String p = "[abra kadabra]";
        if (p.startsWith("[") && p.endsWith("]")) {
            System.out.println("napis jest w nawiasie");
        }

        //zadanie: dane są liczby całkowite a,b,c
        //jeśli można stworzyć trójkąt, którego boki mają takie długości jak a,b,c
        //to proszę wypisać "liczby są OK", inaczej wypisać
        // "nie można skonstruować trójkąta"

        //przykład
//        int a = 5, b = 5, c = 7;  //OK
//        int a = 5, b = 5, c = 17;  //nie OK



    }
}
