package meli.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Inicializo evento
        Evento evento = new Evento();

        // Creo invitado standard
        Invitado inv1 = new Invitado("Jorge");
        Invitado inv2 = new Invitado("Manuel");

        // Creo invitado meli
        Invitado inv3 = new InvitadoMeli("Juan");
        Invitado inv4 = new InvitadoMeli("Tomás");

        // Agrego invitados
        evento.agregarInvitado(inv1);
        evento.agregarInvitado(inv2);
        evento.agregarInvitado(inv3);
        evento.agregarInvitado(inv4);

        // Creamos 6 fuegos
        FuegoArtificialIndividual fuego1 = new FuegoArtificialIndividual();
        FuegoArtificialIndividual fuego2 = new FuegoArtificialIndividual();
        FuegoArtificialIndividual fuego3 = new FuegoArtificialIndividual();
        FuegoArtificialIndividual fuego4 = new FuegoArtificialIndividual();
        FuegoArtificialIndividual fuego5 = new FuegoArtificialIndividual();
        FuegoArtificialIndividual fuego6 = new FuegoArtificialIndividual();
        // Agregamos 3 individuales
        evento.agregarFuego(fuego1);
        evento.agregarFuego(fuego2);
        evento.agregarFuego(fuego3);
        // Y los otros tres en un pack
        FuegoArtificialPack pack1 = new FuegoArtificialPack();
        pack1.agregarFuego(fuego4);
        pack1.agregarFuego(fuego5);
        pack1.agregarFuego(fuego6);
        evento.agregarFuego(pack1);

        //Soplamos las velas
        evento.soplarVelas();
    }
}
