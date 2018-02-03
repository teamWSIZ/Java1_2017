package zajecia_10;

import java.util.Arrays;

public class A {

    public static int getWinner(int[][] b) {
        //zwraca 1, jeśli na planszy "b" 1 jest zwycięzcą
        //2 jeśli 2 jest zwycięzcą,
        //0 jeśli nie ma zwycięzcy

        for (int typ = 1; typ <=2 ; typ++) {
            //sprawdzamy rzędy
            for (int r = 0; r < 3; r++) {
                int x = 0;
                for (int c = 0; c < 3; c++) {
                    if (b[r][c]==typ) x++;
                }
                if (x==3) return typ;
            }
            //sprawdzamy kolumny
            for (int c = 0; c < 3; c++) {
                int x = 0;
                for (int r = 0; r < 3; r++) {
                    if (b[c][r]==typ) x++;
                }
                if (x==3) return typ;
            }
            if (b[0][0]==b[1][1] && b[1][1]==b[2][2]) {
                if (b[1][1]==typ) return typ;
            }
            if (b[0][2]==b[1][1] && b[1][1]==b[2][0]) {
                if (b[1][1]==typ) return typ;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] w = new int[6];
        w[4] = 5;
        w[1] = 2;

        //zadanie: wykorzystać pętle, by do tablicy o rozmiarze 6 wpisać liczby
        //1,2,3,4,5,6
        for (int i = 0; i < 6; i++) {
            w[i] = (i+1);
        }
        System.out.println(Arrays.toString(w));
        for (int i = 5; i >=0 ; i--) {
            w[i] = 6-i;
        }
        System.out.println(Arrays.toString(w));
        System.out.println("------------");
        int[][] b = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        b[1][1] = 2;
        b[2][2] = 2;
        b[0][2] = 2;
        b[2][0] = 2;
        b[0][0] = 2;
        b[1][0] = 1;
        b[1][2] = 1;
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }
        System.out.println("Wygrał:" + getWinner(b));




    }
}
