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
public class InicioEvaluacion extends JFrame {

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
					InicioEvaluacion frame = new InicioEvaluacion(new Maestra());
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
	public InicioEvaluacion(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblComenzandoEvaluacin = new JLabel("EVALUACI\u00D3N DE CALIDAD");
		lblComenzandoEvaluacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComenzandoEvaluacin.setBounds(134, 34, 169, 30);
		contentPane.add(lblComenzandoEvaluacin);

		JTextArea txtrAContinuacinSe = new JTextArea();
		txtrAContinuacinSe.setWrapStyleWord(true);
		txtrAContinuacinSe.setText(
				"Se le presentar\u00E1n algunas preguntas para evaluar la calidad del software. Presione siguiente para continuar.");
		txtrAContinuacinSe.setLineWrap(true);
		txtrAContinuacinSe.setEditable(false);
		txtrAContinuacinSe.setBounds(10, 91, 404, 71);
		contentPane.add(txtrAContinuacinSe);

		JButton button = new JButton("Siguiente");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionabilidad func = new Funcionabilidad(getMaestra());
				func.setLocationRelativeTo(null);
				func.setVisible(true);
				cerrar();
			}
		});
		button.setBounds(165, 215, 89, 23);
		contentPane.add(button);
	}

	void cerrar() {
		this.setVisible(false);
	}

}
