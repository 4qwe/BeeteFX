package sim;


//Klasse für die Hauptmenü-Logik - Variablen und Methoden
public class MainLogik {

    private int MAX_PLOTS = 20;
    protected Plot[] plots = new Plot[MAX_PLOTS]; //leeres Array mit X Elementen

    //BESCHREIBEN des arrays
    public void writePlotArray(int w) {
        for (int i = 0; i < w; i++) {   //Ich erstelle w Beetobjekte und versehe sie mit random Wasserstand
            int rando = (int) (Math.random() * 100 + 1);
            plots[i] = new Plot(i + 1, -1, rando); //"Plot" ist
        }
    }


    public void initBtns(simController sim, Plot[] plo) {
        sim.b1.setText(String.valueOf(plo[0].wasserstand));
        sim.b2.setText(String.valueOf(plo[1].wasserstand));
        sim.b3.setText(String.valueOf(plo[2].wasserstand));
        sim.b4.setText(String.valueOf(plo[3].wasserstand));
        sim.b5.setText(String.valueOf(plo[4].wasserstand));
    }
}