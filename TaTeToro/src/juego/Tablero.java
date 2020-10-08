package juego;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
		int j=2;
		
		int[][] tablero= {{0,0,1},{0,1,0},{1,0,0}};
		
		for(int i=0; i<3; i++) if(j>0) {
			if(tablero[i][j]!=1) System.out.println("falló");
			j--;
		}
		
		System.out.println("exito");
	}
	
}
