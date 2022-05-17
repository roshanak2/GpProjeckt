import java.io.IOException;
import java.util.Arrays;

public class StatistischeAuswertung {
    //Minimum Max
    public static double ermittelnDouMin(double[] zahl) {
        double min = zahl[0];
        for (int i = 1; i < zahl.length; i++) {
            // min = Math.min(min , zahl[1]);
            if (zahl[i] < min) {
                min = zahl[i];
            }
        }
        return min;
    }

    //Maximum Max
    public static double ermittelnDouMax(double[] zahl) {
        double max = zahl[0];
        for (int i = 1; i < zahl.length; i++) {
            // min = Math.min(min , zahl[1]);
            if (zahl[i] > max) {
                max = zahl[i];
            }
        }
        return max;
    }

    //Spannweite Jannis
    public static double ermittelnspann(double[] liste) throws IOException {

        Arrays.stream(liste).sorted();
        double max = liste[0];
        double min = liste[0];
        for (int i = 1; i < liste.length; i++) {
            // min = Math.min(min , zahl[1]);
            if (liste[i] > max) {
                max = liste[i];
            }
        }

        for (int i = 1; i < liste.length; i++) {
            // min = Math.min(min , zahl[1]);
            if (liste[i] < min) {
                min = liste[i];
            }
        }


        double spannweite = max - min;

        return spannweite;
    }

    //Maximale Abweichung Roshanak
    public static double maxAbweichung(double[] ar) {
        double ma = 0;
        double ma2 = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] <= ar[i - 1]) {
                ma = ar[i - 1] - ar[i];
            } else {
                ma = ar[i] - ar[i - 1];
            }
            if (ma2 < ma) {
                ma2 = ma;
                ma = 0;
            }
        }
        return ma2;
    }

    //minimale Roshanak
    public static double minAbweichung(double[] ar) {
        double mi = 0;
        double mi2 = 999999999;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < ar[i - 1]) {
                mi = ar[i - 1] - ar[i];
            } else {
                mi = ar[i] - ar[i - 1];
            }

            if (mi2 >= mi) {
                mi2 = mi;
            }
        }
        return mi2;
    }

    //arthimetischesMittel Jannis / Max
    public static double arthimetischesMittel(double[] liste) {

        int n = liste.length;
        double summe = 0;
        double arthemetischesMittel;

        for (int i = 1; i < liste.length; i++) {

            summe = summe + liste[i - 1];

        }
        arthemetischesMittel = summe / liste.length;

        return arthemetischesMittel;
    }

    //Geometrisches Mittel Jannis/Roshanak/Max
    public static double GeometrischesMittel(int[] liste) {
        Arrays.stream(liste).sorted();
        double keineahnung = liste[0];


        for (int i : liste) {
            keineahnung = keineahnung * liste[i];

        }
        double garkeineahnung = Math.pow(keineahnung, -liste.length);

        return garkeineahnung;
    }

    //Mittelwert / Modalwert Roshanak
    public static double mittelwert() {

        double[] liste = new double[0];
        double mittelwert = 0;
        for (int i = 0; i < liste.length; i++) {
            mittelwert = liste[i] / liste.length;
        }
        return mittelwert;
    }

    //Median Max/Jannis
    public static double ermittleMedian() {
        double[] liste = new double[0];
        double median = liste[0];
        for (int i = 0; i < liste.length; i++) {


            if (liste[i] % 2 == 0) {
                median = liste[i] + 1 / 2;
            } else {
                median = 0.5 * (liste[i] / 2 + liste[i] / 2 + 1);
            }
        }
        return median;
    }

    //Varianz Jannis/Roshanak
    public static double Varianz() {
        double[] liste = new double[0];
        double varianz = 0;
        for (int i = 0; i < liste.length; i++) {
            varianz = Math.pow(liste[i] - mittelwert(), 2) / liste.length;
        }
        return varianz;
    }

    //Standartabweichung Roshanak
    public static double Standartabweichung() {
        double s = Math.sqrt(Varianz());
        return s;
    }
}
