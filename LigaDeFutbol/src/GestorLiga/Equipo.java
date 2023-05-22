package GestorLiga;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;

public class Equipo implements IEquipo {

	private String nombre;
	private int puntos;
	private int partidosJugados;
	private int golesFavor;
	private int golesContra;
	private ArrayList<IPartido> partidosFuera = new ArrayList<>();
	private ArrayList<IPartido> partidosCasa = new ArrayList<>();
	
	Equipo(String nombre, int puntos, int partidosJugados, int golesFavor, int golesContra, ArrayList partidosFuera, ArrayList partidosCasa){
		
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el nombre del equipo local");
		
			String nombreEL = sc.next();
			
		System.out.println("Escriba el nombre del equipo vosotante");
		
			String nombreEV = sc.next();
		
		System.out.println("Escriba el numero de goles marcado por el equipo local");
			
			int golesEL = sc.nextInt();
			
		System.out.println("Escriba el numero de goles marcado el equipo vosotante");
		
			int golesEV = sc.nextInt();
			
		System.out.println("Escriba la jornada en la que se realizó el partido");
			
			int jornadaP = sc.nextInt();
			
			
		Partido p = new Partido(nombreEL, nombreEV, golesEL, golesEV, jornadaP);
		
		for(IPartido partidos : partidosCasa) {
			
			if(partidos == null) {
				
				partidosCasa.add(p);
			}
			
		}
		
	}

	@Override
	public void añadePartidoFuera(String adversario, int gFavor, int gContra,
			int jornada) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el nombre del equipo local");
		
			String nombreEL = sc.next();
			
		System.out.println("Escriba el nombre del equipo vosotante");
		
			String nombreEV = sc.next();
		
		System.out.println("Escriba el numero de goles marcado por el equipo local");
			
			int golesEL = sc.nextInt();
			
		System.out.println("Escriba el numero de goles marcado el equipo vosotante");
		
			int golesEV = sc.nextInt();
			
		System.out.println("Escriba la jornada en la que se realizó el partido");
			
			int jornadaP = sc.nextInt();
			
			
		Partido p = new Partido(nombreEL, nombreEV, golesEL, golesEV, jornadaP);
		
		for(IPartido partidos : partidosFuera) {
			
			if(partidos == null) {
				
				partidosFuera.add(p);
			}
			
		}
		
	}

	@Override
	public void recalculaValores() {
		
		
	}	
	
}
