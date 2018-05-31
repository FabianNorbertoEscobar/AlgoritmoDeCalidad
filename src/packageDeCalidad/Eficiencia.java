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
public class Eficiencia extends JFrame {

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
					Eficiencia frame = new Eficiencia(new Maestra());
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
	public Eficiencia(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElSoftwareDebe = new JLabel(
				"\u00BFCu\u00E1l es el tiempo medio para dar de alta un paciente, m\u00E9dico o diagn\u00F3sticos?");
		lblElSoftwareDebe.setBounds(10, 47, 494, 14);
		contentPane.add(lblElSoftwareDebe);

		JRadioButton rdbtn11 = new JRadioButton("Mayor a 1 seg");
		rdbtn11.setBounds(10, 81, 360, 23);
		rdbtn11.setActionCommand("0");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn12 = new JRadioButton("Entre 200 miliseg y 1 seg");
		rdbtn12.setBounds(10, 107, 360, 23);
		rdbtn12.setActionCommand("1");
		contentPane.add(rdbtn12);

		JRadioButton rdbtn13 = new JRadioButton("Menor a 200 miliseg");
		rdbtn13.setBounds(10, 133, 360, 23);
		rdbtn13.setActionCommand("3");
		contentPane.add(rdbtn13);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn12);
		grupo1.add(rdbtn13);

		JLabel lblConCuantasDe = new JLabel("\u00BFCu\u00E1l es el tiempo medio para brindar un informe?");
		lblConCuantasDe.setBounds(14, 172, 459, 14);
		contentPane.add(lblConCuantasDe);

		JRadioButton rdbtn21 = new JRadioButton("Mayor a 1 seg");
		rdbtn21.setBounds(10, 205, 356, 23);
		rdbtn21.setActionCommand("0");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn22 = new JRadioButton("Entre 200 miliseg y 1 seg");
		rdbtn22.setBounds(10, 231, 356, 23);
		rdbtn22.setActionCommand("1");
		contentPane.add(rdbtn22);

		JRadioButton rdbtn23 = new JRadioButton("Menor a 200 miliseg");
		rdbtn23.setBounds(10, 257, 356, 23);
		rdbtn23.setActionCommand("3");
		contentPane.add(rdbtn23);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn21);
		grupo2.add(rdbtn22);
		grupo2.add(rdbtn23);

		JLabel lblUnInformeGenerado = new JLabel(
				"\u00BFCu\u00E1l es el uso medio de memoria RAM durante la ejecuci\u00F3n del programa?");
		lblUnInformeGenerado.setBounds(14, 298, 459, 14);
		contentPane.add(lblUnInformeGenerado);

		JRadioButton rdbtn31 = new JRadioButton("Mayor a 500MB");
		rdbtn31.setBounds(10, 330, 356, 23);
		rdbtn31.setActionCommand("0");
		contentPane.add(rdbtn31);

		JRadioButton rdbtn32 = new JRadioButton("Entre 100MB y 500MB");
		rdbtn32.setBounds(10, 356, 356, 23);
		rdbtn32.setActionCommand("1");
		contentPane.add(rdbtn32);

		JRadioButton rdbtn33 = new JRadioButton("Menor a 100MB");
		rdbtn33.setBounds(10, 382, 356, 23);
		rdbtn33.setActionCommand("3");
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

					float promedio;
					if (pje1 == 0 || pje2 == 0 || pje3 == 0) {
						promedio = 0;
					} else {
						promedio = (float) (pje1 + pje2 + pje3) / 3;
					}
					
					maestra.setEficiencia(promedio);

					Fiabilidad fiab = new Fiabilidad(getMaestra());
					fiab.setLocationRelativeTo(null);
					fiab.setVisible(true);

					cerrar();
				}
			}
		});
		btnSiguiente.setBounds(201, 426, 89, 23);
		contentPane.add(btnSiguiente);

		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEficiencia.setBounds(201, 11, 98, 25);
		contentPane.add(lblEficiencia);

	}

	void cerrar() {
		this.setVisible(false);
	}

}
