package presentacion;

import java.io.Serializable;

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