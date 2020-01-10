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
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JViewport;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.DefaultTableModel;

import dominio.ConstParada;
import dominio.ConstRuta;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Callejero {

	JFrame frame;
	private JPanel panel;
	private JLabel lblCallejero = new MiAreaDibujo();
	private JLabel lblCrearRuta;
	private JLabel lblNombreRuta;
	private JButton btnCrearRuta;
	private JList list;
	private JButton btnAadirParada;
	private JLabel lblParada;
	private JLabel lblDuracionDeRuta;
	private JLabel quijote;
	private JSlider slider;
	private int x, y;
	private MiAreaDibujo Areadibuj;
	private Rutas rutasFrame;

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image imagCursor = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/recursos/marcador.png"))
			.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	private JScrollPane scrollPane;
	private JPanel panel_1;
	ArrayList<ConstParada> paradas = new ArrayList<ConstParada>();
	DefaultListModel<String> modeloParadas = new DefaultListModel();
	ArrayList<ConstRuta> rut;
	private JSlider slider_Complejidad;
	private JLabel lblComplejidad;
	private JLabel lblDistancia;
	private JSpinner spinnerPrecio;
	private JLabel lblPrecio;
	private JLabel lblTipoRuta;
	private JComboBox cmbTipoRuta;
	private JTextField txtNombreruta;
	private JTextField txtParadas;
	JList<String> lista_rutas;
	private JScrollPane scrollPane_1;
	private JSpinner spinnerDistancia;

	/**
	 * Create the application.
	 */
	public Callejero() {
		initialize();
		frame.setBounds(100, 100, 1107, 712);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Callejero.class.getResource("/presentacion/recursos/pngocean.com(2).png")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1107, 712);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 514, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 683, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 10, 245, 250, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 50, 50, 50, 50, 50, 50, 50, 0, 0, 113, 10, 0, 0, 52, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblCrearRuta = new JLabel("Crear ruta");
		lblCrearRuta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		GridBagConstraints gbc_lblCrearRuta = new GridBagConstraints();
		gbc_lblCrearRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearRuta.gridx = 1;
		gbc_lblCrearRuta.gridy = 0;
		panel.add(lblCrearRuta, gbc_lblCrearRuta);

		lblNombreRuta = new JLabel("Nombre ruta:");
		lblNombreRuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.anchor = GridBagConstraints.EAST;
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 1;
		gbc_lblNombreRuta.gridy = 2;
		panel.add(lblNombreRuta, gbc_lblNombreRuta);

		txtNombreruta = new JTextField();
		GridBagConstraints gbc_txtNombreruta = new GridBagConstraints();
		gbc_txtNombreruta.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreruta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreruta.gridx = 2;
		gbc_txtNombreruta.gridy = 2;
		panel.add(txtNombreruta, gbc_txtNombreruta);
		txtNombreruta.setColumns(10);

		lblComplejidad = new JLabel("Complejidad:");
		lblComplejidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblComplejidad = new GridBagConstraints();
		gbc_lblComplejidad.anchor = GridBagConstraints.EAST;
		gbc_lblComplejidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblComplejidad.gridx = 1;
		gbc_lblComplejidad.gridy = 3;
		panel.add(lblComplejidad, gbc_lblComplejidad);

		slider_Complejidad = new JSlider();
		slider_Complejidad.setMinimum(1);
		slider_Complejidad.setMajorTickSpacing(1);
		slider_Complejidad.setPaintTicks(true);
		slider_Complejidad.setPaintLabels(true);
		slider_Complejidad.setMinorTickSpacing(1);
		slider_Complejidad.setMaximum(10);
		GridBagConstraints gbc_slider_Complejidad = new GridBagConstraints();
		gbc_slider_Complejidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider_Complejidad.insets = new Insets(0, 0, 5, 5);
		gbc_slider_Complejidad.gridx = 2;
		gbc_slider_Complejidad.gridy = 3;
		panel.add(slider_Complejidad, gbc_slider_Complejidad);

		lblDuracionDeRuta = new JLabel("Duración de la ruta:");
		lblDuracionDeRuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDuracionDeRuta = new GridBagConstraints();
		gbc_lblDuracionDeRuta.anchor = GridBagConstraints.EAST;
		gbc_lblDuracionDeRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracionDeRuta.gridx = 1;
		gbc_lblDuracionDeRuta.gridy = 4;
		panel.add(lblDuracionDeRuta, gbc_lblDuracionDeRuta);

		slider = new JSlider();
		slider.setMaximum(6);
		slider.setMinimum(0);
		slider.setPaintLabels(true);
		slider.setBorder(null);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.fill = GridBagConstraints.BOTH;
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridx = 2;
		gbc_slider.gridy = 4;
		panel.add(slider, gbc_slider);

		btnAadirParada = new JButton("A\u00F1adir Parada");
		btnAadirParada.addActionListener(new BtnAadirParadaActionListener());

		lblDistancia = new JLabel("Distancia:");
		lblDistancia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDistancia = new GridBagConstraints();
		gbc_lblDistancia.anchor = GridBagConstraints.EAST;
		gbc_lblDistancia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDistancia.gridx = 1;
		gbc_lblDistancia.gridy = 5;
		panel.add(lblDistancia, gbc_lblDistancia);

		spinnerDistancia = new JSpinner();
		spinnerDistancia.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(5)));
		GridBagConstraints gbc_spinnerDistancia = new GridBagConstraints();
		gbc_spinnerDistancia.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerDistancia.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerDistancia.gridx = 2;
		gbc_spinnerDistancia.gridy = 5;
		panel.add(spinnerDistancia, gbc_spinnerDistancia);

		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 6;
		panel.add(lblPrecio, gbc_lblPrecio);

		spinnerPrecio = new JSpinner();
		spinnerPrecio.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		GridBagConstraints gbc_spinnerPrecio = new GridBagConstraints();
		gbc_spinnerPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerPrecio.gridx = 2;
		gbc_spinnerPrecio.gridy = 6;
		panel.add(spinnerPrecio, gbc_spinnerPrecio);

		lblTipoRuta = new JLabel("Tipo ruta:");
		lblTipoRuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTipoRuta = new GridBagConstraints();
		gbc_lblTipoRuta.anchor = GridBagConstraints.EAST;
		gbc_lblTipoRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoRuta.gridx = 1;
		gbc_lblTipoRuta.gridy = 7;
		panel.add(lblTipoRuta, gbc_lblTipoRuta);

		cmbTipoRuta = new JComboBox();
		cmbTipoRuta.setModel(new DefaultComboBoxModel(new String[] { "Playa", "Montaña", "Monumentos" }));
		GridBagConstraints gbc_cmbTipoRuta = new GridBagConstraints();
		gbc_cmbTipoRuta.insets = new Insets(0, 0, 5, 5);
		gbc_cmbTipoRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbTipoRuta.gridx = 2;
		gbc_cmbTipoRuta.gridy = 7;
		panel.add(cmbTipoRuta, gbc_cmbTipoRuta);

		lblParada = new JLabel("Paradas:");
		lblParada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblParada = new GridBagConstraints();
		gbc_lblParada.anchor = GridBagConstraints.EAST;
		gbc_lblParada.insets = new Insets(0, 0, 5, 5);
		gbc_lblParada.gridx = 1;
		gbc_lblParada.gridy = 8;
		panel.add(lblParada, gbc_lblParada);

		txtParadas = new JTextField();
		GridBagConstraints gbc_txtParadas = new GridBagConstraints();
		gbc_txtParadas.insets = new Insets(0, 0, 5, 5);
		gbc_txtParadas.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtParadas.gridx = 2;
		gbc_txtParadas.gridy = 8;
		panel.add(txtParadas, gbc_txtParadas);
		txtParadas.setColumns(10);
		btnAadirParada.setForeground(Color.WHITE);
		btnAadirParada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAadirParada.setBackground(new Color(45, 51, 74));
		GridBagConstraints gbc_btnAadirParada = new GridBagConstraints();
		gbc_btnAadirParada.fill = GridBagConstraints.BOTH;
		gbc_btnAadirParada.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirParada.gridx = 2;
		gbc_btnAadirParada.gridy = 9;
		panel.add(btnAadirParada, gbc_btnAadirParada);

		quijote = new JLabel("");
		quijote.setIcon(new ImageIcon(Callejero.class.getResource("/presentacion/recursos/quijobocata.jpeg")));
		GridBagConstraints gbc_quijote = new GridBagConstraints();
		gbc_quijote.gridheight = 2;
		gbc_quijote.insets = new Insets(0, 0, 5, 5);
		gbc_quijote.gridx = 1;
		gbc_quijote.gridy = 10;
		panel.add(quijote, gbc_quijote);

		btnCrearRuta = new JButton("Crear Ruta");
		btnCrearRuta.addActionListener(new BtnCrearRutaActionListener());

		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 10;
		panel.add(scrollPane_1, gbc_scrollPane_1);

		list = new JList();
		scrollPane_1.setViewportView(list);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setCellRenderer(new JListCellRenderer());
		btnCrearRuta.setForeground(Color.WHITE);
		btnCrearRuta.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCrearRuta.setBackground(new Color(45, 51, 74));
		GridBagConstraints gbc_btnCrearRuta = new GridBagConstraints();
		gbc_btnCrearRuta.gridheight = 2;
		gbc_btnCrearRuta.fill = GridBagConstraints.BOTH;
		gbc_btnCrearRuta.gridwidth = 3;
		gbc_btnCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearRuta.gridx = 1;
		gbc_btnCrearRuta.gridy = 13;
		panel.add(btnCrearRuta, gbc_btnCrearRuta);

		scrollPane = new JScrollPane();
		scrollPane.setOpaque(true);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		lblCallejero = new MiAreaDibujo();
		lblCallejero.addMouseListener(new AreaDibujMouseListener());
		ImageIcon imageIcon2 = new ImageIcon(
				new ImageIcon(Callejero.class.getResource("/presentacion/recursos/Callejero-de-Madrid.jpeg"))
						.getImage());
		lblCallejero.setIcon(imageIcon2);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblCallejero, gbc_lblNewLabel);

	}

	public void constRutas(ArrayList<ConstRuta> rutas, JList<String> lista_rutas) {
		this.rut = rutas;
		this.lista_rutas = lista_rutas;

	}

	private class AreaDibujMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			toolkit = Toolkit.getDefaultToolkit();

			((MiAreaDibujo) lblCallejero).addObjetoGrafico(new Imagen(x, y, imagCursor));
			lblCallejero.repaint();

		}
	}

	public boolean isCompleto() {
		if (txtNombreruta.getText().equals("") || spinnerDistancia.getValue().equals(0) || slider.getValue() == 0
				|| spinnerPrecio.getValue().equals(0)) {
			return false;
		} else {
			return true;
		}
	}

	private class BtnCrearRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				if (isCompleto()) {
					ConstRuta ruta = new ConstRuta(txtNombreruta.getText(), Integer.toString(slider.getValue()),
							spinnerDistancia.getValue().toString(), "", "", spinnerPrecio.getValue().toString(),
							Integer.toString(slider_Complejidad.getValue()), cmbTipoRuta.getSelectedItem().toString(),
							cmbTipoRuta.getSelectedItem().toString(), false);

					rut.add(ruta);

					DefaultListModel<String> mod = (DefaultListModel<String>) lista_rutas.getModel();
					mod.addElement(txtNombreruta.getText());
					lista_rutas = new JList<String>(mod);

					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,
							"Por favor, asegúrese de que ha introducido todos los valores de forma correcta.");

				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,
						"Por favor, asegúrese de que ha introducido todos los valores de forma correcta.");
			}
		}
	}

	private class BtnAadirParadaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			paradas.add(new ConstParada(txtParadas.getText(), ""));

			llenarModelo();
		}
	}

	private void llenarModelo() {
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		for (int i = 0; i < paradas.size(); i++) {
			modelo.addElement(paradas.get(i).getNombreParada());
			modeloParadas.add(i, paradas.get(i).getNombreParada());
		}
		list.setModel(modelo);
		list.revalidate();
		txtParadas.setText("");
	}

	public class Imagen extends ObjetoGraf implements Serializable {
		private Image imagen;

//
		public Imagen(int x, int y, Image imagen) {
			super(x, y);
			this.imagen = imagen;
		}

		public void setImagen(Image imagen) {
			this.imagen = imagen;
		}

		public Image getImagen() {
			return imagen;
		}

	}

	public class MiAreaDibujo extends JLabel {

		private ArrayList<ObjetoGraf> objetosGraficos = new ArrayList<ObjetoGraf>();

		public MiAreaDibujo() {
		}

		void addObjetoGrafico(ObjetoGraf objg) {
			objetosGraficos.add(objg);
		}

		public ObjetoGraf getUltimoObjetoGrafico() {
			return objetosGraficos.get(objetosGraficos.size() - 1);
		}

		public void paint(Graphics g) {
			super.paint(g);
			for (int i = 0; i < objetosGraficos.size(); i++) {
				ObjetoGraf objg = objetosGraficos.get(i);
				if (objg instanceof Imagen) {
					g.drawImage(((Imagen) objg).getImagen(), objg.getX(), objg.getY(), null);
				}

			}
		}
	}

	public class ObjetoGraf implements Serializable {
		private int x, y;

		public ObjetoGraf(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}

}
