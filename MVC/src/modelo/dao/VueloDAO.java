package modelo.dao;

import java.util.List;

import modelo.dto.Vuelo;

public class VueloDAO implements ICrud {

    Persistencia persistencia = new Persistencia();

    public VueloDAO() {
        persistencia.cargar();
    }

    @Override
    public boolean crear(Object object) {
        persistencia.lista.add((Vuelo)object);
        persistencia.guardar();
        return true;
    }

    @Override
    public Object leer(Object object) {
        int numero = (int) object;

        for (Vuelo v : persistencia.lista) {
            if (v.numero == numero) return v;
        }
        return null;
    }

    @Override
    public Object actualizar(int index, Object object) {
        persistencia.lista.set(index, (Vuelo)object);
        persistencia.guardar();
        return object;
    }

    @Override
    public boolean eliminar(Object object) {
        Vuelo v = (Vuelo)object;

        return persistencia.lista.remove(v);
    }

    @Override
    public int buscar(Object object) {
        int numero = (int)object;

        for (int i=0; i<persistencia.lista.size(); i++) {
            if (persistencia.lista.get(i).numero == numero) return i;
        }

        return -1;
    }

    @Override
    public List leerTodos() {
        return persistencia.lista;
    }
}