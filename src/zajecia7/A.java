package zajecia7;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        String c = "aą";

        byte[] bb = c.getBytes();

        System.out.println(Arrays.toString(bb));


        System.out.println("\u265C");

    }
}
