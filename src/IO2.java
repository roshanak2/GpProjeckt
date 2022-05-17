import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class IO2 {

        public static double[] readDoubleArray;
        private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        public static String readString() throws IOException {
            String text = bufferedReader.readLine();
            return text;
        }
        public static String[] readStringArray(int anzahl) throws IOException {
            String[] liste = new String[anzahl];
            for (int i = 0; i<liste.length; i++)
            {
                System.out.println("wert " + (i+1) + ": ");
                liste[i] = readString();
            }
            return liste;
        }




        public static int readInteger() throws IOException {
            while (true) {
                String text = bufferedReader.readLine();
                try {
                    int zahl = Integer.parseInt(text);
                    return zahl;
                } catch (NumberFormatException e) {
                    System.out.println("Falsche Eingabe");
                }
            }
        }
        public static int[] readIntegerArray(int anzahl) throws IOException {
            int[] liste = new int[anzahl];
            for (int i = 0; i<liste.length; i++)
            {
                System.out.println("wert " + (i+1) + ": ");
                liste[i] = readInteger();
            }
            return liste;
        }

        public static int ermittelnIntMin(int[] zahl) {
            int min = zahl[0];
            for (int i = 1; i< zahl.length; i++)
            {
                // min = Math.min(min , zahl[1]);
                if(zahl[i] < min){
                    min = zahl[i];
                }
            }
            return min ;
        }

        public static int ermittelnIntMax(int[] zahl) {
            int max = zahl[0];
            for (int i = 1; i< zahl.length; i++)
            {
                // min = Math.min(min , zahl[1]);
                if(zahl[i] > max){
                    max = zahl[i];
                }
            }
            return max ;
        }





        public static double readDouble() throws IOException {
            while (true) {
                String text = bufferedReader.readLine();
                try {
                    double komazahl = Double.parseDouble(text);
                    return komazahl;
                } catch (NumberFormatException o) {
                    System.out.println("Falsche Eingabe");
                }
            }
        }
        public static double[] readDoubleArray(int anzahl) throws IOException {
            double[] liste = new double[anzahl];
            for (int i = 0; i<liste.length; i++)
            {
                System.out.println("wert " + (i+1) + ": ");
                liste[i] = readDouble();
            }
            return liste;
        }

        public static double ermittelnDouMin(double[] zahl) {
            double min = zahl[0];
            for (int i = 1; i< zahl.length; i++)
            {
                // min = Math.min(min , zahl[1]);
                if(zahl[i] < min){
                    min = zahl[i];
                }
            }
            return min ;
        }

        public static double ermittelnDouMax(double[] zahl) {
            double max = zahl[0];
            for (int i = 1; i< zahl.length; i++)
            {
                // min = Math.min(min , zahl[1]);
                if(zahl[i] > max){
                    max = zahl[i];
                }
            }
            return max ;
        }





        public static boolean readboolean() throws IOException {
            while (true)
            {
                String eingabe = bufferedReader.readLine();
                if (eingabe != null)
                    return true;
                else
                    return false;
            }

        }
        public static boolean[] readBooleanArray(int anzahl) throws IOException {
            boolean[] liste = new boolean[anzahl];
            for (int i = 0; i<liste.length; i++)
            {
                System.out.println("wert " + (i+1) + ": ");
                liste[i] = readboolean();
            }
            return liste;
        }



    }


