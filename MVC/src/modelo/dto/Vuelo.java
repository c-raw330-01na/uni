package modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable {

    public int numero;
    public String origen;
    public String destino;
    public Date fechaHoraSalida;
    public Date horaSalida;
    public String aerolinea;

    public Asiento[][] asientos;

    public void generarAsientos(int filas, int columnas) {
        asientos = new Asiento[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char letra = (char) ('A' + j);
                asientos[i][j] =new Asiento(i + 1, letra);
            }
        }
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }
    
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}


	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}


	public String getAerolinea() {
		return aerolinea;
	}


	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
}