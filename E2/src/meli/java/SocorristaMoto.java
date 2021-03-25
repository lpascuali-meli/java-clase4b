package meli.java;

public class SocorristaMoto extends Moto {
    public SocorristaMoto(Double velocidad, Double aceleracion, Double AnguloDeGiro, String patente) {
        super(velocidad, aceleracion, AnguloDeGiro, patente);
    }

    public void socorrer(Moto unaMoto) {
        System.out.println("Socorriendo moto " + unaMoto.getPatente());
    }
}
