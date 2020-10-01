package juego;

public class Jugador {
	private int numero;
	private String nombre;
	
	public Jugador(int numero) {
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
