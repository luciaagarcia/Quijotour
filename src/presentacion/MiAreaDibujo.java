package presentacion;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;

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