package packageDeCalidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class FinEvaluacion extends JFrame {

	private Maestra maestra;

	public Maestra getMaestra() {
		return this.maestra;
	}

	public void setMaestra(Maestra maestra) {
		this.maestra = maestra;
	}

	private JPanel contentPane;
	private JTextField textFieldFuncionabilidad;
	private JTextField textFieldEficiencia;
	private JTextField textFieldFiabilidad;
	private JTextField textFieldMantenibilidad;
	private JTextField textFieldUsabilidad;
	private JTextField textFieldPortabilidad;
	private JTextField textFieldResumen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinEvaluacion frame = new FinEvaluacion(new Maestra());
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
	public FinEvaluacion(Maestra maestra) {

		this.setMaestra(maestra);

		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEvaluacinDeCalidad = new JLabel("EVALUACI\u00D3N DE CALIDAD");
		lblEvaluacinDeCalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEvaluacinDeCalidad.setBounds(88, 0, 173, 38);
		contentPane.add(lblEvaluacinDeCalidad);

		JLabel label_1 = new JLabel("Resumen");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(138, 42, 77, 14);
		contentPane.add(label_1);

		JButton button = new JButton("Cerrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setBounds(127, 320, 89, 23);
		contentPane.add(button);

		JLabel lblFuncionalidad = new JLabel("Funcionabilidad");
		lblFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFuncionalidad.setBounds(20, 67, 163, 14);
		contentPane.add(lblFuncionalidad);

		textFieldFuncionabilidad = new JTextField();
		textFieldFuncionabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFuncionabilidad.setEditable(false);
		textFieldFuncionabilidad.setColumns(10);
		textFieldFuncionabilidad.setBounds(193, 64, 130, 20);
		contentPane.add(textFieldFuncionabilidad);

		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEficiencia.setBounds(20, 95, 163, 14);
		contentPane.add(lblEficiencia);

		textFieldEficiencia = new JTextField();
		textFieldEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEficiencia.setEditable(false);
		textFieldEficiencia.setColumns(10);
		textFieldEficiencia.setBounds(193, 92, 130, 20);
		contentPane.add(textFieldEficiencia);

		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFiabilidad.setBounds(20, 126, 163, 14);
		contentPane.add(lblFiabilidad);

		textFieldFiabilidad = new JTextField();
		textFieldFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFiabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFiabilidad.setEditable(false);
		textFieldFiabilidad.setColumns(10);
		textFieldFiabilidad.setBounds(193, 123, 130, 20);
		contentPane.add(textFieldFiabilidad);

		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMantenibilidad.setBounds(20, 157, 163, 14);
		contentPane.add(lblMantenibilidad);

		textFieldMantenibilidad = new JTextField();
		textFieldMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMantenibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMantenibilidad.setEditable(false);
		textFieldMantenibilidad.setColumns(10);
		textFieldMantenibilidad.setBounds(193, 154, 130, 20);
		contentPane.add(textFieldMantenibilidad);

		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsabilidad.setBounds(20, 188, 163, 14);
		contentPane.add(lblUsabilidad);

		textFieldUsabilidad = new JTextField();
		textFieldUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldUsabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsabilidad.setEditable(false);
		textFieldUsabilidad.setColumns(10);
		textFieldUsabilidad.setBounds(193, 185, 130, 20);
		contentPane.add(textFieldUsabilidad);

		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPortabilidad.setBounds(20, 219, 163, 14);
		contentPane.add(lblPortabilidad);

		textFieldPortabilidad = new JTextField();
		textFieldPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPortabilidad.setEditable(false);
		textFieldPortabilidad.setColumns(10);
		textFieldPortabilidad.setBounds(193, 216, 130, 20);
		contentPane.add(textFieldPortabilidad);

		textFieldResumen = new JTextField();
		textFieldResumen.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResumen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldResumen.setEditable(false);
		textFieldResumen.setBounds(37, 262, 274, 32);
		contentPane.add(textFieldResumen);
		textFieldResumen.setColumns(10);

		mostrarResultados();
	}

	private void mostrarResultados() {
		textFieldFuncionabilidad.setText(this.maestra.getFuncionabilidad() + " de 5");
		textFieldEficiencia.setText(this.maestra.getEficiencia() + " de 5");
		textFieldFiabilidad.setText(this.maestra.getFiabilidad() + " de 5");
		textFieldMantenibilidad.setText(this.maestra.getMantenibilidad() + " de 5");
		textFieldUsabilidad.setText(this.maestra.getUsabilidad() + " de 5");
		textFieldPortabilidad.setText(this.maestra.getPortabilidad() + " de 5");

		if (this.maestra.getFuncionabilidad() >= this.maestra.getFuncionabilidadEsperada()) {
			textFieldFuncionabilidad.setForeground(Color.GREEN);
		} else {
			textFieldFuncionabilidad.setForeground(Color.RED);
		}

		if (this.maestra.getEficiencia() >= this.maestra.getEficienciaEsperada()) {
			textFieldEficiencia.setForeground(Color.GREEN);
		} else {
			textFieldEficiencia.setForeground(Color.RED);
		}

		if (this.maestra.getFiabilidad() >= this.maestra.getFiabilidadEsperada()) {
			textFieldFiabilidad.setForeground(Color.GREEN);
		} else {
			textFieldFiabilidad.setForeground(Color.RED);
		}

		if (this.maestra.getMantenibilidad() >= this.maestra.getMantenibilidadEsperada()) {
			textFieldMantenibilidad.setForeground(Color.GREEN);
		} else {
			textFieldMantenibilidad.setForeground(Color.RED);
		}

		if (this.maestra.getUsabilidad() >= this.maestra.getUsabilidadEsperada()) {
			textFieldUsabilidad.setForeground(Color.GREEN);
		} else {
			textFieldUsabilidad.setForeground(Color.RED);
		}

		if (this.maestra.getPortabilidad() >= this.maestra.getPortabilidadEsperada()) {
			textFieldPortabilidad.setForeground(Color.GREEN);
		} else {
			textFieldPortabilidad.setForeground(Color.RED);
		}

		if (this.maestra.getFuncionabilidad() >= this.maestra.getFuncionabilidadEsperada()) {
			if (this.maestra.getEficiencia() >= this.maestra.getEficienciaEsperada()) {
				if (this.maestra.getFiabilidad() >= this.maestra.getFiabilidadEsperada()) {
					if (this.maestra.getMantenibilidad() >= this.maestra.getMantenibilidadEsperada()) {
						if (this.maestra.getUsabilidad() >= this.maestra.getUsabilidadEsperada()) {
							if (this.maestra.getPortabilidad() >= this.maestra.getPortabilidadEsperada()) {
								textFieldResumen.setText("La calidad del software es satisfactoria");
								return;
							}
						}
					}
				}
			}
		}
		textFieldResumen.setText("La calidad del software NO es satisfactoria");

	}
}
