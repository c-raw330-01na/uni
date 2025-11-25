package modelo.dto;

import java.io.Serializable;

public class Pasajero implements Serializable {
    public String nombre;
    public String correoElectronico;

    public Pasajero(String nombre, String correo) {
        this.nombre = nombre;
        this.correoElectronico = correo;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
}