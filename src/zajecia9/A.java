package zajecia9;

public class A {
    public static void main(String[] args) {
        int k = 20;
        int c = 7;

        //todo: gdy za mało
        int doWydania = k - c;

        System.out.println("łacznie do wydania:" + doWydania);

        for (int i = 0; i < 100; i++) {
            int wydaje = 0;

            if (doWydania>=10) {
                wydaje = 10;
            }
            else if (doWydania>=5) {
                wydaje = 5;
            }
            else if (doWydania>=2) {
                wydaje = 2;
            }
            else if (doWydania>=1) {
                wydaje = 1;
            }

            if (wydaje>0) {
                System.out.println("wydaje: " + wydaje);
                doWydania -= wydaje;
            }
        }

    }
}
