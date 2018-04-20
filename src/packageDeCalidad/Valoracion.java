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
public class Valoracion extends JFrame {

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
					Valoracion frame = new Valoracion(new Maestra());
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
	public Valoracion(Maestra maestra) {
		setTitle("Algoritmo de Calidad");

		this.setMaestra(maestra);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQueTanImportante = new JLabel(
				"\u00BFQu\u00E9 tan importante son los siguientes atributos para su software?");
		lblQueTanImportante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQueTanImportante.setBounds(10, 11, 454, 25);
		contentPane.add(lblQueTanImportante);

		JLabel lblNewLabel = new JLabel("FUNCIONABILIDAD");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 43, 135, 14);
		contentPane.add(lblNewLabel);

		JRadioButton rdbtn11 = new JRadioButton("Muy importante");
		rdbtn11.setBounds(10, 64, 224, 23);
		rdbtn11.setActionCommand("5");
		contentPane.add(rdbtn11);

		JRadioButton rdbtn12 = new JRadioButton("Importante");
		rdbtn12.setBounds(10, 90, 224, 23);
		rdbtn12.setActionCommand("4");
		contentPane.add(rdbtn12);

		JRadioButton rdbtn13 = new JRadioButton("Considerablemente importante");
		rdbtn13.setBounds(10, 116, 224, 23);
		rdbtn13.setActionCommand("3");
		contentPane.add(rdbtn13);

		JRadioButton rdbtn14 = new JRadioButton("Poco importante");
		rdbtn14.setBounds(10, 142, 224, 23);
		rdbtn14.setActionCommand("2");
		contentPane.add(rdbtn14);

