package zajecia9;

public class Petle {
    public static void main(String[] args) {

        int x = 50;

        for (int i = 0; i < 5; i++) {
            //to jest powtarzane
            System.out.println("(i=" + i + ") x=" + x);

            x -= 10;

            System.out.println("na koniec x=" + x);


        }
    }
}
