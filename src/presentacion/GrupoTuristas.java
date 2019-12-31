package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import dominio.ConstTurista;
import persistencia.InfoTuristas;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GrupoTuristas extends JPanel {
	private JPanel panelBotones;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnAadirGrupo;
	private JButton btnEliminarGrupo;
	private JPanel panel_principal;
	private JPanel panel_3;
	private JScrollPane scrollPane_1;
	private JTable tableGrupoTuristas;
	private JPanel panel_derecha;
	private JLabel lblFoto;
	private JButton btnCambiarFoto;
	private JButton btnModificarGrupo;
	private JPanel panel_5;
	private JTextPane txtDescripcionTuristas;
	private JPanel panel_sur;
	private JPanel panel_intereses;
	private JPanel panel_restricciones;
	private JCheckBox chckbxNaturaleza;
	private JCheckBox chckbxPlaya;
	private JCheckBox chckbxMonumentos;
	private JCheckBox chckbxMovilidad;
	private JCheckBox chckbxIdioma;
	private JCheckBox chckbxAlergias;
	private JCheckBox chckbxMuseos;
	private JList lista_grupos;

	InfoTuristas infoturistas = new InfoTuristas();
	ArrayList<ConstTurista> turistas = infoturistas.getTuristas();

	/**
	 * Create the panel.
	 */
	public GrupoTuristas() {
		setLayout(new BorderLayout(0, 0));

		panelBotones = new JPanel();
		panelBotones.setPreferredSize(new Dimension(200, 200));
		panelBotones.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBotones.setOpaque(false);
		add(panelBotones, BorderLayout.WEST);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		gbl_panelBotones.columnWidths = new int[] { 126, 0 };
		gbl_panelBotones.rowHeights = new int[] { 40, 72, 20, 777, 0 };
		gbl_panelBotones.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelBotones.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panelBotones.setLayout(gbl_panelBotones);

		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.anchor = GridBagConstraints.NORTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panelBotones.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		btnAadirGrupo = new JButton("Añadir grupo");
		panel_2.add(btnAadirGrupo);

		btnEliminarGrupo = new JButton("Eliminar grupo");
		panel_2.add(btnEliminarGrupo);

		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		panelBotones.add(scrollPane, gbc_scrollPane);

		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		scrollPane.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		DefaultListModel<String> modeloTuristas = new DefaultListModel();
		for (int i = 0; i < turistas.size(); i++) {
			modeloTuristas.add(i, turistas.get(i).getNombreTurista());
		}
		lista_grupos = new JList();
		lista_grupos.addMouseListener(new Lista_gruposMouseListener());
		lista_grupos.setSelectedIndex(0);
		GridBagConstraints gbc_lista_grupos = new GridBagConstraints();
		gbc_lista_grupos.fill = GridBagConstraints.BOTH;
		gbc_lista_grupos.gridx = 0;
		gbc_lista_grupos.gridy = 0;
		lista_grupos.setModel(modeloTuristas);
		panel_1.add(lista_grupos, gbc_lista_grupos);

		panel_principal = new JPanel();
		panel_principal.setOpaque(false);
		add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));

		panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBorder(
				new TitledBorder(null, "Miembros del grupo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_principal.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setOpaque(false);
		panel_3.add(scrollPane_1, BorderLayout.NORTH);

		tableGrupoTuristas = new JTable();
		scrollPane_1.setViewportView(tableGrupoTuristas);

		panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBorder(
				new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 0));

		txtDescripcionTuristas = new JTextPane();
		panel_5.add(txtDescripcionTuristas, BorderLayout.CENTER);

		panel_sur = new JPanel();
		panel_sur.setOpaque(false);
		panel_5.add(panel_sur, BorderLayout.EAST);
		panel_sur.setLayout(new BoxLayout(panel_sur, BoxLayout.Y_AXIS));

		panel_intereses = new JPanel();
		panel_intereses.setOpaque(false);
		panel_intereses
				.setBorder(new TitledBorder(null, "Intereses", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_sur.add(panel_intereses);
		GridBagLayout gbl_panel_intereses = new GridBagLayout();
		gbl_panel_intereses.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel_intereses.rowHeights = new int[] { 10, 0, 0, 18, 0, 10, 0 };
		gbl_panel_intereses.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_intereses.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_intereses.setLayout(gbl_panel_intereses);

		chckbxNaturaleza = new JCheckBox("Naturaleza");
		GridBagConstraints gbc_chckbxNaturaleza = new GridBagConstraints();
		gbc_chckbxNaturaleza.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNaturaleza.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNaturaleza.gridx = 1;
		gbc_chckbxNaturaleza.gridy = 1;
		panel_intereses.add(chckbxNaturaleza, gbc_chckbxNaturaleza);

		chckbxPlaya = new JCheckBox("Playa");
		GridBagConstraints gbc_chckbxPlaya = new GridBagConstraints();
		gbc_chckbxPlaya.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxPlaya.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPlaya.gridx = 1;
		gbc_chckbxPlaya.gridy = 2;
		panel_intereses.add(chckbxPlaya, gbc_chckbxPlaya);

		chckbxMonumentos = new JCheckBox("Monumentos");
		GridBagConstraints gbc_chckbxMonumentos = new GridBagConstraints();
		gbc_chckbxMonumentos.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxMonumentos.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMonumentos.gridx = 1;
		gbc_chckbxMonumentos.gridy = 3;
		panel_intereses.add(chckbxMonumentos, gbc_chckbxMonumentos);

		chckbxMuseos = new JCheckBox("Museos");
		GridBagConstraints gbc_chckbxMuseos = new GridBagConstraints();
		gbc_chckbxMuseos.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxMuseos.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMuseos.gridx = 1;
		gbc_chckbxMuseos.gridy = 4;
		panel_intereses.add(chckbxMuseos, gbc_chckbxMuseos);

		panel_restricciones = new JPanel();
		panel_restricciones.setOpaque(false);
		panel_restricciones
				.setBorder(new TitledBorder(null, "Restricciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_sur.add(panel_restricciones);
		GridBagLayout gbl_panel_restricciones = new GridBagLayout();
		gbl_panel_restricciones.columnWidths = new int[] { 10, 121, 10, 0 };
		gbl_panel_restricciones.rowHeights = new int[] { 10, 0, 0, 0, 10, 0 };
		gbl_panel_restricciones.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_restricciones.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_restricciones.setLayout(gbl_panel_restricciones);

		chckbxMovilidad = new JCheckBox("Movilidad");
		GridBagConstraints gbc_chckbxMovilidad = new GridBagConstraints();
		gbc_chckbxMovilidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxMovilidad.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMovilidad.gridx = 1;
		gbc_chckbxMovilidad.gridy = 1;
		panel_restricciones.add(chckbxMovilidad, gbc_chckbxMovilidad);

		chckbxIdioma = new JCheckBox("Idioma");
		GridBagConstraints gbc_chckbxIdioma = new GridBagConstraints();
		gbc_chckbxIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxIdioma.gridx = 1;
		gbc_chckbxIdioma.gridy = 2;
		panel_restricciones.add(chckbxIdioma, gbc_chckbxIdioma);

		chckbxAlergias = new JCheckBox("Alergias");
		GridBagConstraints gbc_chckbxAlergias = new GridBagConstraints();
		gbc_chckbxAlergias.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxAlergias.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxAlergias.gridx = 1;
		gbc_chckbxAlergias.gridy = 3;
		panel_restricciones.add(chckbxAlergias, gbc_chckbxAlergias);

		panel_derecha = new JPanel();
		panel_derecha.setOpaque(false);
		panel_principal.add(panel_derecha, BorderLayout.EAST);
		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon(Guias.class.getResource("/presentacion/recursos/pngocean.com(2).png")).getImage()
						.getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		GridBagLayout gbl_panel_derecha = new GridBagLayout();
		gbl_panel_derecha.columnWidths = new int[] { 200, 0 };
		gbl_panel_derecha.rowHeights = new int[] { 200, 33, 20, 33, 0 };
		gbl_panel_derecha.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_derecha.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_derecha.setLayout(gbl_panel_derecha);

		lblFoto = new JLabel("");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 0;
		panel_derecha.add(lblFoto, gbc_lblFoto);
		lblFoto.setIcon(imageIcon);

		btnCambiarFoto = new JButton("Cambiar foto");
		GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
		gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 0);
		gbc_btnCambiarFoto.gridx = 0;
		gbc_btnCambiarFoto.gridy = 1;
		panel_derecha.add(btnCambiarFoto, gbc_btnCambiarFoto);
		btnCambiarFoto.setIcon(new ImageIcon(GrupoTuristas.class.getResource("/res/icons8-foto-24.png")));

		btnModificarGrupo = new JButton("Modificar grupo");
		btnModificarGrupo.setIcon(new ImageIcon(GrupoTuristas.class.getResource("/res/icons8-editar-24.png")));
		GridBagConstraints gbc_btnModificarGrupo = new GridBagConstraints();
		gbc_btnModificarGrupo.gridx = 0;
		gbc_btnModificarGrupo.gridy = 3;
		panel_derecha.add(btnModificarGrupo, gbc_btnModificarGrupo);

	}

	private class Lista_gruposMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {

			DefaultTableModel modeloTablaGrupoTuristas = new DefaultTableModel();
			modeloTablaGrupoTuristas.addColumn("Nombre");
			modeloTablaGrupoTuristas.addColumn("Apellidos");
			modeloTablaGrupoTuristas.addColumn("Edad");
			modeloTablaGrupoTuristas.addColumn("Contacto");
			
			for(ConstTurista tur : turistas) {
				Object[] fila = new Object[4];
				fila[0] = tur.getNombreTurista();
				fila[1] = tur.getApellidosTurista();
				fila[2] = tur.getEdad();
				fila[3] = tur.getContacto();
				modeloTablaGrupoTuristas.addRow(fila);
			}
			tableGrupoTuristas.setModel(modeloTablaGrupoTuristas);
		}
	}
}
