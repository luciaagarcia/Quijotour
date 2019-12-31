package presentacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login2 {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JTextField textField;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblIcono;
	private JButton btnEntrar;
	private JLabel lblLucaAlfonsoGarca;
	private JLabel lblSergioGarcaMoraleda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login2.class.getResource("/presentacion/recursos/Quijotour.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(new Color(45,51,74));
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{67, 0, 38, 0};
		gbl_panel.rowHeights = new int[]{0, 70, 0, 0, 0, 0, 40, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(Login2.class.getResource("/presentacion/recursos/Quijotour.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		
		lblIcono = new JLabel();
		lblIcono.setIcon(imageIcon2);
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 1;
		gbc_lblIcono.gridy = 1;
		panel.add(lblIcono, gbc_lblIcono);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 3;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 4;
		panel.add(lblContrasea, gbc_lblContrasea);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 1;
		gbc_btnEntrar.gridy = 5;
		panel.add(btnEntrar, gbc_btnEntrar);
		
		lblLucaAlfonsoGarca = new JLabel("Luc\u00EDa Alfonso Garc\u00EDa");
		lblLucaAlfonsoGarca.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblLucaAlfonsoGarca = new GridBagConstraints();
		gbc_lblLucaAlfonsoGarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblLucaAlfonsoGarca.gridx = 1;
		gbc_lblLucaAlfonsoGarca.gridy = 7;
		panel.add(lblLucaAlfonsoGarca, gbc_lblLucaAlfonsoGarca);
		
		lblSergioGarcaMoraleda = new JLabel("Sergio Garc\u00EDa Moraleda");
		lblSergioGarcaMoraleda.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSergioGarcaMoraleda = new GridBagConstraints();
		gbc_lblSergioGarcaMoraleda.insets = new Insets(0, 0, 0, 5);
		gbc_lblSergioGarcaMoraleda.gridx = 1;
		gbc_lblSergioGarcaMoraleda.gridy = 8;
		panel.add(lblSergioGarcaMoraleda, gbc_lblSergioGarcaMoraleda);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		
		lblNewLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(Guias.class.getResource("/presentacion/recursos/molinos-al-lado-de-la-carretera_1962102852.jpeg")).getImage().getScaledInstance(280, 280
				, Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(imageIcon);

		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			Principal princi = new Principal();
		}
	}
}
