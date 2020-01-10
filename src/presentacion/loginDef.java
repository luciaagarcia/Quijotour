package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class loginDef extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JLabel icono;
	private JButton btnEntrar;
	private JPanel panel;
	private JLabel imag;
	private JLabel lblBienvenidosAQuijotour;
	private JLabel lblOlvidado;
	private JButton btnRegistrar;

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
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(loginDef.class.getResource("/presentacion/recursos/pngocean.com(2).png")));
		setSize(screenSize);
		setMinimumSize(new Dimension(1200, 800));
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
		gbl_panel_1.columnWidths = new int[] { 10, 141, 220, 10, 0 };
		gbl_panel_1.rowHeights = new int[] { 200, 145, 80, 50, 50, 68, 150, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		ImageIcon ic = new ImageIcon(
				new ImageIcon(loginDef.class.getResource("/presentacion/recursos/pngocean.com(1).png")).getImage()
						.getScaledInstance(200, 200, Image.SCALE_SMOOTH));

		icono = new JLabel("");
		icono.setIcon(ic);
		GridBagConstraints gbc_icono = new GridBagConstraints();
		gbc_icono.anchor = GridBagConstraints.SOUTH;
		gbc_icono.gridwidth = 2;
		gbc_icono.insets = new Insets(0, 0, 5, 5);
		gbc_icono.gridx = 1;
		gbc_icono.gridy = 1;
		panel_1.add(icono, gbc_icono);
		icono.setSize(100, 100);

		lblBienvenidosAQuijotour = new JLabel("Bienvenido a Quijotour.");
		lblBienvenidosAQuijotour.setFont(new Font("Century Schoolbook", Font.ITALIC, 33));
		GridBagConstraints gbc_lblBienvenidosAQuijotour = new GridBagConstraints();
		gbc_lblBienvenidosAQuijotour.anchor = GridBagConstraints.NORTH;
		gbc_lblBienvenidosAQuijotour.gridwidth = 2;
		gbc_lblBienvenidosAQuijotour.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenidosAQuijotour.gridx = 1;
		gbc_lblBienvenidosAQuijotour.gridy = 2;
		panel_1.add(lblBienvenidosAQuijotour, gbc_lblBienvenidosAQuijotour);

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 3;
		panel_1.add(lblUsuario, gbc_lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("SansSerif", Font.PLAIN, 26));
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.fill = GridBagConstraints.BOTH;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.gridx = 2;
		gbc_txtUsuario.gridy = 3;
		panel_1.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 4;
		panel_1.add(lblContrasea, gbc_lblContrasea);

		txtPassword = new JPasswordField();
		txtPassword.addKeyListener(new TxtPasswordKeyListener());
		txtPassword.setEchoChar('•');
		txtPassword.setFont(new Font("SansSerif", Font.PLAIN, 26));
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.fill = GridBagConstraints.BOTH;
		gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtPassword.gridx = 2;
		gbc_txtPassword.gridy = 4;
		panel_1.add(txtPassword, gbc_txtPassword);
		txtPassword.setColumns(10);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addKeyListener(new BtnEntrarKeyListener());
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBackground(new Color(45, 51, 74));
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 35));
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.fill = GridBagConstraints.BOTH;
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 2;
		gbc_btnEntrar.gridy = 5;
		panel_1.add(btnEntrar, gbc_btnEntrar);

		lblOlvidado = new JLabel("He olvidado mi contraseña");
		lblOlvidado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblOlvidado.addMouseListener(new LblOlvidadoMouseListener());
		lblOlvidado.setForeground(new Color(30, 144, 255));
		lblOlvidado.setFont(new Font("SansSerif", Font.PLAIN, 18));
		Font font = lblOlvidado.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblOlvidado.setFont(font.deriveFont(attributes));
		GridBagConstraints gbc_lblOlvidado = new GridBagConstraints();
		gbc_lblOlvidado.gridwidth = 2;
		gbc_lblOlvidado.insets = new Insets(0, 0, 5, 5);
		gbc_lblOlvidado.gridx = 1;
		gbc_lblOlvidado.gridy = 7;
		panel_1.add(lblOlvidado, gbc_lblOlvidado);

		btnRegistrar = new JButton("Registrarse");
		btnRegistrar.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnRegistrar.addActionListener(new BtnRegistrarActionListener());
		btnRegistrar.setBackground(new Color(45, 51, 74));
		btnRegistrar.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.gridwidth = 2;
		gbc_btnRegistrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegistrar.gridx = 1;
		gbc_btnRegistrar.gridy = 8;
		panel_1.add(btnRegistrar, gbc_btnRegistrar);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);

		ImageIcon im = new ImageIcon(new ImageIcon(loginDef.class.getResource("/res/molineos.jpg")).getImage());

		imag = new JLabel("");
		imag.setBounds(0, 0, 1437, 1024);
		imag.setSize(screenSize);

		imag.setIcon(im);
		panel.add(imag);
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			autenticar();
		}
	}

	public void autenticar() {
		if (txtUsuario.getText().equals("admin") && txtPassword.getText().equals("admin")) {
			Principal princi = new Principal();
			dispose();

		} else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");

		}
	}

	private class TxtPasswordKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent arg0) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				autenticar();
			}
		}
	}

	private class BtnEntrarKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				autenticar();
			}

		}
	}

	private class LblOlvidadoMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			JOptionPane.showMessageDialog(null, "Los datos para entrar son: \n Usuario: admin \n Contraseña: admin");
		}
	}

	private class BtnRegistrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Este panel no está implementado.");
		}
	}
}
