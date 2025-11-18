package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTable;

public class AsignarAsientoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsignarAsientoView frame = new AsignarAsientoView();
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
	public AsignarAsientoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 467);
		getContentPane().setLayout(null);
		
		JPanel vuelo_1 = new JPanel();
		vuelo_1.setLayout(null);
		vuelo_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		vuelo_1.setBounds(0, 0, 807, 420);
		getContentPane().add(vuelo_1);
		
		JLabel lblNewLabel_3 = new JLabel("Número de Vuelo");
		lblNewLabel_3.setBounds(10, 47, 90, 14);
		vuelo_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(110, 44, 180, 20);
		vuelo_1.add(textField_3);
		
		JLabel lblOrigen_1 = new JLabel("Origen");
		lblOrigen_1.setBounds(9, 83, 46, 14);
		vuelo_1.add(lblOrigen_1);
		
		JLabel lblDestino_1 = new JLabel("Destino");
		lblDestino_1.setBounds(10, 120, 46, 14);
		vuelo_1.add(lblDestino_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de Salida");
		lblNewLabel_1_1.setBounds(11, 158, 86, 14);
		vuelo_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Aerolínea");
		lblNewLabel_1_2_2.setBounds(10, 194, 51, 14);
		vuelo_1.add(lblNewLabel_1_2_2);
		
		JButton btnCrear_1 = new JButton("Crear");
		btnCrear_1.setBounds(165, 250, 89, 23);
		vuelo_1.add(btnCrear_1);
		
		JButton btnLeer_1 = new JButton("Mostrar");
		btnLeer_1.setBounds(164, 284, 89, 23);
		vuelo_1.add(btnLeer_1);
		
		JButton btnActualizar_1 = new JButton("Actualizar");
		btnActualizar_1.setBounds(164, 318, 89, 23);
		vuelo_1.add(btnActualizar_1);
		
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setBounds(164, 352, 89, 23);
		vuelo_1.add(btnEliminar_1);
		
		JButton btnLeerTodos_1 = new JButton("Mostrar Todos");
		btnLeerTodos_1.setBounds(153, 386, 123, 23);
		vuelo_1.add(btnLeerTodos_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Asientos");
		lblNewLabel_1_2_1_2.setBounds(353, 45, 51, 14);
		vuelo_1.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Vuelos");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(10, 11, 473, 25);
		vuelo_1.add(lblNewLabel_2_1);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(353, 119, 280, 187);
		vuelo_1.add(scrollPane_1_1);
		
		table = new JTable();
		scrollPane_1_1.setViewportView(table);
		
		JLabel lblNewLabel_1_2_1_1_2 = new JLabel("Asiento");
		lblNewLabel_1_2_1_1_2.setBounds(453, 80, 90, 14);
		vuelo_1.add(lblNewLabel_1_2_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(584, 46, 48, 20);
		vuelo_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(584, 77, 48, 20);
		vuelo_1.add(textField_5);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Filas");
		lblNewLabel_1_2_1_1_1_1.setBounds(453, 45, 90, 14);
		vuelo_1.add(lblNewLabel_1_2_1_1_1_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBounds(110, 80, 180, 20);
		vuelo_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(110, 117, 180, 20);
		vuelo_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(110, 155, 180, 20);
		vuelo_1.add(textField_2);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setColumns(10);
		textField_6.setBounds(110, 195, 180, 20);
		vuelo_1.add(textField_6);
	}

}
