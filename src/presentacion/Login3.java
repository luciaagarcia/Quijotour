package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtcontrasea;
	private JButton btnIniciarSesin;
	private JLabel imagen;
	private JLabel lblnoTienesUna;
	private JButton btnRegistrarse;
	private JLabel imagenIcono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login3 frame = new Login3();
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
	public Login3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 91, 216, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{49, 207, 58, 0, 62, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		imagenIcono = new JLabel("");
		imagenIcono.setIcon(new ImageIcon(Login3.class.getResource("/presentacion/recursos/Quijotour.png")));
		imagenIcono.setHorizontalAlignment(SwingConstants.TRAILING);
		imagenIcono.setSize(20, 20);
		GridBagConstraints gbc_imagenIcono = new GridBagConstraints();
		gbc_imagenIcono.insets = new Insets(0, 0, 5, 5);
		gbc_imagenIcono.gridx = 1;
		gbc_imagenIcono.gridy = 1;
		contentPane.add(imagenIcono, gbc_imagenIcono);
		
		JLabel lblNombre = new JLabel("Nombre Usuario");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		txtnombre = new JTextField();
		GridBagConstraints gbc_txtnombre = new GridBagConstraints();
		gbc_txtnombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtnombre.gridx = 2;
		gbc_txtnombre.gridy = 2;
		contentPane.add(txtnombre, gbc_txtnombre);
		txtnombre.setColumns(10);
		
		imagen = new JLabel("");
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		gbc_imagen.insets = new Insets(0, 0, 5, 5);
		gbc_imagen.gridx = 12;
		gbc_imagen.gridy = 3;
		contentPane.add(imagen, gbc_imagen);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 4;
		contentPane.add(lblContrasea, gbc_lblContrasea);
		
		txtcontrasea = new JTextField();
		GridBagConstraints gbc_txtcontrasea = new GridBagConstraints();
		gbc_txtcontrasea.insets = new Insets(0, 0, 5, 5);
		gbc_txtcontrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtcontrasea.gridx = 2;
		gbc_txtcontrasea.gridy = 4;
		contentPane.add(txtcontrasea, gbc_txtcontrasea);
		txtcontrasea.setColumns(10);
		
		btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		GridBagConstraints gbc_btnIniciarSesin = new GridBagConstraints();
		gbc_btnIniciarSesin.insets = new Insets(0, 0, 5, 5);
		gbc_btnIniciarSesin.gridx = 2;
		gbc_btnIniciarSesin.gridy = 6;
		contentPane.add(btnIniciarSesin, gbc_btnIniciarSesin);
		
		lblnoTienesUna = new JLabel("\u00BFNo tienes una cuenta?");
		GridBagConstraints gbc_lblnoTienesUna = new GridBagConstraints();
		gbc_lblnoTienesUna.insets = new Insets(0, 0, 5, 5);
		gbc_lblnoTienesUna.gridx = 1;
		gbc_lblnoTienesUna.gridy = 8;
		contentPane.add(lblnoTienesUna, gbc_lblnoTienesUna);
		
		btnRegistrarse = new JButton("Registrarse");
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrarse.gridx = 1;
		gbc_btnRegistrarse.gridy = 9;
		contentPane.add(btnRegistrarse, gbc_btnRegistrarse);
	}

}
