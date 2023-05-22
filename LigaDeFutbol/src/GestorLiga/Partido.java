package GestorLiga;

public class Partido implements IPartido {

	private String nombreEquipoL;
	private String nombreEquipoV;
	private int golesEquipoL;
	private int golesEquipoV;
	private int jornada;
	
	Partido(String nombreEquipoL, String nombreEquipoV, int golesEquipoL, int golesEquipoV, int jornada){
		
		this.nombreEquipoL = nombreEquipoL;
		this.nombreEquipoV = nombreEquipoV;
		this.golesEquipoL = golesEquipoL;
		this.golesEquipoV = golesEquipoV;
		this.jornada = jornada;
		
	}
	
	public String getNombreEquipoL() {
		return nombreEquipoL;
	}
	public void setNombreEquipoL(String nombreEquipoL) {
		this.nombreEquipoL = nombreEquipoL;
	}
	public String getNombreEquipoV() {
		return nombreEquipoV;
	}
	public void setNombreEquipoV(String nombreEquipoV) {
		this.nombreEquipoV = nombreEquipoV;
	}
	public int getGolesEquipoL() {
		return golesEquipoL;
	}
	public void setGolesEquipoL(int golesEquipoL) {
		this.golesEquipoL = golesEquipoL;
	}
	public int getGolesEquipoV() {
		return golesEquipoV;
	}
	public void setGolesEquipoV(int golesEquipoV) {
		this.golesEquipoV = golesEquipoV;
	}
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	@Override
	public String getLocal() {
		
		return nombreEquipoL;
	}
	@Override
	public String getVisitante() {
		
		return nombreEquipoV;
	}
	@Override
	public int getGolesLocal() {
		
		return golesEquipoL;
	}
	@Override
	public int getGolesVisitante() {
		
		return golesEquipoV;
	}
	@Override
	public int getJornada() {
		
		return jornada;
	}
	
}
