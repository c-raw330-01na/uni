package modelo.dto;

import java.io.Serializable;

public class Asiento implements Serializable {
    public int fila;
    public char asiento;
    public Pasajero pasajero;

    public Asiento(int fila, char asiento) {
        this.fila = fila;
        this.asiento = asiento;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}