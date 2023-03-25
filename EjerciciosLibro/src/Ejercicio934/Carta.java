package Ejercicio934;

import java.util.Random;

public class Carta implements Comparable<Carta> {

    private int numero;
    private Palo palo;

    public enum Palo {
        COPAS, OROS, BASTOS, ESPADAS
    }

    public Carta(Palo palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public int compareTo(Carta o) {
        if (this.palo != o.palo) {
            return this.palo.compareTo(o.palo);
        }
        return this.numero - o.numero;
    }

    public static Carta cartaAlAzar() {
        Random rand = new Random();
        int numero = rand.nextInt(12) + 1;
        int paloIndice = rand.nextInt(Palo.values().length);
        Palo palo = null;
        switch (paloIndice) {
            case 0:
                palo = Palo.COPAS;
                break;
            case 1:
                palo = Palo.OROS;
                break;
            case 2:
                palo = Palo.BASTOS;
                break;
            case 3:
                palo = Palo.ESPADAS;
                break;
        }
        return new Carta(palo, numero);
    }

    @Override
    public String toString() {
        return "Carta [numero=" + numero + ", palo=" + palo + "]";
    }
}
