package modelo.dto;

import java.io.Serializable;

public class Pasajero implements Serializable {
    public String nombre;
    public String correoElectronico;

    public Pasajero(String nombre, String correo) {
        this.nombre = nombre;
        this.correoElectronico = correo;
    }
}