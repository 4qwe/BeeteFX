package sim;

class Plot {

    protected int points; //für Form des Beets?
    protected int beetnummer; //Bezeichner
    protected int wasserstand;

    protected Plot(int n, int p, int w) {

        points = p;
        beetnummer = n;
        wasserstand = w;

    }

    public int getWasserstand() {
        return wasserstand;
    }

    public int getBeetnummer() {
        return beetnummer;
    }
}