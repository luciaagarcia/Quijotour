package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.Icon;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.Rectangle;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import java.awt.GridLayout;

public class Guias extends JPanel {
	private JPanel pnlListaGuias;
	private JPanel panel_principal;
	private JScrollPane scrollPane;
	private JPanel panel_listaguias;
	private JButton btnGuia;
	private JButton btnGuia_1;
	private JPanel panel_botonesgenerales;
	private JButton btnAadirGuia;
	private JButton btnEliminarGuia;
	private JPanel panel_informacion;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JLabel lblCorreo;
	private JLabel lblTelefono;
	private JLabel lblPrecio;
	private JButton btnCambiarFoto;
	private JPanel panel_horario;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JPanel panel_historial;
	private JScrollPane scrollPane_2;
	private JTable table_1;
	private JButton btnModificarDatos;
	private JButton btnModificarCalendario;

	/**
	 * Create the panel.
	 */
	public Guias() {
		setOpaque(false);
		setAutoscrolls(true);
		setLayout(new BorderLayout(0, 0));
		
		pnlListaGuias = new JPanel();
		pnlListaGuias.setOpaque(false);
		add(pnlListaGuias, BorderLayout.WEST);
		
		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		pnlListaGuias.setLayout(new BorderLayout(0, 0));
		scrollPane.setSize(new Dimension(pnlListaGuias.getSize()));
		pnlListaGuias.add(scrollPane);
		
		panel_listaguias = new JPanel();
		panel_listaguias.setOpaque(false);
		panel_listaguias.setAutoscrolls(true);
		scrollPane.setViewportView(panel_listaguias);
		panel_listaguias.setLayout(new BoxLayout(panel_listaguias, BoxLayout.Y_AXIS));
		
		btnGuia = new JButton("Guia 1");
		panel_listaguias.add(btnGuia);
		
		btnGuia_1 = new JButton("Guia 2");
		panel_listaguias.add(btnGuia_1);
		
		panel_botonesgenerales = new JPanel();
		panel_botonesgenerales.setOpaque(false);
		pnlListaGuias.add(panel_botonesgenerales, BorderLayout.NORTH);
		panel_botonesgenerales.setLayout(new BoxLayout(panel_botonesgenerales, BoxLayout.Y_AXIS));
		
		btnAadirGuia = new JButton("Añadir guia");
		btnAadirGuia.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_botonesgenerales.add(btnAadirGuia);
		
		btnEliminarGuia = new JButton("Eliminar guia");
		btnEliminarGuia.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_botonesgenerales.add(btnEliminarGuia);
		 
		panel_principal = new JPanel();
		panel_principal.setOpaque(false);
		panel_principal.setBounds(new Rectangle(0, 10, 0, 0));
		add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));
		
		panel_informacion = new JPanel();
		panel_informacion.setOpaque(false);
		panel_principal.add(panel_informacion, BorderLayout.NORTH);
		GridBagLayout gbl_panel_informacion = new GridBagLayout();
		gbl_panel_informacion.columnWidths = new int[]{0, 0, 0, 0, 107, 36, 139, 35, 0};
		gbl_panel_informacion.rowHeights = new int[]{39, 36, 0, 43, 0, 0, 51, 53, 0, 0};
		gbl_panel_informacion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_informacion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_informacion.setLayout(gbl_panel_informacion);
		
		lblFoto = new JLabel("");
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(Guias.class.getResource("/presentacion/recursos/pngocean.com(2).png")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		lblFoto.setIcon(imageIcon);
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 3;
		gbc_lblFoto.gridheight = 6;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 1;
		panel_informacion.add(lblFoto, gbc_lblFoto);
		
		lblNombre = new JLabel("Don quijote de la Mancha y los Caballeros");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.gridwidth = 3;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 4;
		gbc_lblNombre.gridy = 2;
		panel_informacion.add(lblNombre, gbc_lblNombre);
		
		lblCorreo = new JLabel("DonQuijote@alu.uclm.es");
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.WEST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 4;
		gbc_lblCorreo.gridy = 4;
		panel_informacion.add(lblCorreo, gbc_lblCorreo);
		
		lblTelefono = new JLabel("6551132145");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 6;
		gbc_lblTelefono.gridy = 4;
		panel_informacion.add(lblTelefono, gbc_lblTelefono);
		
		lblPrecio = new JLabel("Precio: 8.5€/hora");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 4;
		gbc_lblPrecio.gridy = 5;
		panel_informacion.add(lblPrecio, gbc_lblPrecio);
		
		btnCambiarFoto = new JButton("Cambiar foto");
		btnCambiarFoto.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-foto-24.png")));
		GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
		gbc_btnCambiarFoto.gridwidth = 3;
		gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCambiarFoto.gridx = 0;
		gbc_btnCambiarFoto.gridy = 7;
		panel_informacion.add(btnCambiarFoto, gbc_btnCambiarFoto);
		
		btnModificarDatos = new JButton("Modificar datos");
		btnModificarDatos.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-editar-24.png")));
		GridBagConstraints gbc_btnModificarDatos = new GridBagConstraints();
		gbc_btnModificarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarDatos.gridx = 4;
		gbc_btnModificarDatos.gridy = 7;
		panel_informacion.add(btnModificarDatos, gbc_btnModificarDatos);
		
		btnModificarCalendario = new JButton("Modificar calendario");
		btnModificarCalendario.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-calendario-24.png")));
		GridBagConstraints gbc_btnModificarCalendario = new GridBagConstraints();
		gbc_btnModificarCalendario.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarCalendario.gridx = 6;
		gbc_btnModificarCalendario.gridy = 7;
		panel_informacion.add(btnModificarCalendario, gbc_btnModificarCalendario);
		
		panel_horario = new JPanel();
		panel_horario.setOpaque(false);
		panel_principal.add(panel_horario, BorderLayout.CENTER);
		GridBagLayout gbl_panel_horario = new GridBagLayout();
		gbl_panel_horario.columnWidths = new int[]{21, 1265, 32, 0};
		gbl_panel_horario.rowHeights = new int[]{37, 430, 0};
		gbl_panel_horario.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_horario.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_horario.setLayout(gbl_panel_horario);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		panel_horario.add(scrollPane_1, gbc_scrollPane_1);
		
		table = new JTable();
		table.setRowHeight(50);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"6:00", null, null, "Alcázar de San Juan\n Grupo: Lucía A.", null, null, null, null},
				{"8:00", null, null, null, null, null, null, null},
				{"10:00", null, null, null, null, null, null, null},
				{"12:00", null, null, null, null, null, null, null},
				{"16:30", "Lagunas de Ruidera\n Grupo:5432", null, null, null, null, null, null},
				{"18:30", null, null, null, null, null, null, null},
				{"20:30", null, null, null, null, null, null, null},
				{"22:30", null, null, null, null, null, null, null},
			},
			new String[] {
				"Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
			}
		));
		scrollPane_1.setViewportView(table);
		TableColumnModel columnModel = table.getColumnModel();
		
		panel_historial = new JPanel();
		panel_historial.setOpaque(false);
		panel_historial.setPreferredSize(new Dimension(300, 300));
		panel_historial.setBorder(new TitledBorder(null, "Historial de rutas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_principal.add(panel_historial, BorderLayout.SOUTH);
		panel_historial.setLayout(new BorderLayout(0, 0));
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setOpaque(false);
		panel_historial.add(scrollPane_2, BorderLayout.CENTER);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Lagunas de ruidera", "Eustaquio F.", "35", "2h 15m"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nombre ruta", "Grupo turista", "Precio(\u20AC)", "Duraci\u00F3n"
			}
		));
	    columnModel.getColumn(0).setPreferredWidth(50);
	    columnModel.getColumn(1).setPreferredWidth(200);
	    columnModel.getColumn(2).setPreferredWidth(200);
	    columnModel.getColumn(3).setPreferredWidth(200);
	    columnModel.getColumn(4).setPreferredWidth(200);
	    columnModel.getColumn(5).setPreferredWidth(200);
	    columnModel.getColumn(6).setPreferredWidth(100);
	    columnModel.getColumn(7).setPreferredWidth(100);
		scrollPane_2.setViewportView(table_1);

	}


	/*private class BtnAadirGuiaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			for(int i=0; i<50;i++) {
				btnGuia = new JButton("Guia 1");
				panel_listaguias.add(btnGuia);
				System.out.println("Holita");
				repaint();
			}
		}
	}*/
	
}
