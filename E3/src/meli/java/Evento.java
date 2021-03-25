package meli.java;

import java.util.ArrayList;

public class Evento {
    private ArrayList<Invitado> invitados;
    private ArrayList<FuegoArtificial> fuegosArtificiales;

    public Evento() {
        this.invitados = new ArrayList<Invitado>();
        this.fuegosArtificiales = new ArrayList<FuegoArtificial>();
    }

    public void agregarInvitado (Invitado inv) {
        this.invitados.add(inv);
    }

    public void agregarFuego (FuegoArtificial fuego) {
        this.fuegosArtificiales.add(fuego);
    }

    public void soplarVelas() {
        for (Invitado invitado: invitados) {
            invitado.entregarTorta();
        }
        for (FuegoArtificial fuego: fuegosArtificiales) {
            fuego.sonar();
        }
    }
}
