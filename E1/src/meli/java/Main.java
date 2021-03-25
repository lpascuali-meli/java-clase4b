package meli.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creamos prendas
        Prenda p1 = new Prenda("Lacoste", "Chomba");
        Prenda p2 = new Prenda("Levis", "Jean");

        // Creamos lista de prendas para una persona
        ArrayList<Prenda> l1 = new ArrayList<Prenda>();
        l1.add(p1);
        l1.add(p2);

        // La guardamos en el guardarropas
        GuardaRopa guardaRopa = new GuardaRopa();
        int numero = guardaRopa.guardarPrendas(l1);

        System.out.println("El nùmero de sus prendas es " + numero);

        System.out.println("Las prendas en guardarropa son: ");
        guardaRopa.mostrarPrendas();

        ArrayList<Prenda> l2 = guardaRopa.devolverPrendas(numero);
        System.out.println("Retiró las siguientes prendas:");
        System.out.println(Arrays.toString(l2.toArray()));

        System.out.println("Las prendas en guardarropa son: ");
        guardaRopa.mostrarPrendas();
    }
}
