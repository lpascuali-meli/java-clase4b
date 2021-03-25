package meli.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Creando carrera: ");
        Carrera carrera = new Carrera(200.0, 50000.0, "Grand Prix", 5);
        System.out.println(carrera.darDeAltaAuto(200.0, 2.9, 5.0, "A1"));
        System.out.println(carrera.darDeAltaAuto(700.0, 1.9, 1.0, "A2"));
        System.out.println(carrera.darDeAltaAuto(300.0, 5.9, 3.0, "A3"));
        System.out.println(carrera.darDeAltaAuto(400.0, 2.9, 1.0, "A4"));
        System.out.println(carrera.darDeAltaAuto(100.0, 4.9, 4.0, "A5"));
        System.out.println(carrera.darDeAltaAuto(100.0, 4.9, 4.0, "A5"));

        System.out.println("Los participantes son: ");
        carrera.mostrarParticipantes();

        // Simulamos accidente
        carrera.socorrerAuto("A1");
        carrera.eliminarVehiculoConPatente("A1");

        // Mostramos lista de los que quedan
        System.out.println("Los participantes que qeudan son: ");
        carrera.mostrarParticipantes();

        // Mostramos ganador
        System.out.println("El ganador es:");
        System.out.println(carrera.getGanador());

    }
}