		JRadioButton rdbtn15 = new JRadioButton("Nada importante");
		rdbtn15.setBounds(10, 168, 224, 23);
		rdbtn15.setActionCommand("1");
		contentPane.add(rdbtn15);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtn11);
		grupo1.add(rdbtn12);
		grupo1.add(rdbtn13);
		grupo1.add(rdbtn14);
		grupo1.add(rdbtn15);

		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEficiencia.setBounds(353, 43, 93, 14);
		contentPane.add(lblEficiencia);

		JRadioButton rdbtn21 = new JRadioButton("Muy importante");
		rdbtn21.setBounds(353, 64, 218, 23);
		rdbtn21.setActionCommand("5");
		contentPane.add(rdbtn21);

		JRadioButton rdbtn22 = new JRadioButton("Importante");
		rdbtn22.setBounds(353, 90, 218, 23);
		rdbtn22.setActionCommand("4");
		contentPane.add(rdbtn22);

		JRadioButton rdbtn23 = new JRadioButton("Considerablemente importante");
		rdbtn23.setBounds(353, 116, 218, 23);
		rdbtn23.setActionCommand("3");
		contentPane.add(rdbtn23);

		JRadioButton rdbtn24 = new JRadioButton("Poco importante");
		rdbtn24.setBounds(353, 142, 218, 23);
		rdbtn24.setActionCommand("2");
		contentPane.add(rdbtn24);

		JRadioButton rdbtn25 = new JRadioButton("Nada importante");
		rdbtn25.setBounds(353, 168, 218, 23);
		rdbtn25.setActionCommand("1");

		contentPane.add(rdbtn25);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rdbtn21);
		grupo2.add(rdbtn22);
		grupo2.add(rdbtn23);
		grupo2.add(rdbtn24);
		grupo2.add(rdbtn25);

		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFiabilidad.setBounds(10, 213, 93, 14);
		contentPane.add(lblFiabilidad);

		JRadioButton rdbtn31 = new JRadioButton("Muy importante");
		rdbtn31.setBounds(10, 234, 224, 23);
		rdbtn31.setActionCommand("5");
		contentPane.add(rdbtn31);

		JRadioButton rdbtn32 = new JRadioButton("Importante");
		rdbtn32.setBounds(10, 260, 224, 23);
		rdbtn32.setActionCommand("4");
		contentPane.add(rdbtn32);

		JRadioButton rdbtn33 = new JRadioButton("Considerablemente importante");
		rdbtn33.setBounds(10, 286, 224, 23);
		rdbtn33.setActionCommand("3");
		contentPane.add(rdbtn33);

		JRadioButton rdbtn34 = new JRadioButton("Poco importante");
		rdbtn34.setBounds(10, 312, 224, 23);
		rdbtn34.setActionCommand("2");
		contentPane.add(rdbtn34);

		JRadioButton rdbtn35 = new JRadioButton("Nada importante");
		rdbtn35.setBounds(10, 338, 224, 23);
		rdbtn35.setActionCommand("1");
		contentPane.add(rdbtn35);

		ButtonGroup grupo3 = new ButtonGroup();
		grupo3.add(rdbtn31);
		grupo3.add(rdbtn32);
		grupo3.add(rdbtn33);
		grupo3.add(rdbtn34);
		grupo3.add(rdbtn35);

		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMantenibilidad.setBounds(353, 213, 125, 14);
		contentPane.add(lblMantenibilidad);

		JRadioButton rdbtn41 = new JRadioButton("Muy importante");
		rdbtn41.setBounds(353, 234, 218, 23);
		rdbtn41.setActionCommand("5");
		contentPane.add(rdbtn41);

		JRadioButton rdbtn42 = new JRadioButton("Importante");
		rdbtn42.setBounds(353, 260, 218, 23);
		rdbtn42.setActionCommand("4");
		contentPane.add(rdbtn42);

		JRadioButton rdbtn43 = new JRadioButton("Considerablemente importante");
		rdbtn43.setBounds(353, 286, 218, 23);
		rdbtn43.setActionCommand("3");
		contentPane.add(rdbtn43);

		JRadioButton rdbtn44 = new JRadioButton("Poco importante");
		rdbtn44.setBounds(353, 312, 218, 23);
		rdbtn44.setActionCommand("2");
		contentPane.add(rdbtn44);

		JRadioButton rdbtn45 = new JRadioButton("Nada importante");
		rdbtn45.setBounds(353, 338, 218, 23);
		rdbtn45.setActionCommand("1");
		contentPane.add(rdbtn45);

		ButtonGroup grupo4 = new ButtonGroup();
		grupo4.add(rdbtn41);
		grupo4.add(rdbtn42);
		grupo4.add(rdbtn43);
		grupo4.add(rdbtn44);
		grupo4.add(rdbtn45);

		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsabilidad.setBounds(10, 380, 93, 14);
		contentPane.add(lblUsabilidad);

		JRadioButton rdbtn51 = new JRadioButton("Muy importante");
		rdbtn51.setBounds(10, 401, 224, 23);
		rdbtn51.setActionCommand("5");
		contentPane.add(rdbtn51);

		JRadioButton rdbtn52 = new JRadioButton("Importante");
		rdbtn52.setBounds(10, 427, 224, 23);
		rdbtn52.setActionCommand("4");
		contentPane.add(rdbtn52);

		JRadioButton rdbtn53 = new JRadioButton("Considerablemente importante");
		rdbtn53.setBounds(10, 453, 224, 23);
		rdbtn53.setActionCommand("3");
		contentPane.add(rdbtn53);

		JRadioButton rdbtn54 = new JRadioButton("Poco importante");
		rdbtn54.setBounds(10, 479, 224, 23);
		rdbtn54.setActionCommand("2");
		contentPane.add(rdbtn54);

		JRadioButton rdbtn55 = new JRadioButton("Nada importante");
		rdbtn55.setBounds(10, 505, 224, 23);
		rdbtn55.setActionCommand("1");
		contentPane.add(rdbtn55);

		ButtonGroup grupo5 = new ButtonGroup();
		grupo5.add(rdbtn51);
		grupo5.add(rdbtn52);
		grupo5.add(rdbtn53);
		grupo5.add(rdbtn54);
		grupo5.add(rdbtn55);

		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPortabilidad.setBounds(353, 380, 93, 14);
		contentPane.add(lblPortabilidad);

		JRadioButton rdbtn61 = new JRadioButton("Muy importante");
		rdbtn61.setBounds(353, 401, 218, 23);
		rdbtn61.setActionCommand("5");
		contentPane.add(rdbtn61);

		JRadioButton rdbtn62 = new JRadioButton("Importante");
		rdbtn62.setBounds(353, 427, 218, 23);
		rdbtn62.setActionCommand("4");
		contentPane.add(rdbtn62);

		JRadioButton rdbtn63 = new JRadioButton("Considerablemente importante");
		rdbtn63.setBounds(353, 453, 218, 23);
		rdbtn63.setActionCommand("3");
		contentPane.add(rdbtn63);

		JRadioButton rdbtn64 = new JRadioButton("Poco importante");
		rdbtn64.setBounds(353, 479, 218, 23);
		rdbtn64.setActionCommand("2");
		contentPane.add(rdbtn64);

		JRadioButton rdbtn65 = new JRadioButton("Nada importante");
		rdbtn65.setBounds(353, 505, 218, 23);
		rdbtn65.setActionCommand("1");
		contentPane.add(rdbtn65);

		ButtonGroup grupo6 = new ButtonGroup();
		grupo6.add(rdbtn61);
		grupo6.add(rdbtn62);
		grupo6.add(rdbtn63);
		grupo6.add(rdbtn64);
		grupo6.add(rdbtn65);

		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (grupo1.getSelection() == null || grupo2.getSelection() == null || grupo3.getSelection() == null
						|| grupo4.getSelection() == null || grupo5.getSelection() == null
						|| grupo6.getSelection() == null) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opción en todas las preguntas",
							"Opción inválida", JOptionPane.ERROR_MESSAGE);
				} else {
					// independientemente de la valoración del usuario, la
					// funcionabilidad es importante
					maestra.setFuncionabilidadEsperada(4);
					maestra.setEficienciaEsperada(Integer.parseInt(grupo2.getSelection().getActionCommand()));
					maestra.setFiabilidadEsperada(Integer.parseInt(grupo3.getSelection().getActionCommand()));
					maestra.setMantenibilidadEsperada(Integer.parseInt(grupo4.getSelection().getActionCommand()));
					maestra.setUsabilidadEsperada(Integer.parseInt(grupo5.getSelection().getActionCommand()));
					maestra.setPortabilidadEsperada(Integer.parseInt(grupo6.getSelection().getActionCommand()));

					InicioEvaluacion eval = new InicioEvaluacion(getMaestra());
					eval.setLocationRelativeTo(null);
					eval.setVisible(true);
					cerrar();
				}
			}
		});

		btnNewButton.setBounds(237, 566, 89, 23);
		contentPane.add(btnNewButton);
	}

	void cerrar() {
		this.setVisible(false);
	}
}
