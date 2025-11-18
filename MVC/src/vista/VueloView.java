/*
 * Samuel Mora, David Ramos, Nelcy Caro
 */

package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class VueloView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel vuelo;
	public JTextField tfNumero;
	public JTable tTablaVuelos;
	public JTable tTablaAsientos;
	public JTextField tfFilas;
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueloView frame = new VueloView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VueloView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 459);
		vuelo = new JPanel();
		vuelo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(vuelo);
		vuelo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número de Vuelo");
		lblNewLabel.setBounds(10, 47, 90, 14);
		vuelo.add(lblNewLabel);
		
		tfNumero = new JTextField();
		tfNumero.setToolTipText("");
		tfNumero.setBounds(110, 44, 180, 20);
		vuelo.add(tfNumero);
		tfNumero.setColumns(10);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(9, 83, 46, 14);
		vuelo.add(lblOrigen);
		
		JComboBox cbOrigen = new JComboBox();
		cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"Bogotá", "Medellín", "Santa Marta", "Cali"}));
		cbOrigen.setBounds(109, 79, 180, 22);
		vuelo.add(cbOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(10, 120, 46, 14);
		vuelo.add(lblDestino);
		
		JComboBox cbDestino = new JComboBox();
		cbDestino.setModel(new DefaultComboBoxModel(new String[] {"Bogotá", "Medellín", "Santa Marta", "Cali"}));
		cbDestino.setBounds(110, 116, 180, 22);
		vuelo.add(cbDestino);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de Salida");
		lblNewLabel_1.setBounds(336, 43, 86, 14);
		vuelo.add(lblNewLabel_1);
		
		JSpinner sFechaHora = new JSpinner();
		sFechaHora.setModel(new SpinnerDateModel(new Date(1762837200000L), new Date(1762837200000L), null, Calendar.DAY_OF_YEAR));
		sFechaHora.setBounds(436, 40, 179, 20);
		vuelo.add(sFechaHora);
		
		JLabel lblNewLabel_1_2 = new JLabel("Aerolínea");
		lblNewLabel_1_2.setBounds(335, 79, 51, 14);
		vuelo.add(lblNewLabel_1_2);
		
		JComboBox cbAerolinea = new JComboBox();
		cbAerolinea.setModel(new DefaultComboBoxModel(new String[] {"Avianca", "Latam", "Wingo"}));
		cbAerolinea.setBounds(435, 75, 180, 22);
		vuelo.add(cbAerolinea);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrear.setBounds(686, 31, 89, 23);
		vuelo.add(btnCrear);
		
		JButton btnLeer = new JButton("Mostrar");
		btnLeer.setBounds(685, 65, 89, 23);
		vuelo.add(btnLeer);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(685, 99, 89, 23);
		vuelo.add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(685, 133, 89, 23);
		vuelo.add(btnEliminar);
		
		JButton btnLeerTodos = new JButton("Mostrar Todos");
		btnLeerTodos.setBounds(652, 386, 123, 23);
		vuelo.add(btnLeerTodos);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Asientos");
		lblNewLabel_1_2_1.setBounds(336, 116, 51, 14);
		vuelo.add(lblNewLabel_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 183, 474, 187);
		vuelo.add(scrollPane);
		
		tTablaVuelos = new JTable();
		tTablaVuelos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00FAmero de Vuelo", "Origen", "Destino", "Fecha de Salida", "Aerol\u00EDnea"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tTablaVuelos.getColumnModel().getColumn(0).setResizable(false);
		tTablaVuelos.getColumnModel().getColumn(0).setPreferredWidth(94);
		tTablaVuelos.getColumnModel().getColumn(1).setResizable(false);
		tTablaVuelos.getColumnModel().getColumn(2).setResizable(false);
		tTablaVuelos.getColumnModel().getColumn(3).setResizable(false);
		tTablaVuelos.getColumnModel().getColumn(3).setPreferredWidth(87);
		tTablaVuelos.getColumnModel().getColumn(4).setResizable(false);
		scrollPane.setViewportView(tTablaVuelos);
		
		JLabel lblNewLabel_2 = new JLabel("Vuelos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 11, 473, 25);
		vuelo.add(lblNewLabel_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(517, 183, 280, 187);
		vuelo.add(scrollPane_1);
		
		tTablaAsientos = new JTable();
		tTablaAsientos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fila", "Asiento", "Disponibilidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tTablaAsientos.getColumnModel().getColumn(0).setResizable(false);
		tTablaAsientos.getColumnModel().getColumn(0).setPreferredWidth(37);
		tTablaAsientos.getColumnModel().getColumn(1).setResizable(false);
		tTablaAsientos.getColumnModel().getColumn(1).setPreferredWidth(60);
		tTablaAsientos.getColumnModel().getColumn(2).setResizable(false);
		tTablaAsientos.getColumnModel().getColumn(2).setPreferredWidth(92);
		scrollPane_1.setViewportView(tTablaAsientos);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Asientos por Fila");
		lblNewLabel_1_2_1_1.setBounds(436, 151, 90, 14);
		vuelo.add(lblNewLabel_1_2_1_1);
		
		tfFilas = new JTextField();
		tfFilas.setBounds(567, 117, 48, 20);
		vuelo.add(tfFilas);
		tfFilas.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(567, 148, 48, 20);
		vuelo.add(textField);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Filas");
		lblNewLabel_1_2_1_1_1.setBounds(436, 116, 90, 14);
		vuelo.add(lblNewLabel_1_2_1_1_1);
	}
}
