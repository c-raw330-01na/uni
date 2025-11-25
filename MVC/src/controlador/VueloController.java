package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.VueloDAO;
import modelo.dto.Asiento;
import modelo.dto.Vuelo;
import vista.VueloView;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VueloController implements ActionListener{
	private VueloDAO modelo;
	private VueloView vista;
	private Vuelo vuelo;
	private int index;
	
	
	public VueloController(VueloView vista) {
		this.vista = vista;
		this.modelo =new VueloDAO();
		
		this.vista.btnCrear.addActionListener(this);
		this.vista.btnActualizar.addActionListener(this);
		this.vista.btnLeer.addActionListener(this);
		this.vista.btnEliminar.addActionListener(this);
		this.vista.btnLeerTodos.addActionListener(this);
		
		this.vista.setVisible(true);

	}
	
	
	
	
	public VueloController(VueloDAO modelo, VueloView vista) {
		this.modelo = modelo;
		this.vista = vista;
		
	}
	
	public void crear() {
		Vuelo vuelo =new Vuelo();
		
		vuelo.setNumero(Integer.valueOf(vista.tfNumero.getText()));
		vuelo.setOrigen((String) vista.cbOrigen.getSelectedItem());
		vuelo.setDestino((String) vista.cbDestino.getSelectedItem());
		vuelo.setAerolinea((String) vista.cbAerolinea.getSelectedItem());
		vuelo.setFechaHoraSalida((Date) vista.sFechaHora.getValue());

		if(modelo.crear(vuelo))
			JOptionPane.showMessageDialog(null, "Vuelo Creado");
		else
			JOptionPane.showMessageDialog(null, "Vuelo NO Creado");
	}
	
	public void leer() {
		Vuelo buscar =new Vuelo();
		buscar.setNumero(Integer.valueOf(vista.tfNumero.getText()));
		
		Vuelo encontrado = (Vuelo) modelo.leer(buscar);
		if(encontrado == null)
			JOptionPane.showMessageDialog(null, "Vuelo NO Encontrado");
		else
			JOptionPane.showMessageDialog(null, "Vuelo Encontrado");
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource().equals(this.vista.btnCrear))
			crear();	
		if(e.getSource().equals(this.vista.btnLeer))
			leer();
		if(e.getSource().equals(this.vista.btnActualizar))
			actualizar();
		if(e.getSource().equals(this.vista.btnEliminar))
			eliminar();
		if(e.getSource().equals(this.vista.btnLeerTodos))
			leerTodos();
		
	}
		
	public void  actualizar() {
		Vuelo vuelo =new Vuelo();
		
		vuelo.setOrigen((String) vista.cbOrigen.getSelectedItem());
		vuelo.setDestino((String) vista.cbDestino.getSelectedItem());
		vuelo.setAerolinea((String) vista.cbAerolinea.getSelectedItem());
		vuelo.setFechaHoraSalida((Date) vista.sFechaHora.getValue());

		if(modelo.crear(vuelo))
			JOptionPane.showMessageDialog(null, "Vuelo Actualizado");
		else
			JOptionPane.showMessageDialog(null, "Vuelo NO Actualizado");
	}
	
	public void eliminar() {
	}
	
	
	public void leerTodos() {
		DefaultTableModel modeloTabla;
		DefaultTableModel modeloTabla1;
		
		modeloTabla = (DefaultTableModel) this.vista.tTablaVuelos.getModel();
		modeloTabla1 = (DefaultTableModel) this.vista.tTablaAsientos.getModel();

		List<Vuelo> lista = modelo.leerTodos();
		List<Asiento> lista1 = modelo.leerTodos();
		
		int filas = modeloTabla.getRowCount();
		int filas1 = modeloTabla1.getRowCount();
		
		for (int i = 0; i < filas; i++) {
			modeloTabla.removeRow(0);
		}
		
		for (int i = 0; i < filas1; i++) {
			modeloTabla1.removeRow(0);
		}
		
		for (Vuelo vuelo : lista) {
			Object[] fila = {vuelo.getNumero(), vuelo.getOrigen(), vuelo.getDestino(), vuelo.getFechaHoraSalida(), vuelo.getAerolinea()};
			modeloTabla.addRow(fila);
		}
		
		for (Asiento asiento : lista1) {
			Object[] fila1 = {asiento.getFila(), asiento.getAsiento()};
			modeloTabla1.addRow(fila1);
		}
	}

}