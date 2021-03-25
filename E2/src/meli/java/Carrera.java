package meli.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Carrera {

    // ATRIBUTOS
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantMaxVehiculos;
    private HashMap<String, Vehiculo> listaVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    // CONSTRUCTOR
    public Carrera(double distancia, double premioEnDolares, String nombre, int cantMaxVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantMaxVehiculos = cantMaxVehiculos;
        this.listaVehiculos = new HashMap<String, Vehiculo>();
        this.socorristaAuto = new SocorristaAuto(200.0, 1.4, 4.0, "SPACECAR-Auto");
        this.socorristaMoto = new SocorristaMoto(200.0, 1.4, 4.0, "SPACECAR-Moto");
    }

    // GETTERS
    public double getDistancia() {
        return distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantMaxVehiculos() {
        return cantMaxVehiculos;
    }

    public HashMap<String, Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    // Punto 4
    public boolean darDeAltaVehiculo(Vehiculo vehiculo) {
        if (this.listaVehiculos.size() == this.getCantMaxVehiculos() ||
                this.getListaVehiculos().get(vehiculo.getPatente()) != null) { return false; }
        this.getListaVehiculos().put(vehiculo.getPatente(), vehiculo);
        return true;
    }
    public boolean darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        return this.darDeAltaVehiculo(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
    }
    public boolean darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        return this.darDeAltaVehiculo(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
    }

    // Punto 5
    public boolean eliminarVehiculoConPatente(String patente) {
        if (this.getListaVehiculos().get(patente) == null) { return false; }
        this.getListaVehiculos().remove(patente);
        return true;
    }
    public boolean eliminarVehiculo(Vehiculo vehiculo) {
        return this.eliminarVehiculoConPatente(vehiculo.getPatente());
    }

    // Punto 6
    private double calcularPuntacion(Vehiculo vehiculo) {
        return vehiculo.getVelocidad() * 0.5 * vehiculo.getAceleracion() / (vehiculo.getAnguloDeGiro() * (vehiculo.getPeso() - vehiculo.getRuedas() * 100));
    }
    public Vehiculo getGanador() {
        Vehiculo ganador = new Vehiculo();
        double puntuacionGanador = 0;
        for(Map.Entry<String, Vehiculo> entry:this.getListaVehiculos().entrySet()) {
            Vehiculo participante = entry.getValue();
            double puntuacionParticipante = calcularPuntacion(participante);
            if (puntuacionGanador < puntuacionParticipante) {
                ganador = participante;
                puntuacionGanador = puntuacionParticipante;
            }
        }
        return ganador;
    }

    // Punto 7
    public void socorrerAuto(String patente) {
        this.socorristaAuto.socorrer((Auto) this.getListaVehiculos().get(patente));
    }
    public void socorrerMoto(String patente) {
        this.socorristaMoto.socorrer((Moto) this.getListaVehiculos().get(patente));
    }

    public void mostrarParticipantes() {
        for(Map.Entry<String, Vehiculo> entry:this.getListaVehiculos().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
