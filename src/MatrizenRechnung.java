// Roshanak/Max/Jannis
public class MatrizenRechnung {
    public static int[][] MultiplikationZweierMatrizen(int[][] array1, int[][] array2) {
        int[][] ergebnismatrix = null;

        if (array1[0].length == array2.length) {
            int zeile1 = array1.length;
            int spalte1 = array1[0].length;
            int spalte2 = array2[0].length;

            ergebnismatrix = new int[zeile1][spalte2];

            for (int i = 0; i < zeile1; i++) {
                for (int j = 0; j < spalte2; j++) {
                    ergebnismatrix[i][j] = 0;
                    for (int k = 0; k < spalte1; k++) {
                        ergebnismatrix[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
        } else {
            int zeilen = array1.length;
            int spalten = array1[0].length;

            ergebnismatrix = new int[zeilen][spalten];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    ergebnismatrix[i][j] = 0;
                }
            }
        }
        return ergebnismatrix;
    }
}