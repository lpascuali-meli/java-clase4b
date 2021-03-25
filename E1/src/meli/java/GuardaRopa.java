package meli.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GuardaRopa {
    private int contador;
    private HashMap<Integer, ArrayList<Prenda>> prendas;

    public GuardaRopa() {
        this.contador = 0;
        this.prendas = new HashMap<Integer, ArrayList<Prenda>>();
    }

    private int getContador() {
        return contador;
    }

    private HashMap<Integer, ArrayList<Prenda>> getPrendas() {
        return prendas;
    }

    private void incrementsContador() {
        this.contador += 1;
    }

    public int guardarPrendas(ArrayList<Prenda> listaDePrenda) {
        this.incrementsContador();
        int index = this.getContador();
        this.prendas.put(index, listaDePrenda);
        return index;
    }

    public void mostrarPrendas() {
        for(Map.Entry<Integer,ArrayList<Prenda>> entry:this.prendas.entrySet())
        {
            Integer key = entry.getKey();
            ArrayList<Prenda> value = entry.getValue();
            System.out.println("Prendas nùmero " + key + ": " + Arrays.toString(value.toArray()));
        }
    }

    public ArrayList<Prenda> devolverPrendas(Integer numero) {
        ArrayList<Prenda> prendasADevolver = (ArrayList<Prenda>) this.prendas.get(numero).clone();
        this.prendas.remove(numero);
        return prendasADevolver;
    }
}
