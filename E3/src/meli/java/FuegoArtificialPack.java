package meli.java;

import java.util.ArrayList;

public class FuegoArtificialPack implements FuegoArtificial{
    private ArrayList<FuegoArtificial> fuegos;

    public FuegoArtificialPack() {
        this.fuegos = new ArrayList<FuegoArtificial>();
    }

    public void agregarFuego(FuegoArtificial fuego) {
        this.fuegos.add(fuego);
    }

    @Override
    public void sonar() {
        for (FuegoArtificial fuego:fuegos) {
            fuego.sonar();
        }
    }
}