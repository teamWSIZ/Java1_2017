package zajecia7;


public class B {
    public static void main(String[] args) {
        double kwota = 5;
        double inflacja = 1.5;
        int years = 10;

        //1 rok:
        for (int i = 0; i < years; i++) {
            kwota *= (1 + inflacja / 100);
        }
        System.out.println(kwota);
    }
}
