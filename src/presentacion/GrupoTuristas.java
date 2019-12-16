package presentacion;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Dimension;


public class GrupoTuristas extends JPanel {
	private JPanel panel_izquierda;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_2;
	private JButton btnAadirGrupo;
	private JButton btnEliminarGrupo;
	private JPanel panel_principal;
	private JPanel panel_3;
	private JScrollPane scrollPane_1;
	private JTable table;
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

	/**
	 * Create the panel.
	 */
	public GrupoTuristas() {
		setLayout(new BorderLayout(0, 0));

		panel_izquierda = new JPanel();
		panel_izquierda.setOpaque(false);
		add(panel_izquierda, BorderLayout.WEST);
		panel_izquierda.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		panel_izquierda.add(scrollPane, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		btnNewButton = new JButton("Turista1");
		panel_1.add(btnNewButton);

		btnNewButton_1 = new JButton("Turista 2");
		panel_1.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Turista 3 jajajajjajajaaja");
		panel_1.add(btnNewButton_2);

		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_izquierda.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		btnAadirGrupo = new JButton("Añadir grupo");
		panel_2.add(btnAadirGrupo);

		btnEliminarGrupo = new JButton("Eliminar grupo");
		panel_2.add(btnEliminarGrupo);

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

		table = new JTable();
		table.setModel(
				new DefaultTableModel(
			new Object[][] {
				{"Quijotito", "De la mancha y los molinos", "35", "611223344"},
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
				"Nombre", "Apellidos", "Edad", "Contacto"
			}
		));
		scrollPane_1.setViewportView(table);

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
				gbl_panel_derecha.columnWidths = new int[]{200, 0};
				gbl_panel_derecha.rowHeights = new int[]{200, 33, 20, 33, 0};
				gbl_panel_derecha.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_panel_derecha.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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

}
