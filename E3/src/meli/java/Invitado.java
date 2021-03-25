package meli.java;

public class Invitado {
    private String nombre;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void entregarTorta() {
        System.out.println(this.nombre + " dice gracias.");
    }
}
