package juego;

public class Jugador {
	private int numero;
	private String nombre1;
	private String nombre2;
	
	public Jugador(int numero) {
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNombre1(String nombre) {
		this.nombre1 = nombre;
	}
	
	public void setNombre2(String nombre) {
		this.nombre2 = nombre;
	}
	
	public void setNombre(String nombre, int numero) {
		if(numero==1) this.nombre1=nombre;
		if(numero==2) this.nombre2=nombre;
	}
	
	public String getNombre1() {
		return this.nombre1;
	}
	
	public String getNombre2() {
		return this.nombre2;
	}
	
	public String getNombre(int numero) {
		if(numero==1) return this.nombre1;
		if(numero==2) return this.nombre2;
		else return null;
	}
	
	public int cambiarTurno(Jugador jugador) {
		int resp=0; 
		if(jugador.getNumero()==1) {
			jugador.setNumero(2);
			resp=2;
		}
		else {
			jugador.setNumero(1);
			resp=1;
		}
		
	return resp; 
	}
	
	public void limpiarJugadores() {
		this.nombre1 = "";
		this.nombre2 = "";
		this.numero = 0;
	}

}
