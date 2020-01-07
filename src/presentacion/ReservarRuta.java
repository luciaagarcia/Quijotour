package presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import dominio.ConstGuia;
import dominio.ConstHistorial;
import dominio.ConstTurista;
import persistencia.InfoGuias;
import persistencia.InfoHistorial;
import persistencia.InfoTuristas;
import presentacion.Historial;
import com.toedter.calendar.JCalendar;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ReservarRuta extends JFrame {

	private JPanel contentPane;
	private JList list_GrupoTurista;
	private JList list_Guia;
	private JButton btnConfirmarReserva;
	private JButton btnCancelar;
	protected JLabel lblNombreRuta;

	InfoGuias infoguias = new InfoGuias();
	InfoTuristas infoturistas = new InfoTuristas();
	InfoHistorial infohistorial = new InfoHistorial();
	ArrayList<ConstGuia> guias = infoguias.getGuias();
	ArrayList<ConstTurista> turista = infoturistas.getTuristas();
	ArrayList<ConstHistorial> historial = infohistorial.getHistorial();
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private Historial histo;
	private JPanel panel;
	private JLabel lblFecha;
	private JDateChooser dateChooser;
	private JLabel lblHora;
	private JComboBox comboBox;
	private Date date = new Date();
	private String dateFormatString = "dd/MM/yy";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservarRuta frame = new ReservarRuta();
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
	public ReservarRuta() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(new Color(45, 51, 74));
		setResizable(false);
		setBounds(100, 100, 547, 759);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(45, 51, 74));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 20, 100, 100, 50, 100, 100, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 300, 50, 50, 50, 57, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblNombreRuta = new JLabel("Nombre ruta");
		lblNombreRuta.setForeground(Color.WHITE);
		lblNombreRuta.setFont(new Font("SansSerif", Font.BOLD, 40));
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombreRuta.gridwidth = 5;
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 1;
		gbc_lblNombreRuta.gridy = 1;
		contentPane.add(lblNombreRuta, gbc_lblNombreRuta);
		DefaultListModel<String> modeloTurista = new DefaultListModel();
		for (int i = 0; i < turista.size(); i++) {
			modeloTurista.add(i, turista.get(i).getNombreTurista());
		}

		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);

		list_GrupoTurista = new JList();
		scrollPane.setViewportView(list_GrupoTurista);
		list_GrupoTurista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		list_GrupoTurista.setModel(modeloTurista);
		list_GrupoTurista.setSelectionBackground(new Color(251, 227, 185));

		list_GrupoTurista.setBorder(new TitledBorder(null, "Grupo de turistas", TitledBorder.LEADING, TitledBorder.TOP,
				new Font("SansSerif", Font.BOLD, 14), null));
		DefaultListModel<String> modelo = new DefaultListModel();
		for (int i = 0; i < guias.size(); i++) {
			modelo.add(i, guias.get(i).getNombre());
		}

		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 4;
		gbc_scrollPane_1.gridy = 3;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);

		list_Guia = new JList();
		scrollPane_1.setViewportView(list_Guia);
		list_Guia.setSelectionBackground(new Color(251, 227, 185));
		list_Guia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_Guia.setModel(modelo);

		list_Guia.setBorder(new TitledBorder(null, "Guia", TitledBorder.LEADING, TitledBorder.TOP,
				new Font("SansSerif", Font.BOLD, 14), null));

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.addActionListener(new BtnCancelarActionListener());

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Fecha reserva", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 5;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 10, 0, 180, 50, 0, 180, 10, 0 };
		gbl_panel.rowHeights = new int[] { 10, 0, 0, 10, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 1;
		panel.add(lblFecha, gbc_lblFecha);


		dateChooser = new JDateChooser(date, dateFormatString);
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 1;
		panel.add(dateChooser, gbc_dateChooser);

		lblHora = new JLabel("Hora:");
		GridBagConstraints gbc_lblHora = new GridBagConstraints();
		gbc_lblHora.anchor = GridBagConstraints.EAST;
		gbc_lblHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblHora.gridx = 4;
		gbc_lblHora.gridy = 1;
		panel.add(lblHora, gbc_lblHora);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "6:00", "8:00", "10:00", "12:00", "16:30", "18:30", "20:30", "22:30" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 1;
		panel.add(comboBox, gbc_comboBox);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 7;
		contentPane.add(btnCancelar, gbc_btnCancelar);

		btnConfirmarReserva = new JButton("Confirmar reserva");
		btnConfirmarReserva.setBackground(Color.WHITE);
		btnConfirmarReserva.addActionListener(new BtnConfirmarReservaActionListener());
		GridBagConstraints gbc_btnConfirmarReserva = new GridBagConstraints();
		gbc_btnConfirmarReserva.fill = GridBagConstraints.BOTH;
		gbc_btnConfirmarReserva.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmarReserva.gridx = 4;
		gbc_btnConfirmarReserva.gridy = 7;
		contentPane.add(btnConfirmarReserva, gbc_btnConfirmarReserva);

	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			dispose();
		}
	}

	private class BtnConfirmarReservaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null,
					"Está a punto de realizar la reserva: \n Ruta:" + lblNombreRuta.getText() + "\n Grupo turista: "
							+ list_GrupoTurista.getSelectedValue().toString() + "\n Guia: "
							+ list_Guia.getSelectedValue().toString() + "\n Fecha: " + dateChooser.getDate().toString()
							+ "\n Hora: " + comboBox.getSelectedItem().toString(),
					"Reservar", JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				Object[] reserva = new Object[] { lblNombreRuta.getText(),
						list_GrupoTurista.getSelectedValue().toString(), list_Guia.getSelectedValue().toString(),
						dateChooser.getDate().toString() + comboBox.getSelectedItem().toString() };
				histo.addTabla(reserva);
				setVisible(false);
				dispose();
			}
		}
	}

	public void setHistorial(Historial historial) {
		this.histo = historial;
	}
}
