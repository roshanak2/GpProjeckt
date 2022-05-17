import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
        String text;
        do {

            System.out.println("Bitte gebe den aktuelle Startwert ein: ");
            int startwert = IO2.readInteger();

            System.out.println("Bitte gebe den Wachstumfaktor ein: ");
            double wachstumsfaktor = IO2.readDouble();

            System.out.println("Bitte gebe den zerfall's Faktor ein: ");
            double zerfall = IO2.readDouble();

            System.out.println("Bitte gebe den Potenzwert ein: ");
            int x = IO2.readInteger();



            System.out.println("wachstumsfaktor" + WachstumsZerfallsprozesse.Wachstum(startwert, wachstumsfaktor, x));
            System.out.println("zerfallsfaktor" + WachstumsZerfallsprozesse.zerfall(startwert, zerfall, x));
            System.out.println("Wollen Sie einen weiteren Wachstumsprozess berechnen? [J]");
            text = IO2.readString();
        }
        while (text.equalsIgnoreCase("j"));


        double [] liste =IO2.readDoubleArray;
        StatistischeAuswertung.arthimetischesMittel(liste);
        System.out.println();

    }

    }


