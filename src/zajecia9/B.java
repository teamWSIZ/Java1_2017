package zajecia9;

public class B {
    public static void main(String[] args) {

        int dowydania = 9;
        int wydanychMonet = 0;

        System.out.println("do wydania: " + dowydania);

        for (int i = 0; i < 100; i++) {
            if (dowydania >= 10) {
                System.out.println("można wydać 10");
                dowydania = dowydania - 10;
                wydanychMonet++;
                System.out.println("jeszcze do wydania: " + dowydania);
            }
        }

        if (dowydania >= 5) {
            System.out.println("można wydać 5");
            dowydania = dowydania - 5;
            wydanychMonet++;
            System.out.println("jeszcze do wydania: " + dowydania);
        }

        for (int i = 0; i < 100; i++) {
            if (dowydania >= 2) {
                System.out.println("można wydać 2");
                dowydania = dowydania - 2;
                wydanychMonet++;
                System.out.println("jeszcze do wydania: " + dowydania);
            }
        }

        if (dowydania >= 1) {
            System.out.println("można wydać 10");
            dowydania = dowydania - 1;
            wydanychMonet++;
            System.out.println("jeszcze do wydania: " + dowydania);
        }

        System.out.println("Wydano łącznie: " +wydanychMonet + " monet");






    }
}
