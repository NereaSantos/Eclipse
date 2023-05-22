package GestorLiga;

import java.util.SortedSet;

public interface IEquipo {
	
	public String getNombre();
	public int getPuntos();
	public int getPartidosJugados();
	public int getGolesFavor();
	public int getGolesContra();
	public SortedSet getPartidosFuera();
	public SortedSet getPartidosCasa();
	public String toString();
	public int compareTo(Object o);
	public void añadePartidoCasa(String adversario, int gFavor, int gContra, int jornada);
	public void añadePartidoFuera(String adversario, int gFavor, int gContra, int jornada);
	public void recalculaValores();
	
}
