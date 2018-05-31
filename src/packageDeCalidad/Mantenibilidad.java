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
public class Mantenibilidad extends JFrame {

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
					Mantenibilidad frame = new Mantenibilidad(new Maestra());
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
	public Mantenibilidad(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElSoftwareDebe = new JLabel(
				"\u00BFCon cu\u00E1ntos de los siguientes registros para el diagn\u00F3stico de errores dispone el software?");
		lblElSoftwareDebe.setBounds(20, 51, 528, 14);
		contentPane.add(lblElSoftwareDebe);

		JLabel lblLogsAlRealizar = new JLabel("- Logs al realizar alta de usuario / enfermedad / m\u00E9dico.");
		lblLogsAlRealizar.setBounds(20, 86, 494, 14);
		contentPane.add(lblLogsAlRealizar);

		JLabel lblLogsAl = new JLabel("- Logs al solicitar datos, incluso si \u00E9stos no existieren.");
		lblLogsAl.setBounds(20, 111, 494, 14);
		contentPane.add(lblLogsAl);

		JLabel lblLogsAl_1 = new JLabel("- Logs al iniciar sesi\u00F3n y cerrar el programa.");
		lblLogsAl_1.setBounds(20, 136, 494, 14);
		contentPane.add(lblLogsAl_1);

		JLabel lblLogsAl_2 = new JLabel("- Logs al escribir y leer de disco.");
		lblLogsAl_2.setBounds(20, 161, 494, 14);
		contentPane.add(lblLogsAl_2);

		JRadioButton rdbtn11 = new JRadioButton("0");
		rdbtn11.setBounds(20, 192, 360, 23);
		rdbtn11.setActionCommand("0");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn12 = new JRadioButton("1");
		rdbtn12.setBounds(20, 218, 360, 23);
		rdbtn12.setActionCommand("1");
		contentPane.add(rdbtn12);

		JRadioButton rdbtn13 = new JRadioButton("2 o m\u00E1s");
		rdbtn13.setBounds(20, 244, 360, 23);
		rdbtn13.setActionCommand("3");
		contentPane.add(rdbtn13);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn12);
		grupo1.add(rdbtn13);

		JLabel lblConCuantasDe = new JLabel(
				"En un intervalo de 100 horas, \u00BFcu\u00E1ntos fallos ocurren durante la ejecuci\u00F3n del programa?");
		lblConCuantasDe.setBounds(24, 284, 524, 14);
		contentPane.add(lblConCuantasDe);

		JRadioButton rdbtn21 = new JRadioButton("2 o m\u00E1s fallos");
		rdbtn21.setBounds(20, 310, 356, 23);
		rdbtn21.setActionCommand("0");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn23 = new JRadioButton("Exactamente 1 fallo");
		rdbtn23.setBounds(20, 336, 356, 23);
		rdbtn23.setActionCommand("1");
		contentPane.add(rdbtn23);

		JRadioButton rdbtn24 = new JRadioButton("Ning\u00FAn fallo");
		rdbtn24.setBounds(20, 362, 356, 23);
		rdbtn24.setActionCommand("3");
		contentPane.add(rdbtn24);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn21);
		grupo2.add(rdbtn23);
		grupo2.add(rdbtn24);

		JLabel lblUnInformeGenerado = new JLabel(
				"Al modificarse una funcionalidad del programa, \u00BFcu\u00E1ntas funcionalidades deben modificarse para aceptar este cambio?");
		lblUnInformeGenerado.setBounds(24, 400, 691, 14);
		contentPane.add(lblUnInformeGenerado);

		JRadioButton rdbtn31 = new JRadioButton("4 o m\u00E1s");
		rdbtn31.setBounds(20, 432, 356, 23);
		rdbtn31.setActionCommand("0");
		contentPane.add(rdbtn31);

		JRadioButton rdbtn33 = new JRadioButton("2 o 3");
		rdbtn33.setBounds(20, 458, 356, 23);
		rdbtn33.setActionCommand("1");
		contentPane.add(rdbtn33);

		JRadioButton rdbtn34 = new JRadioButton("1 o ninguna");
		rdbtn34.setBounds(20, 484, 356, 23);
		rdbtn34.setActionCommand("3");
		contentPane.add(rdbtn34);

		ButtonGroup grupo3 = new ButtonGroup();
		grupo3.add(rdbtn31);
		grupo3.add(rdbtn33);
		grupo3.add(rdbtn34);

		JButton button = new JButton("Siguiente");
		button.addActionListener(new ActionListener() {
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
					
					maestra.setMantenibilidad(promedio);

					Usabilidad usa = new Usabilidad(getMaestra());
					usa.setLocationRelativeTo(null);
					usa.setVisible(true);
					cerrar();
				}
			}
		});
		button.setBounds(300, 521, 89, 23);
		contentPane.add(button);

		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMantenibilidad.setBounds(300, 11, 133, 29);
		contentPane.add(lblMantenibilidad);

	}

	void cerrar() {
		this.setVisible(false);
	}

}
