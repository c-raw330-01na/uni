package modelo.dao;

import java.util.List;
import modelo.dto.Vuelo;

public class VueloDAO extends Persistencia<Vuelo> implements ICrud {

    public VueloDAO() {
        super("vuelo");
    }

    @Override
    public boolean crear(Object object) {
        boolean estado = lista.add((Vuelo)object);
        guardar();
        return estado;
    }

    @Override
    public Object leer(Object object) {
        int numero = (int) object;

        for (Vuelo vuelo : lista) {
            if (vuelo.numero == numero)
            	return vuelo;
        }
        return null;
    }

    @Override
    public Object actualizar(int index, Object object) {
        lista.set(index, (Vuelo)object);
        guardar();
        return object;
    }

    @Override
    public boolean eliminar(Object object) {
        boolean estado = lista.remove(object);
        guardar();
        return estado;
    }

    @Override
    public int buscar(Object object) {
        return lista.indexOf(object);
    }

    @Override
    public List leerTodos() {
        return lista;
    }
}