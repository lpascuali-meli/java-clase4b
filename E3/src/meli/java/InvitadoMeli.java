package meli.java;

public class InvitadoMeli extends Invitado{
    public InvitadoMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void entregarTorta() {
        System.out.println(this.getNombre() + " dice VIVA LA CHIQUI!");;
    }
}
