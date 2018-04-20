package packageDeCalidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class Funcionabilidad extends JFrame {

	private JPanel contentPane;

	private Maestra maestra;

	public Maestra getMaestra() {
		return this.maestra;
	}

	public void setMaestra(Maestra maestra) {
		this.maestra = maestra;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionabilidad frame = new Funcionabilidad(new Maestra());
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param maestra
	 */
	public Funcionabilidad(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElSoftwareDebe = new JLabel(
				"\u00BFEl software permite eliminar los datos de los clientes y empleados cuando lo soliciten?");
		lblElSoftwareDebe.setBounds(10, 52, 508, 14);
		contentPane.add(lblElSoftwareDebe);

		JRadioButton rdbtn11 = new JRadioButton("No");
		rdbtn11.setBounds(6, 84, 109, 23);
		rdbtn11.setActionCommand("1");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn12 = new JRadioButton("A veces");
		rdbtn12.setBounds(6, 110, 109, 23);
		rdbtn12.setActionCommand("3");
		contentPane.add(rdbtn12);

		JRadioButton rdbtn13 = new JRadioButton("Si");
		rdbtn13.setBounds(6, 136, 109, 23);
		rdbtn13.setActionCommand("5");
		contentPane.add(rdbtn13);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn12);
		grupo1.add(rdbtn13);

		JLabel lblConCuantasDe = new JLabel(
				"\u00BFCon cu\u00E1ntas de las siguientes caracter\u00EDsticas cumple el software?");
		lblConCuantasDe.setBounds(14, 176, 459, 14);
		contentPane.add(lblConCuantasDe);

		JLabel lblNewLabel = new JLabel("- Cifrado de los datos de clientes y empleados");
		lblNewLabel.setBounds(24, 201, 494, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("- Sistema de inicio de sesi\u00F3n");
		lblNewLabel_1.setBounds(24, 226, 494, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(
				"- Perfiles con permisos de ingreso de datos y lectura de datos por separado");
		lblNewLabel_2.setBounds(24, 251, 494, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(
				"- Datos biom\u00E9tricos para autorizar el inicio de sesi\u00F3n (huella digital / iris / rostro)");
		lblNewLabel_3.setBounds(24, 276, 494, 14);
		contentPane.add(lblNewLabel_3);

		JRadioButton rdbtn21 = new JRadioButton("0");
		rdbtn21.setBounds(10, 307, 109, 23);
		rdbtn21.setActionCommand("1");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn22 = new JRadioButton("1");
		rdbtn22.setBounds(10, 333, 109, 23);
		rdbtn22.setActionCommand("2");
		contentPane.add(rdbtn22);

		JRadioButton rdbtn23 = new JRadioButton("2");
		rdbtn23.setBounds(10, 359, 109, 23);
		rdbtn23.setActionCommand("3");
		contentPane.add(rdbtn23);

		JRadioButton rdbtn24 = new JRadioButton("3");
		rdbtn24.setBounds(10, 385, 109, 23);
		rdbtn24.setActionCommand("4");
		contentPane.add(rdbtn24);

		JRadioButton rdbtn25 = new JRadioButton("4");
		rdbtn25.setBounds(10, 411, 109, 23);
		rdbtn25.setActionCommand("5");
		contentPane.add(rdbtn25);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn21);
		grupo2.add(rdbtn22);
		grupo2.add(rdbtn23);
		grupo2.add(rdbtn24);
		grupo2.add(rdbtn25);

		JLabel lblUnInformeGenerado = new JLabel(
				"\u00BFUn informe generado corresponde con los datos ingresados durante el alta?");
		lblUnInformeGenerado.setBounds(14, 460, 459, 14);
		contentPane.add(lblUnInformeGenerado);

		JRadioButton rdbtn31 = new JRadioButton("No");
		rdbtn31.setBounds(10, 492, 109, 23);
		rdbtn31.setActionCommand("1");
		contentPane.add(rdbtn31);

		JRadioButton rdbtn32 = new JRadioButton("A veces");
		rdbtn32.setBounds(10, 518, 109, 23);
		rdbtn32.setActionCommand("3");
		contentPane.add(rdbtn32);

		JRadioButton rdbtn33 = new JRadioButton("Si");
		rdbtn33.setBounds(10, 544, 109, 23);
		rdbtn33.setActionCommand("5");
		contentPane.add(rdbtn33);

		ButtonGroup grupo3 = new ButtonGroup();
		grupo3.add(rdbtn31);
		grupo3.add(rdbtn32);
		grupo3.add(rdbtn33);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (grupo1.getSelection() == null || grupo2.getSelection() == null || grupo3.getSelection() == null) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opción en todas las preguntas",
							"Opción inválida", JOptionPane.ERROR_MESSAGE);
				} else {
					int pje1 = Integer.parseInt(grupo1.getSelection().getActionCommand());
					int pje2 = Integer.parseInt(grupo2.getSelection().getActionCommand());
					int pje3 = Integer.parseInt(grupo3.getSelection().getActionCommand());

					float promedio = (float) (pje1 + pje2 + pje3) / 3;
					maestra.setFuncionabilidad(promedio);

					Eficiencia efi = new Eficiencia(getMaestra());
					efi.setLocationRelativeTo(null);
					efi.setVisible(true);
					cerrar();
				}
			}
		});
		btnSiguiente.setBounds(199, 578, 89, 23);
		contentPane.add(btnSiguiente);

		JLabel lblFuncionabilidad = new JLabel("FUNCIONABILIDAD");
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFuncionabilidad.setBounds(193, 18, 140, 23);
		contentPane.add(lblFuncionabilidad);
	}

	void cerrar() {
		this.setVisible(false);
	}
}
