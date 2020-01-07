package presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JButton;

public class LoginEnCondiciones extends JPanel {
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public LoginEnCondiciones() {
		setSize(new Dimension(1000, 800));
		setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNewButton = new JButton("New button");
		add(btnNewButton);

	}

}
