package packageDeCalidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class PantallaBienvenida extends JFrame {

	private JPanel contentPane;

	private Maestra maestra;

	private Valoracion valoracion;

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
					PantallaBienvenida frame = new PantallaBienvenida();
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
	 */
	public PantallaBienvenida() {
		setTitle("Algoritmo de Calidad");

		this.maestra = new Maestra();
		this.valoracion = new Valoracion(this.getMaestra());

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEvaluacinDeCalidad = new JLabel("EVALUACI\u00D3N DE CALIDAD");
		lblEvaluacinDeCalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEvaluacinDeCalidad.setBounds(141, 11, 179, 38);
		contentPane.add(lblEvaluacinDeCalidad);

		JLabel lblbienvenido = new JLabel("\u00A1Bienvenido!");
		lblbienvenido.setBounds(182, 50, 77, 14);
		contentPane.add(lblbienvenido);

		JTextArea txtrAntesDeComenzar = new JTextArea();
		txtrAntesDeComenzar.setWrapStyleWord(true);
		txtrAntesDeComenzar.setLineWrap(true);
		txtrAntesDeComenzar.setEditable(false);
		txtrAntesDeComenzar.setText(
				"Antes de comenzar con la evaluaci\u00F3n, requeriremos de su valoraci\u00F3n respecto a los atributos de calidad del Software. Presione siguiente para comenzar.");
		txtrAntesDeComenzar.setBounds(20, 95, 403, 71);
		contentPane.add(txtrAntesDeComenzar);

		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valoracion.setLocationRelativeTo(null);
				valoracion.setVisible(true);
				cerrar();
			}
		});
		btnNewButton.setBounds(170, 213, 89, 23);
		contentPane.add(btnNewButton);
	}

	void cerrar() {
		this.setVisible(false);
	}
}
