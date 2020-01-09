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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;

public class Callejero {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblCallejero;
	private JLabel lblCrearRuta;
	private JLabel lblNombreRuta;
	private JTextField textField_1;
	private JButton btnCrearRuta;
	private JSeparator separator;
	private JList list;
	private JButton btnAadirParada;
	private JLabel lblParada;
	private JTextField textField_2;
	private JComboBox comboBox_2;
	private JLabel lblSeleccionaCiudad;
	private JLabel lblDuracionDeRuta;
	private JLabel quijote;
	private JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Callejero window = new Callejero();
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
	public Callejero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1107, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{245, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 113, 0, 0, 52, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblCrearRuta = new JLabel("Crea tu propia ruta");
		lblCrearRuta.setFont(new Font("Tahoma", Font.ITALIC, 13));
		GridBagConstraints gbc_lblCrearRuta = new GridBagConstraints();
		gbc_lblCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearRuta.gridx = 0;
		gbc_lblCrearRuta.gridy = 0;
		panel.add(lblCrearRuta, gbc_lblCrearRuta);
		//
		lblSeleccionaCiudad = new JLabel("Selecciona ciudad:");
		lblSeleccionaCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSeleccionaCiudad = new GridBagConstraints();
		gbc_lblSeleccionaCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionaCiudad.gridx = 0;
		gbc_lblSeleccionaCiudad.gridy = 2;
		panel.add(lblSeleccionaCiudad, gbc_lblSeleccionaCiudad);
		//
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Ciudad Real", "Toledo", "Tomelloso", "Almad\u00E9n", "El Toboso"}));
		comboBox_2.setToolTipText("");
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 2;
		panel.add(comboBox_2, gbc_comboBox_2);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 3;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 3;
		panel.add(separator, gbc_separator);
		
		lblNombreRuta = new JLabel("Nombre Ruta");
		lblNombreRuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 0;
		gbc_lblNombreRuta.gridy = 4;
		panel.add(lblNombreRuta, gbc_lblNombreRuta);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(Color.BLACK));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblDuracionDeRuta = new JLabel("Duraci\u00F3n en horas de ruta:");
		lblDuracionDeRuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDuracionDeRuta = new GridBagConstraints();
		gbc_lblDuracionDeRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracionDeRuta.gridx = 0;
		gbc_lblDuracionDeRuta.gridy = 5;
		panel.add(lblDuracionDeRuta, gbc_lblDuracionDeRuta);
		
		slider = new JSlider();
		slider.setMaximum(4);
		slider.setMinimum(1);
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridx = 1;
		gbc_slider.gridy = 5;
		panel.add(slider, gbc_slider);
		
		quijote = new JLabel("");
		quijote.setIcon(new ImageIcon(Callejero.class.getResource("/presentacion/recursos/quijobocata.jpeg")));
		GridBagConstraints gbc_quijote = new GridBagConstraints();
		gbc_quijote.insets = new Insets(0, 0, 5, 5);
		gbc_quijote.gridx = 1;
		gbc_quijote.gridy = 8;
		panel.add(quijote, gbc_quijote);
		
		lblParada = new JLabel("Parada");
		lblParada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblParada = new GridBagConstraints();
		gbc_lblParada.insets = new Insets(0, 0, 5, 5);
		gbc_lblParada.gridx = 0;
		gbc_lblParada.gridy = 10;
		panel.add(lblParada, gbc_lblParada);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.BLACK));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 10;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		btnAadirParada = new JButton("A\u00F1adir Parada");
		btnAadirParada.setForeground(Color.WHITE);
		btnAadirParada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAadirParada.setBackground(new Color(45, 51, 74));
		GridBagConstraints gbc_btnAadirParada = new GridBagConstraints();
		gbc_btnAadirParada.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirParada.gridx = 1;
		gbc_btnAadirParada.gridy = 11;
		panel.add(btnAadirParada, gbc_btnAadirParada);
		
		list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 12;
		panel.add(list, gbc_list);
		
		btnCrearRuta = new JButton("Crear Ruta");
		btnCrearRuta.setForeground(Color.WHITE);
		btnCrearRuta.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCrearRuta.setBackground(new Color(45, 51, 74));
		GridBagConstraints gbc_btnCrearRuta = new GridBagConstraints();
		gbc_btnCrearRuta.gridheight = 2;
		gbc_btnCrearRuta.fill = GridBagConstraints.VERTICAL;
		gbc_btnCrearRuta.gridwidth = 3;
		gbc_btnCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearRuta.gridx = 0;
		gbc_btnCrearRuta.gridy = 13;
		panel.add(btnCrearRuta, gbc_btnCrearRuta);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{65, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblCallejero = new JLabel();
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(Callejero.class.getResource("/presentacion/recursos/Callejero-de-Madrid.jpeg")).getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT));
		lblCallejero.setIcon(imageIcon2);
		GridBagConstraints gbc_lblCallejero = new GridBagConstraints();
		gbc_lblCallejero.gridx = 0;
		gbc_lblCallejero.gridy = 0;
		panel_1.add(lblCallejero, gbc_lblCallejero);
	}
	public class Imagen extends ObjetoGraf implements Serializable {
		private Image imagen;

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
			    System.out.println(objetosGraficos.size());
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
