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
public class Usabilidad extends JFrame {

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
					Usabilidad frame = new Usabilidad(new Maestra());
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
	public Usabilidad(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElSoftwareDebe = new JLabel(
				"\u00BFCu\u00E1ntos pasos necesita realizar el usuario para darse de alta?");
		lblElSoftwareDebe.setBounds(10, 52, 584, 14);
		contentPane.add(lblElSoftwareDebe);

		JRadioButton rdbtn11 = new JRadioButton("5 o m\u00E1s");
		rdbtn11.setBounds(6, 84, 360, 23);
		rdbtn11.setActionCommand("1");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn12 = new JRadioButton("Exactamente 4");
		rdbtn12.setBounds(6, 110, 360, 23);
		rdbtn12.setActionCommand("2");
		contentPane.add(rdbtn12);

		JRadioButton rdbtn13 = new JRadioButton("Exactamente 3");
		rdbtn13.setBounds(6, 136, 360, 23);
		rdbtn13.setActionCommand("4");
		contentPane.add(rdbtn13);

		JRadioButton rdbtn14 = new JRadioButton("2 o menos");
		rdbtn14.setBounds(6, 162, 360, 23);
		rdbtn14.setActionCommand("5");
		contentPane.add(rdbtn14);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn12);
		grupo1.add(rdbtn13);
		grupo1.add(rdbtn14);

		JLabel lblConCuantasDe = new JLabel(
				"\u00BFCu\u00E1ntos errores en promedio comete un usuario al solicitar un informe?");
		lblConCuantasDe.setBounds(14, 218, 550, 14);
		contentPane.add(lblConCuantasDe);

		JRadioButton rdbtn21 = new JRadioButton("5 o m\u00E1s");
		rdbtn21.setBounds(10, 251, 463, 23);
		rdbtn21.setActionCommand("1");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn22 = new JRadioButton("Entre 3 y 4");
		rdbtn22.setBounds(10, 277, 463, 23);
		rdbtn22.setActionCommand("2");
		contentPane.add(rdbtn22);

		JRadioButton rdbtn23 = new JRadioButton("Entre 1 y 2");
		rdbtn23.setBounds(10, 303, 463, 23);
		rdbtn23.setActionCommand("4");
		contentPane.add(rdbtn23);

		JRadioButton rdbtn24 = new JRadioButton("Ninguno");
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
					maestra.setUsabilidad(promedio);

					Portabilidad port = new Portabilidad(getMaestra());
					port.setLocationRelativeTo(null);
					port.setVisible(true);
					cerrar();
				}
			}
		});
		btnSiguiente.setBounds(180, 390, 89, 23);
		contentPane.add(btnSiguiente);

		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsabilidad.setBounds(180, 11, 89, 30);
		contentPane.add(lblUsabilidad);

	}

	void cerrar() {
		this.setVisible(false);
	}

}
