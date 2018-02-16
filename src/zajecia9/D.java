package zajecia9;

public class D {
    //Sprawdza czy wszystkie elementy tablicy "g" są != 0
    private static boolean areAllFieldsFilled(int[][] g) {
        for (int row = 0; row < g.length; row++) {
            for (int col = 0; col < g[row].length; col++) {
                if (g[row][col]==0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] b = new int[][]{{0, 0}, {0, 0}};
        System.out.println(areAllFieldsFilled(b));
        b = new int[][]{{1, 1}, {2, 2}};
        System.out.println(areAllFieldsFilled(b));
        b[0][0] = 0;
        System.out.println(areAllFieldsFilled(b));
        b = new int[][]{{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} ,{1, 1}};
        System.out.println(areAllFieldsFilled(b));


    }
}
