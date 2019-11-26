package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Principal {

	private JFrame frame;
	private JPanel pnlMenu;
	private JPanel pnlPrincipal;
	private JButton btnPerfil;
	private JButton btnRutas;
	private JButton btnHistorial;
	private JButton btnTuristas;
	private JButton btnGuias;
	private JButton btnAjustes;
	private JPanel pnlRutas;
	private JButton btnAadirRuta;
	private JButton btnEliminarRuta;
	private JButton btnModificarRuta;
	private JButton btnEnviarRuta;
	private JButton btnReservarRuta;
	private JLabel lblMapa;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 748, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		pnlMenu = new JPanel();
		GridBagConstraints gbc_pnlMenu = new GridBagConstraints();
		gbc_pnlMenu.insets = new Insets(0, 0, 0, 5);
		gbc_pnlMenu.fill = GridBagConstraints.BOTH;
		gbc_pnlMenu.gridx = 0;
		gbc_pnlMenu.gridy = 0;
		frame.getContentPane().add(pnlMenu, gbc_pnlMenu);
		GridBagLayout gbl_pnlMenu = new GridBagLayout();
		gbl_pnlMenu.columnWidths = new int[]{57, 0};
		gbl_pnlMenu.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlMenu.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlMenu.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlMenu.setLayout(gbl_pnlMenu);
		
		btnPerfil = new JButton("Perfil");
		GridBagConstraints gbc_btnPerfil = new GridBagConstraints();
		gbc_btnPerfil.insets = new Insets(0, 0, 5, 0);
		gbc_btnPerfil.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnPerfil.gridx = 0;
		gbc_btnPerfil.gridy = 0;
		pnlMenu.add(btnPerfil, gbc_btnPerfil);
		
		btnRutas = new JButton("Rutas");
		GridBagConstraints gbc_btnRutas = new GridBagConstraints();
		gbc_btnRutas.insets = new Insets(0, 0, 5, 0);
		gbc_btnRutas.gridx = 0;
		gbc_btnRutas.gridy = 2;
		pnlMenu.add(btnRutas, gbc_btnRutas);
		
		btnHistorial = new JButton("Historial");
		GridBagConstraints gbc_btnHistorial = new GridBagConstraints();
		gbc_btnHistorial.insets = new Insets(0, 0, 5, 0);
		gbc_btnHistorial.gridx = 0;
		gbc_btnHistorial.gridy = 4;
		pnlMenu.add(btnHistorial, gbc_btnHistorial);
		
		btnTuristas = new JButton("Turistas");
		GridBagConstraints gbc_btnTuristas = new GridBagConstraints();
		gbc_btnTuristas.insets = new Insets(0, 0, 5, 0);
		gbc_btnTuristas.gridx = 0;
		gbc_btnTuristas.gridy = 6;
		pnlMenu.add(btnTuristas, gbc_btnTuristas);
		
		btnGuias = new JButton("Guias");
		GridBagConstraints gbc_btnGuias = new GridBagConstraints();
		gbc_btnGuias.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuias.gridx = 0;
		gbc_btnGuias.gridy = 8;
		pnlMenu.add(btnGuias, gbc_btnGuias);
		
		btnAjustes = new JButton("Ajustes");
		GridBagConstraints gbc_btnAjustes = new GridBagConstraints();
		gbc_btnAjustes.gridx = 0;
		gbc_btnAjustes.gridy = 10;
		pnlMenu.add(btnAjustes, gbc_btnAjustes);
		
		pnlPrincipal = new JPanel();
		GridBagConstraints gbc_pnlPrincipal = new GridBagConstraints();
		gbc_pnlPrincipal.fill = GridBagConstraints.BOTH;
		gbc_pnlPrincipal.gridx = 1;
		gbc_pnlPrincipal.gridy = 0;
		frame.getContentPane().add(pnlPrincipal, gbc_pnlPrincipal);
		pnlPrincipal.setLayout(new CardLayout(0, 0));
		
		pnlRutas = new JPanel();
		pnlPrincipal.add(pnlRutas, "name_10357207342300");
		GridBagLayout gbl_pnlRutas = new GridBagLayout();
		gbl_pnlRutas.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlRutas.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlRutas.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlRutas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlRutas.setLayout(gbl_pnlRutas);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 4;
		gbc_textArea.gridwidth = 9;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 11;
		pnlRutas.add(textArea, gbc_textArea);
		
		btnAadirRuta = new JButton("Añadir ruta");
		GridBagConstraints gbc_btnAadirRuta = new GridBagConstraints();
		gbc_btnAadirRuta.insets = new Insets(0, 0, 0, 5);
		gbc_btnAadirRuta.gridx = 0;
		gbc_btnAadirRuta.gridy = 16;
		pnlRutas.add(btnAadirRuta, gbc_btnAadirRuta);
		
		btnEliminarRuta = new JButton("Eliminar ruta");
		GridBagConstraints gbc_btnEliminarRuta = new GridBagConstraints();
		gbc_btnEliminarRuta.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminarRuta.gridx = 2;
		gbc_btnEliminarRuta.gridy = 16;
		pnlRutas.add(btnEliminarRuta, gbc_btnEliminarRuta);
		
		btnModificarRuta = new JButton("Modificar ruta");
		GridBagConstraints gbc_btnModificarRuta = new GridBagConstraints();
		gbc_btnModificarRuta.insets = new Insets(0, 0, 0, 5);
		gbc_btnModificarRuta.gridx = 4;
		gbc_btnModificarRuta.gridy = 16;
		pnlRutas.add(btnModificarRuta, gbc_btnModificarRuta);
		
		btnEnviarRuta = new JButton("Enviar ruta");
		GridBagConstraints gbc_btnEnviarRuta = new GridBagConstraints();
		gbc_btnEnviarRuta.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviarRuta.gridx = 6;
		gbc_btnEnviarRuta.gridy = 16;
		pnlRutas.add(btnEnviarRuta, gbc_btnEnviarRuta);
		
		btnReservarRuta = new JButton("Reservar ruta");
		GridBagConstraints gbc_btnReservarRuta = new GridBagConstraints();
		gbc_btnReservarRuta.insets = new Insets(0, 0, 0, 5);
		gbc_btnReservarRuta.gridx = 8;
		gbc_btnReservarRuta.gridy = 16;
		pnlRutas.add(btnReservarRuta, gbc_btnReservarRuta);
		
		lblMapa = new JLabel("Mapa");
		GridBagConstraints gbc_lblMapa = new GridBagConstraints();
		gbc_lblMapa.gridheight = 6;
		gbc_lblMapa.gridx = 10;
		gbc_lblMapa.gridy = 11;
		pnlRutas.add(lblMapa, gbc_lblMapa);
	}

}
