package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;

public class Guias extends JPanel {
	private JPanel pnlListaGuias;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JButton btnGuia;
	private JButton btnGuia_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Create the panel.
	 */
	public Guias() {
		setAutoscrolls(true);
		setLayout(new BorderLayout(0, 0));
		
		pnlListaGuias = new JPanel();
		add(pnlListaGuias, BorderLayout.WEST);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pnlListaGuias.add(scrollPane);
		
		panel_2 = new JPanel();
		panel_2.setAutoscrolls(true);
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		btnGuia = new JButton("Guia 1");
		panel_2.add(btnGuia);
		
		btnGuia_1 = new JButton("Guia 2");
		panel_2.add(btnGuia_1);
		
		btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		panel_2.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		panel_2.add(btnNewButton_4);
		 
		panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

	}

}
