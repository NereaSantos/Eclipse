package GestorLiga;

import java.util.SortedSet;

public class Equipo implements IEquipo {

	private String nombre;
	private int puntos;
	private int partidosJugados;
	private int golesFavor;
	private int golesContra;
	private IPartido partidosFuera;
	private IPartido partidosCasa;
	
	Equipo(String nombre, int puntos, int partidosJugados, int golesFavor, int golesContra, IPartido partidosFuera, IPartido partidosCasa){
		
		this.nombre = nombre;
		this.puntos = puntos;
		this.partidosJugados = partidosJugados;
		this.golesFavor = golesFavor;
		this.golesContra = golesContra;
		this.partidosCasa = partidosCasa;
		this.partidosFuera = partidosFuera;
		
	}
	
	@Override
	public String getNombre() {
		
		return nombre;
	}

	@Override
	public int getPuntos() {
		
		return puntos;
	}

	@Override
	public int getPartidosJugados() {
		
		return partidosJugados;
	}

	@Override
	public int getGolesFavor() {
		
		return golesFavor;
	}

	@Override
	public int getGolesContra() {
		
		return golesContra;
	}

	@Override
	public SortedSet getPartidosFuera() {
		
		return (SortedSet) partidosFuera;
	}

	@Override
	public SortedSet getPartidosCasa() {
		
		return (SortedSet) partidosCasa;
	}

	@Override
	public int compareTo(Object o) {
		/*Entiendo que dos equipos son iguales si tienen el mismo nombre*/

		Equipo otro = (Equipo)(o);
		
		if(this.nombre.compareTo(otro.nombre) == 0) {
			
			return 0;
			
		}else if(this.nombre.compareTo(otro.nombre) == 1) {
			
			return 1;
			
		}else return -1;

	}

	@Override
	public void añadePartidoCasa(String adversario, int gFavor, int gContra,
			int jornada) {
		
		
		
	}

	@Override
	public void añadePartidoFuera(String adversario, int gFavor, int gContra,
			int jornada) {
		
		
	}

	@Override
	public void recalculaValores() {
		
		
	}

	
	
}
