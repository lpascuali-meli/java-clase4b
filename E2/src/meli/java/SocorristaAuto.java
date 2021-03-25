package meli.java;

public class SocorristaAuto extends Auto {
    public SocorristaAuto(Double velocidad, Double aceleracion, Double AnguloDeGiro, String patente) {
        super(velocidad, aceleracion, AnguloDeGiro, patente);
    }

    public void socorrer(Auto unAuto) {
        System.out.println("Socorriendo auto " + unAuto.getPatente());
    }
}
