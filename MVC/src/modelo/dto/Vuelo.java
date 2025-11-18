package modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable {

    public int numero;
    public String origen;
    public String destino;
    public Date fechaSalida;
    public Date horaSalida;
    public String aerolinea;

    public Asiento[][] asientos;

    public Vuelo(int numero, String origen, String destino, Date fechaSalida,
                 Date horaSalida, String aerolinea, int filas, int columnas) {

        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.aerolinea = aerolinea;

        generarAsientos(filas, columnas);
    }

    public void generarAsientos(int filas, int columnas) {
        asientos = new Asiento[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char letra = (char) ('A' + j);
                asientos[i][j] = new Asiento(i + 1, letra);
            }
        }
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }
}