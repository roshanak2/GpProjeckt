public class quadratischerGleichungen {

    public String berechnePQFormel(double p, double q) {
        double diskriminante;
        diskriminante = (p / 2) * (p / 2) - p;
        if (diskriminante >= 0) {
            double x1, x2;
            x1 = -(p / 2) + Math.sqrt(diskriminante);
            x2 = -(p / 2) - Math.sqrt(diskriminante);
            if (x1 == x2) {
                return "Das Ergebnis ist L={" + x2 + "}";
            } else {
                return "Die Ergebnisse sind L={" + x1 + ";" + x2 + "}";
            }
        } else {
            return "Keine Lösung, die Diskriminate ist " + diskriminante;
        }
    }
}
