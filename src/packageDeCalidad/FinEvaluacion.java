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
	private JTextField textFieldCalificacion;

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
		textFieldFuncionabilidad.setFont(new Font("Dialog", Font.BOLD, 14));
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
		textFieldEficiencia.setFont(new Font("Dialog", Font.BOLD, 14));
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
		textFieldFiabilidad.setFont(new Font("Dialog", Font.BOLD, 14));
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
		textFieldMantenibilidad.setFont(new Font("Dialog", Font.BOLD, 14));
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
		textFieldUsabilidad.setFont(new Font("Dialog", Font.BOLD, 14));
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
		textFieldPortabilidad.setFont(new Font("Dialog", Font.BOLD, 14));
		textFieldPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPortabilidad.setEditable(false);
		textFieldPortabilidad.setColumns(10);
		textFieldPortabilidad.setBounds(193, 216, 130, 20);
		contentPane.add(textFieldPortabilidad);

		JLabel lblCalidadDelSoftware = new JLabel("CALIDAD DEL SOFTWARE");
		lblCalidadDelSoftware.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCalidadDelSoftware.setBounds(20, 272, 163, 14);
		contentPane.add(lblCalidadDelSoftware);

		textFieldCalificacion = new JTextField();
		textFieldCalificacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCalificacion.setFont(new Font("Dialog", Font.BOLD, 14));
		textFieldCalificacion.setEditable(false);
		textFieldCalificacion.setBounds(193, 262, 130, 32);
		contentPane.add(textFieldCalificacion);
		textFieldCalificacion.setColumns(10);

		mostrarResultados();
	}

	private void mostrarResultados() {
		int mala = 0;
		int excelente = 0;

		if (this.maestra.getFuncionabilidad() == 0) {
			textFieldFuncionabilidad.setText("MALA");
			textFieldFuncionabilidad.setForeground(Color.RED);
			mala++;
		} else if (this.maestra.getFuncionabilidad() > 1.5 && this.maestra.getFuncionabilidad() < 2.5) {
			textFieldFuncionabilidad.setText("BUENA");
			textFieldFuncionabilidad.setForeground(Color.GREEN);
		} else {
			textFieldFuncionabilidad.setText("EXCELENTE");
			textFieldFuncionabilidad.setForeground(Color.GREEN);
			excelente++;
		}

		if (this.maestra.getEficiencia() == 0) {
			textFieldEficiencia.setText("MALA");
			textFieldEficiencia.setForeground(Color.RED);
			mala++;
		} else if (this.maestra.getEficiencia() > 1.5 && this.maestra.getEficiencia() < 2.5) {
			textFieldEficiencia.setText("BUENA");
			textFieldEficiencia.setForeground(Color.GREEN);
		} else {
			textFieldEficiencia.setText("EXCELENTE");
			textFieldEficiencia.setForeground(Color.GREEN);
			excelente++;
		}

		if (this.maestra.getFiabilidad() == 0) {
			textFieldFiabilidad.setText("MALA");
			textFieldFiabilidad.setForeground(Color.RED);
			mala++;
		} else if (this.maestra.getFiabilidad() > 1.5 && this.maestra.getFiabilidad() < 2.5) {
			textFieldFiabilidad.setText("BUENA");
			textFieldFiabilidad.setForeground(Color.GREEN);
		} else {
			textFieldFiabilidad.setText("EXCELENTE");
			textFieldFiabilidad.setForeground(Color.GREEN);
			excelente++;
		}

		if (this.maestra.getMantenibilidad() == 0) {
			textFieldMantenibilidad.setText("MALA");
			textFieldMantenibilidad.setForeground(Color.RED);
			mala++;
		} else if (this.maestra.getMantenibilidad() > 1.5 && this.maestra.getMantenibilidad() < 2.5) {
			textFieldMantenibilidad.setText("BUENA");
			textFieldMantenibilidad.setForeground(Color.GREEN);
		} else {
			textFieldMantenibilidad.setText("EXCELENTE");
			textFieldMantenibilidad.setForeground(Color.GREEN);
			excelente++;
		}

		if (this.maestra.getUsabilidad() == 0) {
			textFieldUsabilidad.setText("MALA");
			textFieldUsabilidad.setForeground(Color.RED);
			mala++;
		} else if (this.maestra.getUsabilidad() > 1.5 && this.maestra.getUsabilidad() < 2.5) {
			textFieldUsabilidad.setText("BUENA");
			textFieldUsabilidad.setForeground(Color.GREEN);
		} else {
			textFieldUsabilidad.setText("EXCELENTE");
			textFieldUsabilidad.setForeground(Color.GREEN);
			excelente++;
		}

		if (this.maestra.getPortabilidad() == 0) {
			textFieldPortabilidad.setText("MALA");
			textFieldPortabilidad.setForeground(Color.RED);
			mala++;
		} else if (this.maestra.getPortabilidad() > 1.5 && this.maestra.getPortabilidad() < 2.5) {
			textFieldPortabilidad.setText("BUENA");
			textFieldPortabilidad.setForeground(Color.GREEN);
		} else {
			textFieldPortabilidad.setText("EXCELENTE");
			textFieldPortabilidad.setForeground(Color.GREEN);
			excelente++;
		}

		if (mala != 0) {
			textFieldCalificacion.setText("MALA");
			textFieldCalificacion.setForeground(Color.RED);
		} else if (excelente == 6) {
			textFieldCalificacion.setText("EXCELENTE");
			textFieldCalificacion.setForeground(Color.GREEN);
		} else {
			textFieldCalificacion.setText("BUENA");
			textFieldCalificacion.setForeground(Color.GREEN);
		}

	}
}
