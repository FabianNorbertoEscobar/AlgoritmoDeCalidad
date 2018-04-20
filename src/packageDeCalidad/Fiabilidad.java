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
public class Fiabilidad extends JFrame {

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
					Fiabilidad frame = new Fiabilidad(new Maestra());
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
	public Fiabilidad(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElSoftwareDebe = new JLabel(
				"Cuando sucede un error, \u00BFse protegen los datos ingresados para retornar con la actividad en curso?");
		lblElSoftwareDebe.setBounds(10, 52, 584, 14);
		contentPane.add(lblElSoftwareDebe);

		JRadioButton rdbtn11 = new JRadioButton("Los campos ingresados se pierden");
		rdbtn11.setBounds(6, 84, 360, 23);
		rdbtn11.setActionCommand("1");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn12 = new JRadioButton("El 50% de los datos ingresados se conservan");
		rdbtn12.setBounds(6, 110, 360, 23);
		rdbtn12.setActionCommand("2");
		contentPane.add(rdbtn12);

		JRadioButton rdbtn13 = new JRadioButton("El 75% de los datos ingresados se conservan");
		rdbtn13.setBounds(6, 136, 360, 23);
		rdbtn13.setActionCommand("4");
		contentPane.add(rdbtn13);

		JRadioButton rdbtn14 = new JRadioButton("Todos los datos ingresados se conservan");
		rdbtn14.setBounds(6, 162, 360, 23);
		rdbtn14.setActionCommand("5");
		contentPane.add(rdbtn14);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn12);
		grupo1.add(rdbtn13);
		grupo1.add(rdbtn14);

		JLabel lblConCuantasDe = new JLabel(
				"Al realizar un cierre forzado al programa, \u00BFlos datos recientes persisten en el disco r\u00EDgido?");
		lblConCuantasDe.setBounds(14, 218, 550, 14);
		contentPane.add(lblConCuantasDe);

		JRadioButton rdbtn21 = new JRadioButton("Se pierden los datos ingresados hasta con 10 minutos de anterioridad");
		rdbtn21.setBounds(10, 251, 463, 23);
		rdbtn21.setActionCommand("1");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn22 = new JRadioButton("Se pierden los datos ingresados hasta con 5 minutos de anterioridad");
		rdbtn22.setBounds(10, 277, 463, 23);
		rdbtn22.setActionCommand("2");
		contentPane.add(rdbtn22);

		JRadioButton rdbtn23 = new JRadioButton("Se pierden los datos ingresados hasta con 1 minuto de anterioridad");
		rdbtn23.setBounds(10, 303, 463, 23);
		rdbtn23.setActionCommand("4");
		contentPane.add(rdbtn23);

		JRadioButton rdbtn24 = new JRadioButton(
				"No se pierden los datos ingresados y el programa recupera su estado previo");
		rdbtn24.setBounds(10, 329, 463, 23);
		rdbtn24.setActionCommand("5");
		contentPane.add(rdbtn24);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn21);
		grupo2.add(rdbtn22);
		grupo2.add(rdbtn23);
		grupo2.add(rdbtn24);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (grupo1.getSelection() == null || grupo2.getSelection() == null) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opción en todas las preguntas",
							"Opción inválida", JOptionPane.ERROR_MESSAGE);
				} else {
					int pje1 = Integer.parseInt(grupo1.getSelection().getActionCommand());
					int pje2 = Integer.parseInt(grupo2.getSelection().getActionCommand());

					float promedio = (float) (pje1 + pje2) / 2;
					maestra.setFiabilidad(promedio);

					Mantenibilidad man = new Mantenibilidad(getMaestra());
					man.setLocationRelativeTo(null);
					man.setVisible(true);
					cerrar();
				}
			}
		});
		btnSiguiente.setBounds(250, 394, 89, 23);
		contentPane.add(btnSiguiente);

		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFiabilidad.setBounds(260, 11, 106, 30);
		contentPane.add(lblFiabilidad);

	}

	void cerrar() {
		this.setVisible(false);
	}

}
