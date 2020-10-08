package juego;

import static org.junit.Assert.assertTrue;

public class Tablero {
	private int[][] tablero;
	
	//La idea es tener una matriz de 3x3, y en cada turno poner 1 o 2 segun donde juegue el jugador
	//Y verificar si gana a partir de este tablero
	public Tablero() {
		tablero=new int[3][3];
		
		for(int i=0; i<3; i++) 
			
			for(int j=0; i<3; i++) tablero[i][j]=0;		
	}

	public int[][] getTablero() {
		return tablero;
	}
	
	public void setJugada(Jugador jugador, int posicionFila, int posicionColumna) {
		if(this.tablero[posicionFila][posicionColumna]!=0) 
			throw new IllegalArgumentException("La posición ["+posicionFila+"]["+posicionColumna+"] ya está ocupada");
		this.tablero[posicionFila][posicionColumna]=jugador.getNumero();
	}

	public int tamanio() {
		return this.tablero.length;
	}
	
	public static void main(String[] args) {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 1, 1);
		tablero.setJugada(jugador1, 1, 2);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(tablero.getTablero()[i][j]);
			}
			System.out.println();
		}
		System.out.println(Jugada.esGanadora(tablero, jugador1));
	}
	
}
