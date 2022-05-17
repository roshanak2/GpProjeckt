import java.io.IOException;

public class WachstumsZerfallsprozesse {

    public static double Wachstum(int startwert,double wachstumsfaktor,int x) throws IOException {


        int i = 0;
        double summe = 0;



        for (i = 0; i <= x; i++) {
            summe = Math.pow(wachstumsfaktor, i) * startwert;
            System.out.println(i + "\t\t" + summe);
        }
        return summe;
    }
        public static double zerfall(int startwert,double zerfall,int x) {

            int i = 0;
            double summe = 0;

            for (i = 0; i <= x; i++) {
                summe = Math.pow(zerfall, startwert) / i;
                System.out.println(i + "\t\t" + summe);
            }
       return summe;
    }
 }