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
public class Portabilidad extends JFrame {

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
					Portabilidad frame = new Portabilidad(new Maestra());
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
	public Portabilidad(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElSoftwareDebe = new JLabel(
				"\u00BFCu\u00E1ntas son las dependencias necesarias para instalar el programa?");
		lblElSoftwareDebe.setBounds(10, 55, 584, 14);
		contentPane.add(lblElSoftwareDebe);

		JRadioButton rdbtn11 = new JRadioButton("4 o m\u00E1s");
		rdbtn11.setBounds(6, 87, 360, 23);
		rdbtn11.setActionCommand("0");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn13 = new JRadioButton("2 o 3");
		rdbtn13.setBounds(6, 113, 360, 23);
		rdbtn13.setActionCommand("1");
		contentPane.add(rdbtn13);

		JRadioButton rdbtn14 = new JRadioButton("1 o ninguna");
		rdbtn14.setBounds(6, 139, 360, 23);
		rdbtn14.setActionCommand("3");
		contentPane.add(rdbtn14);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn13);
		grupo1.add(rdbtn14);

		JLabel lblConCuantasDe = new JLabel(
				"De las siguientes arquitecturas, \u00BFcu\u00E1ntas son soportadas por el software?");
		lblConCuantasDe.setBounds(14, 178, 550, 14);
		contentPane.add(lblConCuantasDe);

		JLabel lblSistemasDe = new JLabel("- Sistemas de 32 bits");
		lblSistemasDe.setBounds(10, 214, 494, 14);
		contentPane.add(lblSistemasDe);

		JLabel lblSistemasDe_1 = new JLabel("- Sistemas de 64 bits");
		lblSistemasDe_1.setBounds(10, 239, 494, 14);
		contentPane.add(lblSistemasDe_1);

		JLabel lblSistemasArn = new JLabel("- Sistemas ARM");
		lblSistemasArn.setBounds(10, 264, 494, 14);
		contentPane.add(lblSistemasArn);

		JRadioButton rdbtn21 = new JRadioButton("0");
		rdbtn21.setBounds(10, 304, 463, 23);
		rdbtn21.setActionCommand("0");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn22 = new JRadioButton("1");
		rdbtn22.setBounds(10, 330, 463, 23);
		rdbtn22.setActionCommand("1");
		contentPane.add(rdbtn22);

		JRadioButton rdbtn23 = new JRadioButton("2 o 3");
		rdbtn23.setBounds(10, 356, 463, 23);
		rdbtn23.setActionCommand("3");
		contentPane.add(rdbtn23);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn21);
		grupo2.add(rdbtn22);
		grupo2.add(rdbtn23);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (grupo1.getSelection() == null || grupo2.getSelection() == null) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opción en todas las preguntas",
							"Opción inválida", JOptionPane.ERROR_MESSAGE);
				} else {
					int pje1 = Integer.parseInt(grupo1.getSelection().getActionCommand());
					int pje2 = Integer.parseInt(grupo2.getSelection().getActionCommand());

					float promedio;
					if (pje1 == 0 || pje2 == 0) {
						promedio = 0;
					} else {
						promedio = (float) (pje1 + pje2) / 2;	
					}
					
					maestra.setPortabilidad(promedio);

					FinEvaluacion fin = new FinEvaluacion(getMaestra());
					fin.setLocationRelativeTo(null);
					fin.setVisible(true);
					cerrar();
				}
			}
		});
		btnSiguiente.setBounds(177, 392, 89, 23);
		contentPane.add(btnSiguiente);

		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPortabilidad.setBounds(177, 11, 104, 33);
		contentPane.add(lblPortabilidad);

	}

	void cerrar() {
		this.setVisible(false);
	}

}