package persistencia;

import java.util.ArrayList;

import dominio.ConstParada;

public class InfoParadas {
	public ArrayList<ConstParada> getParadas() {
		ArrayList<ConstParada> paradas = new ArrayList<ConstParada>();
		paradas.add(new ConstParada("Corrar de comedias", "/res/resParadas/CorralComedia.jpg"));
		paradas.add(new ConstParada("Parque del Gasset", "/res/resParadas/Gasset.jpg"));
		paradas.add(new ConstParada("Lagunas de Ruidera", "/res/resParadas/LagunasRuidera.jpg"));
		paradas.add(new ConstParada("Solana", "/res/resParadas/Solana.jpg"));
		paradas.add(new ConstParada("Catedral de Santa María del Prado", "/res/resParadas/CatedralSantaMaria.jpg"));
		paradas.add(new ConstParada("Iglesia Parroquial de San Pedo", "/res/resParadas/IglesiaSanPedro.jpg"));
		paradas.add(new ConstParada("Plaza Mayor Ciudad Real", "/res/resParadas/PlazaMayorCR.jpg"));
		paradas.add(new ConstParada("Puerta de Toledo", "/res/resParadas/PuertaToledo.jfif"));
		paradas.add(new ConstParada("Museo Cervantino", "/res/resParadas/MueoCervantino.jpg"));
		paradas.add(new ConstParada("Parque Nacional de las Tablas de Daimiel", "/res/resParadas/TablasDaimiel.jpg"));
		paradas.add(new ConstParada("Parque Arqueológico de Alarcos", "/res/resParadas/ParqueAlarcos.jpg"));

		return paradas;
	}
}
