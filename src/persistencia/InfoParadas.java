package persistencia;

import java.util.ArrayList;

import dominio.ConstParada;

public class InfoParadas {
	public ArrayList<ConstParada> getParadas() {
		ArrayList<ConstParada> paradas = new ArrayList<ConstParada>();
		paradas.add(new ConstParada("Corrar de la comedia", "/res/resParadas/CorralComedia.jpg"));
		paradas.add(new ConstParada("Parque del Gasset", "/res/resParadas/Gasset.jpg"));
		paradas.add(new ConstParada("Lagunas de Ruidera", "/res/resParadas/LagunasRuidera.jpg"));
		paradas.add(new ConstParada("Solana", "/res/resParadas/Solana.jpg"));
		
		return paradas;
	}
}
