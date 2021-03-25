package meli.java;

import java.util.ArrayList;

public class FuegoArtificialPack implements FuegoArtificial{
    private ArrayList<FuegoArtificialIndividual> fuegos;

    public FuegoArtificialPack() {
        this.fuegos = new ArrayList<FuegoArtificialIndividual>();
    }

    public void agregarFuego(FuegoArtificialIndividual fuego) {
        this.fuegos.add(fuego);
    }

    @Override
    public void sonar() {
        for (FuegoArtificialIndividual fuego:fuegos) {
            fuego.sonar();
        }
    }
}