package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginDef extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtUsuario;
	private JTextField textField;
	private JLabel icono;
	private JButton btnEntrar;
	private JPanel panel;
	private JLabel imag;
	private JLabel lblBienvenidosAQuijotour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginDef frame = new loginDef();
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
	public loginDef() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 597);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 384, 443, 0 };
		gbl_contentPane.rowHeights = new int[] { 551, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setFont(new Font("Cambria", Font.ITALIC, 22));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 141, 220, 10, 0 };
		gbl_panel_1.rowHeights = new int[] { 200, 301, 68, 63, 68, 61, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		ImageIcon ic = new ImageIcon(
				new ImageIcon(loginDef.class.getResource("/presentacion/recursos/pngocean.com(1).png")).getImage()
						.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

		icono = new JLabel("");
		icono.setIcon(ic);
		GridBagConstraints gbc_icono = new GridBagConstraints();
		gbc_icono.insets = new Insets(0, 0, 5, 5);
		gbc_icono.gridx = 0;
		gbc_icono.gridy = 1;
		panel_1.add(icono, gbc_icono);
		icono.setSize(100, 100);

		lblBienvenidosAQuijotour = new JLabel("Bienvenidos a Quijotour.");
		lblBienvenidosAQuijotour.setFont(new Font("Century Schoolbook", Font.ITALIC, 24));
		GridBagConstraints gbc_lblBienvenidosAQuijotour = new GridBagConstraints();
		gbc_lblBienvenidosAQuijotour.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenidosAQuijotour.gridx = 1;
		gbc_lblBienvenidosAQuijotour.gridy = 1;
		panel_1.add(lblBienvenidosAQuijotour, gbc_lblBienvenidosAQuijotour);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 2;
		panel_1.add(lblUsuario, gbc_lblUsuario);

		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 2;
		panel_1.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 3;
		panel_1.add(lblContrasea, gbc_lblContrasea);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBackground(new Color(45, 51, 74));
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 35));
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.fill = GridBagConstraints.BOTH;
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 1;
		gbc_btnEntrar.gridy = 4;
		panel_1.add(btnEntrar, gbc_btnEntrar);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);

		ImageIcon im = new ImageIcon(
				new ImageIcon(loginDef.class.getResource("/res/molineos.jpg")).getImage());
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 400, 0 };
		gbl_panel.rowHeights = new int[] { 600, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		imag = new JLabel("");
		imag.setIcon(im);
		GridBagConstraints gbc_imag = new GridBagConstraints();
		gbc_imag.anchor = GridBagConstraints.NORTHEAST;
		gbc_imag.gridx = 0;
		gbc_imag.gridy = 0;
		panel.add(imag, gbc_imag);
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			Principal princi = new Principal();
		}
	}
}
