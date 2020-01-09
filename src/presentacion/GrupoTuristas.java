package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import dominio.ConstTurista;
import persistencia.InfoTuristas;

public class GrupoTuristas extends JPanel {
	private JPanel panelBotones;
	private JScrollPane scrollPane;
	private JPanel panel_1;
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

	SeleccionarImagen selim = new SeleccionarImagen();
	InfoTuristas infoturistas = new InfoTuristas();
	ArrayList<ConstTurista> turistas = infoturistas.getTuristas();
	DefaultListModel<String> modeloTuristas = new DefaultListModel();
	ModeloTabla modeloTablaGrupoTuristas;// modelo definido en la clase ModeloTabla
	private JButton btnConfirmarGrupo;
	private JButton btnCancelarGrupo;
	private JLabel lblGrupoDeTuristas;
	private boolean añadir;
	int grupoSeleccionado = -1;

	/**
	 * Create the panel.
	 */
	public GrupoTuristas() {
		setLayout(new BorderLayout(0, 0));

		panelBotones = new JPanel();
		panelBotones.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBotones.setOpaque(false);
		add(panelBotones, BorderLayout.WEST);
		GridBagLayout gbl_panelBotones = new GridBagLayout();
		gbl_panelBotones.columnWidths = new int[] { 200, 0 };
		gbl_panelBotones.rowHeights = new int[] { 40, 20, 20, 5, 777, 0 };
		gbl_panelBotones.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panelBotones.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panelBotones.setLayout(gbl_panelBotones);

		btnAadirGrupo = new JButton(" Añadir grupo  ");
		btnAadirGrupo.addActionListener(new BtnAadirGrupoActionListener());

		lblGrupoDeTuristas = new JLabel("Grupo de turistas");
		lblGrupoDeTuristas.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblGrupoDeTuristas = new GridBagConstraints();
		gbc_lblGrupoDeTuristas.fill = GridBagConstraints.BOTH;
		gbc_lblGrupoDeTuristas.insets = new Insets(0, 0, 5, 0);
		gbc_lblGrupoDeTuristas.gridx = 0;
		gbc_lblGrupoDeTuristas.gridy = 0;
		panelBotones.add(lblGrupoDeTuristas, gbc_lblGrupoDeTuristas);
		btnAadirGrupo.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnAadirGrupo = new GridBagConstraints();
		gbc_btnAadirGrupo.fill = GridBagConstraints.VERTICAL;
		gbc_btnAadirGrupo.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirGrupo.gridx = 0;
		gbc_btnAadirGrupo.gridy = 1;
		panelBotones.add(btnAadirGrupo, gbc_btnAadirGrupo);
		btnAadirGrupo.setIcon(new ImageIcon(GrupoTuristas.class.getResource("/res/icons8-añadir-24.png")));
		btnAadirGrupo.setFont(new Font("Verdana", Font.BOLD, 17));

		btnAadirGrupo.setBackground(new Color(45, 51, 74));
		btnAadirGrupo.setForeground(Color.WHITE);
		btnAadirGrupo.setFont(new Font("Verdana", Font.BOLD, 17));

		btnEliminarGrupo = new JButton("Eliminar grupo");
		btnEliminarGrupo.addActionListener(new BtnEliminarGrupoActionListener());
		btnEliminarGrupo.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnEliminarGrupo = new GridBagConstraints();
		gbc_btnEliminarGrupo.fill = GridBagConstraints.VERTICAL;
		gbc_btnEliminarGrupo.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminarGrupo.gridx = 0;
		gbc_btnEliminarGrupo.gridy = 2;
		panelBotones.add(btnEliminarGrupo, gbc_btnEliminarGrupo);
		btnEliminarGrupo.setIcon(new ImageIcon(GrupoTuristas.class.getResource("/res/icons8-borrar-24.png")));
		btnEliminarGrupo.setFont(new Font("Verdana", Font.BOLD, 17));
		btnEliminarGrupo.setBackground(new Color(45, 51, 74));
		btnEliminarGrupo.setForeground(Color.WHITE);
		btnEliminarGrupo.setFont(new Font("Verdana", Font.BOLD, 17));

		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setOpaque(false);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		panelBotones.add(scrollPane, gbc_scrollPane);

		panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setOpaque(false);
		scrollPane.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		for (int i = 0; i < turistas.size(); i++) {
			modeloTuristas.add(i, turistas.get(i).getNombreTurista());
		}
		lista_grupos = new JList();
		lista_grupos.addMouseListener(new Lista_gruposMouseListener());
		GridBagConstraints gbc_lista_grupos = new GridBagConstraints();
		gbc_lista_grupos.fill = GridBagConstraints.BOTH;
		gbc_lista_grupos.gridx = 0;
		gbc_lista_grupos.gridy = 0;
		lista_grupos.setModel(modeloTuristas);
		lista_grupos.setCellRenderer(new JListCellRenderer());
		panel_1.add(lista_grupos, gbc_lista_grupos);

		panel_principal = new JPanel();
		panel_principal.setOpaque(false);
		add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));

		panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_principal.add(panel_3, BorderLayout.CENTER);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 0, 215, 975, 0, 0, 0 };
		gbl_panel_3.rowHeights = new int[] { 10, 400, 50, 400, 10, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setOpaque(false);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.anchor = GridBagConstraints.NORTH;
		gbc_scrollPane_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		panel_3.add(scrollPane_1, gbc_scrollPane_1);

		tableGrupoTuristas = new JTable();
		tableGrupoTuristas.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(tableGrupoTuristas);

		panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBorder(
				new TitledBorder(null, "Descripci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 3;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 3;
		panel_3.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		txtDescripcionTuristas = new JTextPane();
		txtDescripcionTuristas.setPreferredSize(new Dimension(350, 24));
		txtDescripcionTuristas.setText(
				"Se refiere al conjunto de individuos que están reunidos gracias a una fuerte relación, ya sea personal, afectuosa o íntima. Por ejemplo, en éstos es posible encontrar los grupos familiares y de amigos.\r\n"
						+ "\r\n"
						+ "Ejemplo de grupo familiar: los padres y dos hijos viven en un hogar, donde éstos comparten parte del día cuando están todos reunidos en el hogar y en las salidas familiares. Todos mantienen un vínculo afectuoso y de sangre.\r\n"
						+ "Los amigos son personas que ganan la confianza con el tiempo y en los que se establece una relación afectuosa.");
		txtDescripcionTuristas.setBackground(Color.WHITE);
		txtDescripcionTuristas.setEditable(false);
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
		gbl_panel_derecha.columnWidths = new int[] { 14, 200, 9, 0 };
		gbl_panel_derecha.rowHeights = new int[] { 36, 200, 10, 33, 20, 33, 300, 0, 0, 0, 0 };
		gbl_panel_derecha.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_derecha.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel_derecha.setLayout(gbl_panel_derecha);

		lblFoto = new JLabel("");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 1;
		gbc_lblFoto.gridy = 1;
		panel_derecha.add(lblFoto, gbc_lblFoto);
		lblFoto.setIcon(imageIcon);

		btnCambiarFoto = new JButton("Cambiar foto");
		btnCambiarFoto.addActionListener(new BtnCambiarFotoActionListener());
		GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
		gbc_btnCambiarFoto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCambiarFoto.gridx = 1;
		gbc_btnCambiarFoto.gridy = 3;
		panel_derecha.add(btnCambiarFoto, gbc_btnCambiarFoto);
		btnCambiarFoto.setIcon(new ImageIcon(GrupoTuristas.class.getResource("/res/icons8-foto-24.png")));

		btnModificarGrupo = new JButton("Modificar grupo");
		btnModificarGrupo.addActionListener(new BtnModificarGrupoActionListener());
		btnModificarGrupo.setIcon(new ImageIcon(GrupoTuristas.class.getResource("/res/icons8-editar-24.png")));
		GridBagConstraints gbc_btnModificarGrupo = new GridBagConstraints();
		gbc_btnModificarGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarGrupo.gridx = 1;
		gbc_btnModificarGrupo.gridy = 5;
		panel_derecha.add(btnModificarGrupo, gbc_btnModificarGrupo);

		btnConfirmarGrupo = new JButton("Confirmar grupo");
		btnConfirmarGrupo.addActionListener(new BtnConfirmarGrupoActionListener());
		btnConfirmarGrupo.setVisible(false);
		GridBagConstraints gbc_btnConfirmarGrupo = new GridBagConstraints();
		gbc_btnConfirmarGrupo.fill = GridBagConstraints.BOTH;
		gbc_btnConfirmarGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmarGrupo.gridx = 1;
		gbc_btnConfirmarGrupo.gridy = 7;
		panel_derecha.add(btnConfirmarGrupo, gbc_btnConfirmarGrupo);

		btnCancelarGrupo = new JButton("Cancelar grupo");
		btnCancelarGrupo.setVisible(false);
		GridBagConstraints gbc_btnCancelarGrupo = new GridBagConstraints();
		gbc_btnCancelarGrupo.fill = GridBagConstraints.BOTH;
		gbc_btnCancelarGrupo.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelarGrupo.gridx = 1;
		gbc_btnCancelarGrupo.gridy = 9;
		panel_derecha.add(btnCancelarGrupo, gbc_btnCancelarGrupo);

		btnCambiarFoto.setBackground(new Color(45, 51, 74));
		btnModificarGrupo.setBackground(new Color(45, 51, 74));
		btnConfirmarGrupo.setBackground(new Color(45, 51, 74));
		btnCancelarGrupo.setBackground(new Color(45, 51, 74));
		btnCambiarFoto.setForeground(Color.WHITE);
		btnModificarGrupo.setForeground(Color.WHITE);
		btnConfirmarGrupo.setForeground(Color.WHITE);
		btnCancelarGrupo.setForeground(Color.WHITE);
		btnCambiarFoto.setFont(new Font("Verdana", Font.BOLD, 17));
		btnModificarGrupo.setFont(new Font("Verdana", Font.BOLD, 17));
		btnCancelarGrupo.setFont(new Font("Verdana", Font.BOLD, 17));
		btnConfirmarGrupo.setFont(new Font("Verdana", Font.BOLD, 17));
		TableCellListener tcl = new TableCellListener(tableGrupoTuristas, new Cell_Listener());
	}

	private class Cell_Listener extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			TableCellListener tcl = (TableCellListener) arg0.getSource();
			modeloTablaGrupoTuristas.setDatos(tcl.getColumn(), tcl.getRow(), tcl.getNewValue());
			boolean completo = true;
			Object[] turista = modeloTablaGrupoTuristas.getFila(tableGrupoTuristas.getRowCount() - 1);
			for (int i = 0; i < turista.length; i++) {
				if (turista[i] == null || turista[i] == "") {
					completo = false;
				}
			}
			if (completo && modeloTablaGrupoTuristas.getRowCount() <= 20) {
				completo = true;
				modeloTablaGrupoTuristas.addRow(new Object[] { "", "", "", "" });
				modeloTablaGrupoTuristas.setDatosMatriz();
				for (int i = 0; i < modeloTablaGrupoTuristas.getColumnCount(); i++) {
					modeloTablaGrupoTuristas.setCellEditable(modeloTablaGrupoTuristas.getRowCount() - 1, i, true);
				}
			}

		}
	}

	private class Lista_gruposMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {

			Random random = new Random();
			chckbxAlergias.setSelected(random.nextBoolean());
			chckbxIdioma.setSelected(random.nextBoolean());
			chckbxMonumentos.setSelected(random.nextBoolean());
			chckbxMovilidad.setSelected(random.nextBoolean());
			chckbxMuseos.setSelected(random.nextBoolean());
			chckbxNaturaleza.setSelected(random.nextBoolean());
			chckbxPlaya.setSelected(random.nextBoolean());

			construirTabla();
		}
	}

	private class BtnCambiarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Image img = selim.SelectImage();
			Image newImg = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon image = new ImageIcon(newImg);

			lblFoto.setIcon(image);
		}
	}

	private class BtnEliminarGrupoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			grupoSeleccionado = lista_grupos.getSelectedIndex();
			try {
				int resp = JOptionPane.showConfirmDialog(null,
						"¿Desea eliminar el grupo " + lista_grupos.getSelectedValue().toString() + "?",
						"Eliminar grupo", JOptionPane.YES_NO_OPTION);
				if (resp == 0) {

					turistas.remove(grupoSeleccionado);
					((DefaultListModel) lista_grupos.getModel()).remove(grupoSeleccionado);
					panelBotones.repaint();
					panelBotones.revalidate();
					limpiarSeleccion();
				}
			} catch (java.lang.NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Por favor, seleccione una grupo a eliminar");
			}
		}
	}

	private class BtnAadirGrupoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnConfirmarGrupo.setVisible(true);
			btnCancelarGrupo.setVisible(true);
			limpiarSeleccion();
			tableGrupoTuristas.setCellSelectionEnabled(true);
			for (int i = 0; i < 4; i++) {
				modeloTablaGrupoTuristas.addRow(new Object[] { "", "", "", "" });
			}
			modeloTablaGrupoTuristas.CambiarTabla(modeloTablaGrupoTuristas.getRowCount(),
					modeloTablaGrupoTuristas.getColumnCount(), true);
			añadir = true;

		}
	}

	private class BtnModificarGrupoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modeloTablaGrupoTuristas.CambiarTabla(modeloTablaGrupoTuristas.getRowCount(),
					modeloTablaGrupoTuristas.getColumnCount(), true);
			btnConfirmarGrupo.setVisible(true);
			btnCancelarGrupo.setVisible(true);
			btnAadirGrupo.setEnabled(false);
			btnEliminarGrupo.setEnabled(false);
			añadir = false;
		}
	}

	private class BtnConfirmarGrupoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int resp;
				if (añadir) {
					resp = JOptionPane.showConfirmDialog(null, "¿Desea añadir este grupo de turistas al sistema?",
							"Añadir grupo", JOptionPane.YES_NO_OPTION);
					if (resp == 0) {
						DefaultListModel mod =	(DefaultListModel) lista_grupos.getModel(); 
						mod.addElement((String) modeloTablaGrupoTuristas.getValueAt(0, 0));
						lista_grupos.setModel(mod);
					}
				} else {
					resp = JOptionPane.showConfirmDialog(null,
							"¿Desea modificar el grupo " + lista_grupos.getSelectedValue().toString() + "?",
							"Modificar grupo", JOptionPane.YES_NO_OPTION);
					if (resp == 0) {

					}
				}
				modeloTablaGrupoTuristas.CambiarTabla(modeloTablaGrupoTuristas.getRowCount(),
						modeloTablaGrupoTuristas.getColumnCount(), false);
				btnConfirmarGrupo.setVisible(false);
				btnCancelarGrupo.setVisible(false);
				btnAadirGrupo.setEnabled(true);
				btnEliminarGrupo.setEnabled(true);

			} catch (Exception except) {

			}

		}

	}

	private void limpiarSeleccion() {
		txtDescripcionTuristas.setText("");
		chckbxAlergias.setSelected(false);
		chckbxIdioma.setSelected(false);
		chckbxMonumentos.setSelected(false);
		chckbxMovilidad.setSelected(false);
		chckbxMuseos.setSelected(false);
		chckbxNaturaleza.setSelected(false);
		chckbxPlaya.setSelected(false);
		while (tableGrupoTuristas.getModel().getRowCount() > 0) {
			((DefaultTableModel) tableGrupoTuristas.getModel()).removeRow(0);
		}
		modeloTablaGrupoTuristas.setRowCount(0);
		modeloTablaGrupoTuristas.vaciarDatos();

	}

	private void construirTabla() {
		ArrayList<String> titulosList = new ArrayList<String>();
		titulosList.add("Nombre");
		titulosList.add("Apellidos");
		titulosList.add("Edad");
		titulosList.add("Contacto");

		String titulos[] = new String[titulosList.size()];
		for (int i = 0; i < titulos.length; i++) {
			titulos[i] = titulosList.get(i);
		}
		Object[][] data = obtenerMatrizDatos(titulosList);
		construirTabla(titulos, data);
	}

	private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList) {
		int num = (int) ((Math.random() * (16)) + 4);
		String informacion[][] = new String[num][titulosList.size()];

		for (int i = 0; i < num; i++) {
			int sel = (int) (Math.random() * turistas.size());

			informacion[i][0] = turistas.get(sel).getNombreTurista();
			informacion[i][1] = turistas.get(sel).getApellidosTurista();
			informacion[i][2] = turistas.get(sel).getEdad();
			informacion[i][3] = turistas.get(sel).getContacto();
		}
		return informacion;
	}

	private void construirTabla(String[] titulos, Object[][] data) {
		modeloTablaGrupoTuristas = new ModeloTabla(data, titulos);
		tableGrupoTuristas.setModel(modeloTablaGrupoTuristas);

		tableGrupoTuristas.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("texto"));
		tableGrupoTuristas.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
		tableGrupoTuristas.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("numerico"));
		tableGrupoTuristas.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("numerico"));

		tableGrupoTuristas.getTableHeader().setReorderingAllowed(false);
		tableGrupoTuristas.setRowHeight(35);
		tableGrupoTuristas.setGridColor(new Color(0, 0, 0));

		JTableHeader jtableHeader = tableGrupoTuristas.getTableHeader();
		jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
		tableGrupoTuristas.setTableHeader(jtableHeader);

		scrollPane_1.setViewportView(tableGrupoTuristas);

	}

}
