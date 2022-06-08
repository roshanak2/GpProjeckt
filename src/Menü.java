public class Menü {
    public static void main(String[] args) throws Exception {
        do {


            System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
            System.out.println("|Menü: \t\t\t  Von: Roshanak, Jannis, Max |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|Wähle dein Thema aus und schreibe dafür     |");
            System.out.println("|die benötigte Zahl.         =)              |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|Thema\t\t\t\t\t\t| Zahl  |        |");
            System.out.println("|                           |       |        |");
            System.out.println("|Wachstum/Zerfall Gleichung\t|  [1]  |        |");
            System.out.println("|Quadratische Gleichungen\t|  [2]  |        |");
            System.out.println("|Statistische Auswertungen\t|  [3]  |        |");
            System.out.println("|Vektorrechnung\t\t\t\t|  [4]  |        |");
            System.out.println("|Matritzenrechnung\t\t\t|  [5]  |        |");
            System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            System.out.print("\t\t\tMeine Themen Nr --->");
            int themenNr = IO2.readInteger();


            //Wachstum und Zerfall


            switch (themenNr) {
                case 1:
                    System.out.println("Geben sie den Startwert ein.");
                    int startwert = IO2.readInteger();
                    System.out.println("Geben sie den x Faktor ein.");
                    int x = IO2.readInteger();

                    System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                    System.out.println("|Ihr Thema ist\tWachstum/Zerfall Gleichung   |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Wähle dein Thema aus und schreibe dafür     |");
                    System.out.println("|die benötigte Zahl.         =)              |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Thema\t\t\t\t\t\t| Zahl  |        |");
                    System.out.println("|                           |       |        |");
                    System.out.println("|Wachstum                   |  [1]  |        |");
                    System.out.println("|Zerfall                    |  [2]  |        |");
                    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    System.out.print("\t\t\tMeine Themen Nr --->");
                    int WZ = IO2.readInteger();
                    switch (WZ) {
                        case 1:
                            System.out.println("Geben sie den Wachstumsfaktot ein.");
                            double wachstumsfaktor = IO2.readDouble();
                            WachstumsZerfallsprozesse.Wachstum(startwert, wachstumsfaktor, x);
                            break;
                        case 2:
                            System.out.println("Geben sie den Zerfallsfaktor ein.");
                            double zerfallsfaktor = IO2.readDouble();
                            WachstumsZerfallsprozesse.zerfall(startwert, zerfallsfaktor, x);
                            break;
                    }
                    break;


                //Quadratische Gleichungen


                case 2:
                    System.out.println("Geben sie P und Q ein");
                    double p = IO2.readDouble();
                    double q = IO2.readDouble();
                    System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                    System.out.println("|Ihr Thema ist\tQuadratische Gleichungen     |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Wähle dein Thema aus und schreibe dafür     |");
                    System.out.println("|die benötigte Zahl.         =)              |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Thema\t\t\t\t\t\t| Zahl  |        |");
                    System.out.println("|                           |       |        |");
                    System.out.println("|QuadratischeGeleichung     |  [1]  |        |");
                    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    System.out.print("\t\t\tMeine Themen Nr --->");

                    int QG = IO2.readInteger();

                    switch (QG) {
                        case 1:
                            quadratischerGleichungen.berechnePQFormel(p, q);
                            break;
                    }
                    break;


                //Statistische Auswertungen


                case 3:
                    System.out.println("Wie viele werte wollen sie eingeben?");
                    int anzahl = IO2.readInteger();
                    double[] zahlenliste = IO2.readDoubleArray(anzahl);
                    System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                    System.out.println("|Ihr Thema ist\tStatistische Auswertungen    |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Wähle dein Thema aus und schreibe dafür     |");
                    System.out.println("|die benötigte Zahl.         =)              |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Thema\t\t\t\t\t\t| Zahl  |        |");
                    System.out.println("|                           |       |        |");
                    System.out.println("|Ermittle Minimum           |  [1]  |        |");
                    System.out.println("|Ermittle Maximum           |  [2]  |        |");
                    System.out.println("|Ermittle Spannweite        |  [3]  |        |");
                    System.out.println("|Maximale Abweichung        |  [4]  |        |");
                    System.out.println("|Minimale Abweichung        |  [5]  |        |");
                    System.out.println("|Arthimetisches Mittel      |  [6]  |        |");
                    System.out.println("|Geometrisches Mittel       |  [7]  |        |");
                    System.out.println("|Mittelwert/Modalwert       |  [8]  |        |");
                    System.out.println("|Varianz                    |  [9]  |        |");
                    System.out.println("|Standartabweichug          |  [10] |        |");
                    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    System.out.print("\t\t\tMeine Themen Nr --->");

                    int SA = IO2.readInteger();

                    switch (SA) {
                        case 1:
                            StatistischeAuswertung.ermittelnDouMin(zahlenliste);
                            break;
                        case 2:
                            StatistischeAuswertung.ermittelnDouMax(zahlenliste);
                            break;
                        case 3:
                            StatistischeAuswertung.ermittelnspann(zahlenliste);
                            break;
                        case 4:
                            StatistischeAuswertung.maxAbweichung(zahlenliste);
                            break;
                        case 5:
                            StatistischeAuswertung.minAbweichung(zahlenliste);
                            break;
                        case 6:
                            StatistischeAuswertung.arthimetischesMittel(zahlenliste);
                            break;
                        case 7:
                            StatistischeAuswertung.geometrischesMittel(zahlenliste);
                            break;
                        case 8:
                            StatistischeAuswertung.mittelwert(zahlenliste);
                            break;
                        case 9:
                            StatistischeAuswertung.ermittleMedian(zahlenliste);
                            break;
                        case 10:
                            StatistischeAuswertung.standartabweichung(zahlenliste);
                            break;
                    }
                    break;


                //Vektorrechnung


                case 4:
                    System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                    System.out.println("|Ihr Thema ist\tVektorrechnung               |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Wähle dein Thema aus und schreibe dafür     |");
                    System.out.println("|die benötigte Zahl.         =)              |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Thema\t\t\t\t\t\t| Zahl  |        |");
                    System.out.println("|                           |       |        |");
                    System.out.println("|MultiplikationMiteinerZahl |  [?]  |        |");
                    System.out.println("|SkalarproduktBerechnung    |  [?]  |        |");
                    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    System.out.print("\t\t\tMeine Themen Nr --->");

                    //int VR = IO2.readInteger();
                    //switch (VR) {
                    //    case
                    //}
                    break;


                //Matritzenrechnung


                case 5:
                    System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
                    System.out.println("|Ihr Thema ist\tMatritzenrechnung            |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Wähle dein Thema aus und schreibe dafür     |");
                    System.out.println("|die benötigte Zahl.         =)              |");
                    System.out.println("|--------------------------------------------|");
                    System.out.println("|Thema\t\t\t\t\t\t| Zahl  |        |");
                    System.out.println("|                           |       |        |");
                    System.out.println("|Multiplika.EinerZahl       |  [1]  |        |");
                    System.out.println("|Multiplika.ZweierMatrizen  |  [2]  |        |");
                    System.out.println("|Additionzweiermatrizen     |  [3]  |        |");
                    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    System.out.print("\t\t\tMeine Themen Nr --->");

                    int MR = IO2.readInteger();

                    switch (MR) {
                        case 1:

                            System.out.println("Geben sie x ein.");
                            double x1 = IO2.readDouble();
                            System.out.println("Wie lang geht das Array?");
                            int anzahl1 = IO2.readInteger();
                            System.out.println("Wie breit ist das Array?");
                            int anzahl2 = IO2.readInteger();
                            System.out.println("Füllen sie die Array Listen");
                            int [][] multiplikation = IO2.arrayInt2D(anzahl1,anzahl2);

                           MatrizenRechnung.MultiplikationeinerZahl(x1,multiplikation);
                            break;
                        case 2:
                            System.out.println("Wie lang geht das erste Array?");
                            int anzahl3 = IO2.readInteger();
                            System.out.println("Wie breit ist das erste Array?");
                            int anzahl4 = IO2.readInteger();
                            System.out.println("Füllen sie erste Array Liste");
                            int [][] multiplikation1 = IO2.arrayInt2D(anzahl3,anzahl4);
                            System.out.println("Wie lang geht das zweite Array?");
                            int anzahl5 = IO2.readInteger();
                            System.out.println("Wie breit ist das zweite Array?");
                            int anzahl6 = IO2.readInteger();
                            System.out.println("Füllen sie zweite Array Liste");
                            int [][] multiplikation2 = IO2.arrayInt2D(anzahl5,anzahl6);
                            MatrizenRechnung.MultiplikationZweierMatrizen(multiplikation1,multiplikation2);
                            break;
                        case 3:
                            System.out.println("Wie lang geht das erste Array?");
                            int anzahl7 = IO2.readInteger();
                            System.out.println("Wie breit ist das erste Array?");
                            int anzahl8 = IO2.readInteger();
                            System.out.println("Füllen sie erste Array Liste");
                            int [][] multiplikation3 = IO2.arrayInt2D(anzahl7,anzahl8);
                            System.out.println("Wie lang geht das zweite Array?");
                            int anzahl9 = IO2.readInteger();
                            System.out.println("Wie breit ist das zweite Array?");
                            int anzahl10 = IO2.readInteger();
                            System.out.println("Füllen sie zweite Array Liste");
                            int [][] multiplikation4 = IO2.arrayInt2D(anzahl9,anzahl10);
                            MatrizenRechnung.Additionzweiermatrizen(multiplikation3,multiplikation4);
                            break;
                    }
                    break;
                default:
                    System.out.println("Bitte schreibe eine andere Zahl aus den vorgegebenenbereich");
            }


            //While Schleife wo gefragt wird ob alles wiederholt wird
            //Der startpunkt ist wieder am Anfang des Menü's =)

            //Späteres "Luxus Update": while Schleifen für jedes Thema einrichten um nicht ganz am Anfang zu starten.


            System.out.println("");
            System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
            System.out.println("|Prozess wiederholen?|");
            System.out.println("|J= JA               |");
            System.out.println("|N= NEIN             |");
            System.out.println("|                    |");
            System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        } while (IO2.readboolean());
    }
}
// Die für die Switch/case zugewiesenen Variablen Namen (int) sind die Passenden Anfangsbuchstaben der Themen.
//themenNR  = auswahl aller Themen
//WZ        = Wachstum/Zerfall
//QG        = Quadratische/Gleichungen
//SA        =  Statistische Auswertungen
//VR        = Vektor Rechnungen ( nein leute, ich meine nicht die VR Brille :P ) =)
//MR        = Matritzen Rechnungen

//Weitere Anmerkungen:
//in manchen Klassen sind Methoden noch Groß geschrieben die müssen wir zu Klein ändern