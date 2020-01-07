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
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Callejero {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblCallejero;
	private JLabel lblCrearRuta;
	private JButton btnSituarGps;
	private JTextField textField;
	private JLabel lblHoraInicio;
	private JLabel lblHoraFinal;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblNombreRuta;
	private JTextField textField_1;
	private JButton btnCrearRuta;
	private JSeparator separator;

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
		frame.setBounds(100, 100, 559, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{71, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblCrearRuta = new JLabel("Crear Ruta");
		GridBagConstraints gbc_lblCrearRuta = new GridBagConstraints();
		gbc_lblCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearRuta.gridx = 0;
		gbc_lblCrearRuta.gridy = 0;
		panel.add(lblCrearRuta, gbc_lblCrearRuta);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnSituarGps = new JButton("Situar GPS");
		GridBagConstraints gbc_btnSituarGps = new GridBagConstraints();
		gbc_btnSituarGps.insets = new Insets(0, 0, 5, 5);
		gbc_btnSituarGps.gridx = 1;
		gbc_btnSituarGps.gridy = 2;
		panel.add(btnSituarGps, gbc_btnSituarGps);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 3;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 3;
		panel.add(separator, gbc_separator);
		
		lblHoraInicio = new JLabel("Hora Inicio:");
		GridBagConstraints gbc_lblHoraInicio = new GridBagConstraints();
		gbc_lblHoraInicio.anchor = GridBagConstraints.EAST;
		gbc_lblHoraInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraInicio.gridx = 0;
		gbc_lblHoraInicio.gridy = 5;
		panel.add(lblHoraInicio, gbc_lblHoraInicio);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"11 00", "12 00", "13 00", "14 00", "15 00", "16 00", "17 00 ", "18 00"}));
		comboBox.addItemListener(new ComboBoxItemListener());
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 5;
		panel.add(comboBox, gbc_comboBox);
		
		lblHoraFinal = new JLabel("Hora Final:");
		GridBagConstraints gbc_lblHoraFinal = new GridBagConstraints();
		gbc_lblHoraFinal.anchor = GridBagConstraints.EAST;
		gbc_lblHoraFinal.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraFinal.gridx = 0;
		gbc_lblHoraFinal.gridy = 6;
		panel.add(lblHoraFinal, gbc_lblHoraFinal);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"11 00", "12 00", "13 00", "14 00", "15 00", "16 00", "17 00 ", "18 00"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 6;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		lblNombreRuta = new JLabel("Nombre Ruta");
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.anchor = GridBagConstraints.EAST;
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 0;
		gbc_lblNombreRuta.gridy = 8;
		panel.add(lblNombreRuta, gbc_lblNombreRuta);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 8;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnCrearRuta = new JButton("Crear Ruta");
		GridBagConstraints gbc_btnCrearRuta = new GridBagConstraints();
		gbc_btnCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearRuta.gridx = 1;
		gbc_btnCrearRuta.gridy = 9;
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
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(Callejero.class.getResource("/presentacion/recursos/Callejero-de-Madrid.jpeg")).getImage().getScaledInstance(280, 280, Image.SCALE_DEFAULT));
		lblCallejero.setIcon(imageIcon2);
		GridBagConstraints gbc_lblCallejero = new GridBagConstraints();
		gbc_lblCallejero.gridx = 0;
		gbc_lblCallejero.gridy = 0;
		panel_1.add(lblCallejero, gbc_lblCallejero);
	}

	private class ComboBoxItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
		}
	}
}
