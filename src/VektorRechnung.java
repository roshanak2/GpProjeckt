public class VektorRechnung {
/*
    // Objektvariablen
    private int x;
    private int y;
    private int z;

    // Konstruktor
    public static double vektor[int _x, int _y, int _z] {
        x = _x;
        y = _y;
        z = _z;
    }

    // Klassenmethoden
    // - Addition
    public Vektor add(Vektor a){
        Vektor b = new Vektor(x, y, z);
        b.x = x + a.x;
        b.y = y + a.y;
        b.z = z + a.z;
        return b;
    }

    // - Subtraktion
    public Vektor sub(Vektor a){
        Vektor b = new Vektor(x, y, z);
        b.x = x - a.x;
        b.y = y - a.y;
        b.z = z - a.z;
        return b;
    }

    // - Kreuzprodukt
    public Vektor kreuz(Vektor a) {
        Vektor b = new Vektor(x, y, z);
        b.x = y*a.z - z*a.y;
        b.y = z*a.x - x*a.z;
        b.z = x*a.y - y*a.x;
        return b;
    }

    // - Skalarprodukt
    public int skal(Vektor a) {
        int c = x*a.x + y*a.y + z*a.z;
        return c;
    }

    // - Ausgabe
    public void ausgabe() {
        System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")");
    }
}




*/


    public static double[] MultiplikationMiteinerZahl(double[] array1, double[] array2){
        // kreuzprodukt

        double[] array =  new double[array1.length];
        array[0] = (array1[1]*array2[2])-(array1[2]*array2[1]);
        array[1] = (array1[2]*array2[0])-(array1[0]*array2[2]);
        array[2] = (array1[0]*array2[1])-(array1[1]*array2[0]);

        return array;
    }

    // Skala

    public static double MultiplikationzweierVektoren(double[] v1, double[] v2) {

        double produkt = 0;



        for (int i = 0; i < v1.length; i++) {

            produkt = produkt + v1[i] * v2[i];

        }



        return produkt;



    }

/*
    public static double[] AdditionZweierVektoren(double[] array){
        double array1[] = new double[0];
    }*/

    }

