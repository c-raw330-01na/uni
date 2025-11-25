package modelo.dto;

import modelo.dto.Pasajero;

public class Asiento {
  
	private int fila;
	private char asiento;
	private Pasajero pasajero;
	
	public Asiento(int i, char letra) {
		// TODO Auto-generated constructor stub
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public char getAsiento() {
		return asiento;
	}
	public void setAsiento(char asiento) {
		this.asiento = asiento;
	}
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

}
 