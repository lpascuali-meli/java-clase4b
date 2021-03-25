package meli.java;

public class FuegoArtificialIndividual implements FuegoArtificial{
    private static int last = 0;
    private String sound;

    public FuegoArtificialIndividual() {
        this.sound = "Sonido" + last;
        last++;
    }

    @Override
    public void sonar() {
        System.out.println(this.sound);
    }
}
