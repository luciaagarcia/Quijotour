package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;

public class Principal {

	private JFrame frame;

	private JPanel pnlMenu;
	private JPanel pnlPrincipal;
	private JPanel pnlRutas;
	private JPanel pnlGuias;
	private JPanel pnlGrupoTuristas;
	private JPanel pnlHistorial;

	private JButton btnPerfil;
	private JButton btnRutas;
	private JButton btnHistorial;
	private JButton btnTuristas;
	private JButton btnGuias;
	private JButton btnAjustes;
	private JButton btnCerrarSesion;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					Principal window = new Principal();
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
	public Principal() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Principal.class.getResource("/presentacion/recursos/pngocean.com(2).png")));
		frame.setUndecorated(true);
		frame.setType(Type.UTILITY);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, 1185, 824);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		pnlMenu = new JPanel();
		pnlMenu.setBorder(null);
		pnlMenu.setBackground(new Color(45, 51, 74));
		GridBagConstraints gbc_pnlMenu = new GridBagConstraints();
		gbc_pnlMenu.insets = new Insets(0, 0, 0, 5);
		gbc_pnlMenu.fill = GridBagConstraints.BOTH;
		gbc_pnlMenu.gridx = 0;
		gbc_pnlMenu.gridy = 0;
		frame.getContentPane().add(pnlMenu, gbc_pnlMenu);
		GridBagLayout gbl_pnlMenu = new GridBagLayout();
		gbl_pnlMenu.columnWidths = new int[] { 57, 0 };
		gbl_pnlMenu.rowHeights = new int[] { 0, 90, 50, 70, 20, 70, 20, 70, 20, 70, 70, 70, 20, 70, 20, 70, 10, 0 };
		gbl_pnlMenu.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlMenu.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlMenu.setLayout(gbl_pnlMenu);

		btnPerfil = new JButton("");
		btnPerfil.setToolTipText("Perfil");
		btnPerfil.setContentAreaFilled(false);
		btnPerfil.setBorderPainted(false);
		btnPerfil.setOpaque(false);
		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon(Guias.class.getResource("/presentacion/recursos/pngocean.com(2).png")).getImage()
						.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		btnPerfil.setIcon(imageIcon);
		GridBagConstraints gbc_btnPerfil = new GridBagConstraints();
		gbc_btnPerfil.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPerfil.insets = new Insets(0, 0, 5, 0);
		gbc_btnPerfil.gridx = 0;
		gbc_btnPerfil.gridy = 1;
		pnlMenu.add(btnPerfil, gbc_btnPerfil);

		btnRutas = new JButton("");
		btnRutas.setBackground(Color.WHITE);
		btnRutas.setContentAreaFilled(false);
		btnRutas.setBorderPainted(false);
		btnRutas.setOpaque(false);
		btnRutas.addActionListener(new BtnRutasActionListener());
		btnRutas.setToolTipText("Rutas");
		btnRutas.setIcon(new ImageIcon(Principal.class.getResource("/res/icons8-ruta-64.png")));
		GridBagConstraints gbc_btnRutas = new GridBagConstraints();
		gbc_btnRutas.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRutas.insets = new Insets(0, 0, 5, 0);
		gbc_btnRutas.gridx = 0;
		gbc_btnRutas.gridy = 3;
		pnlMenu.add(btnRutas, gbc_btnRutas);

		btnHistorial = new JButton("");
		btnHistorial.setContentAreaFilled(false);
		btnHistorial.setBackground(Color.WHITE);
		btnHistorial.setBorderPainted(false);
		btnHistorial.setToolTipText("Historial");
		btnHistorial.setIcon(new ImageIcon(Principal.class.getResource("/res/icons8-historial-de-pedidos-64.png")));
		btnHistorial.addActionListener(new BtnHistorialActionListener());
		GridBagConstraints gbc_btnHistorial = new GridBagConstraints();
		gbc_btnHistorial.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHistorial.insets = new Insets(0, 0, 5, 0);
		gbc_btnHistorial.gridx = 0;
		gbc_btnHistorial.gridy = 5;
		pnlMenu.add(btnHistorial, gbc_btnHistorial);

		btnTuristas = new JButton("");
		btnTuristas.setBackground(Color.WHITE);
		btnTuristas.setIcon(
				new ImageIcon(Principal.class.getResource("/res/icons8-grupo-de-usuarios-hombre-hombre-64.png")));
		btnTuristas.setToolTipText("Turistas");
		btnTuristas.setContentAreaFilled(false);
		btnTuristas.setBorderPainted(false);
		btnTuristas.setOpaque(false);
		btnTuristas.addActionListener(new BtnTuristasActionListener());
		GridBagConstraints gbc_btnTuristas = new GridBagConstraints();
		gbc_btnTuristas.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTuristas.insets = new Insets(0, 0, 5, 0);
		gbc_btnTuristas.gridx = 0;
		gbc_btnTuristas.gridy = 7;
		pnlMenu.add(btnTuristas, gbc_btnTuristas);

		btnGuias = new JButton("");
		btnGuias.setBackground(Color.WHITE);
		btnGuias.setContentAreaFilled(false);
		btnGuias.setBorderPainted(false);
		btnGuias.setOpaque(false);
		btnGuias.setIcon(new ImageIcon(Principal.class.getResource("/res/icons8-tourist-guide-1-64.png")));
		btnGuias.addActionListener(new BtnGuiasActionListener());
		btnGuias.setToolTipText("Guias");
		GridBagConstraints gbc_btnGuias = new GridBagConstraints();
		gbc_btnGuias.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGuias.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuias.gridx = 0;
		gbc_btnGuias.gridy = 9;
		pnlMenu.add(btnGuias, gbc_btnGuias);

		btnAjustes = new JButton("");
		btnAjustes.setContentAreaFilled(false);
		btnAjustes.setBorderPainted(false);
		btnAjustes.setOpaque(false);
		btnAjustes.setIcon(new ImageIcon(Principal.class.getResource("/res/icons8-ajustes-64.png")));
		btnAjustes.setToolTipText("Ajustes");
		GridBagConstraints gbc_btnAjustes = new GridBagConstraints();
		gbc_btnAjustes.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAjustes.insets = new Insets(0, 0, 5, 0);
		gbc_btnAjustes.gridx = 0;
		gbc_btnAjustes.gridy = 11;
		pnlMenu.add(btnAjustes, gbc_btnAjustes);

		btnCerrarSesion = new JButton("");
		btnCerrarSesion.setOpaque(false);
		btnCerrarSesion.setContentAreaFilled(false);
		btnCerrarSesion.setBorderPainted(false);
		btnCerrarSesion
				.setIcon(new ImageIcon(Principal.class.getResource("/res/icons8-salida-de-emergencia-64 (2).png")));
		btnCerrarSesion.setToolTipText("Cerrar sesion");
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 5, 0);
		gbc_btnCerrarSesion.gridx = 0;
		gbc_btnCerrarSesion.gridy = 13;
		pnlMenu.add(btnCerrarSesion, gbc_btnCerrarSesion);

		btnSalir = new JButton("");
		btnSalir.setToolTipText("Salir");
		btnSalir.setIcon(new ImageIcon(Principal.class.getResource("/res/icons8-boton-de-apagado-64.png")));
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.addActionListener(new BtnSalirActionListener());
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 5, 0);
		gbc_btnSalir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalir.gridx = 0;
		gbc_btnSalir.gridy = 15;
		pnlMenu.add(btnSalir, gbc_btnSalir);

		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.WHITE);

		GridBagConstraints gbc_pnlPrincipal = new GridBagConstraints();
		gbc_pnlPrincipal.fill = GridBagConstraints.BOTH;
		gbc_pnlPrincipal.gridx = 1;
		gbc_pnlPrincipal.gridy = 0;
		frame.getContentPane().add(pnlPrincipal, gbc_pnlPrincipal);
		pnlPrincipal.setLayout(new CardLayout(0, 0));

		pnlRutas = new Rutas();
		pnlRutas.setBackground(new Color(255, 255, 255));
		pnlGuias = new Guias();
		pnlGuias.setOpaque(false);
		pnlHistorial = new Historial();
		pnlHistorial.setOpaque(false);
		pnlGrupoTuristas = new GrupoTuristas();
		pnlGrupoTuristas.setOpaque(false);
		pnlPrincipal.add(pnlRutas, "Rutas");
		pnlPrincipal.add(pnlGuias, "Guias");
		pnlPrincipal.add(pnlGrupoTuristas, "Grupo Turistas");
		pnlPrincipal.add(pnlHistorial, "Historial");

	}

	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Salir", JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				System.exit(0);
			}
		}
	}

	private class BtnRutasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnRutas.setEnabled(false);
			btnRutas.setOpaque(true);
			btnGuias.setEnabled(true);
			btnGuias.setOpaque(false);
			btnHistorial.setEnabled(true);
			btnHistorial.setOpaque(false);
			btnTuristas.setEnabled(true);
			btnTuristas.setOpaque(false);
			((CardLayout) pnlPrincipal.getLayout()).show(pnlPrincipal, "Rutas");

		}
	}

	private class BtnGuiasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnRutas.setEnabled(true);
			btnRutas.setOpaque(false);
			btnGuias.setEnabled(false);
			btnGuias.setOpaque(true);
			btnHistorial.setEnabled(true);
			btnHistorial.setOpaque(false);
			btnTuristas.setEnabled(true);
			btnTuristas.setOpaque(false);
			((CardLayout) pnlPrincipal.getLayout()).show(pnlPrincipal, "Guias");
		}
	}

	private class BtnTuristasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnRutas.setEnabled(true);
			btnRutas.setOpaque(false);
			btnGuias.setEnabled(true);
			btnGuias.setOpaque(false);
			btnHistorial.setEnabled(true);
			btnHistorial.setOpaque(false);
			btnTuristas.setEnabled(false);
			btnTuristas.setOpaque(true);
			((CardLayout) pnlPrincipal.getLayout()).show(pnlPrincipal, "Grupo Turistas");

		}
	}

	private class BtnHistorialActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnRutas.setEnabled(true);
			btnRutas.setOpaque(false);
			btnGuias.setEnabled(true);
			btnGuias.setOpaque(false);
			btnHistorial.setEnabled(false);
			btnHistorial.setOpaque(true);
			btnTuristas.setEnabled(true);
			btnTuristas.setOpaque(false);
			((CardLayout) pnlPrincipal.getLayout()).show(pnlPrincipal, "Historial");

		}
	}
}
