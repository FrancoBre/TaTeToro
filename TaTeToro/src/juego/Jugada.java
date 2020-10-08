package juego;

import java.util.ArrayList;

public class Jugada {

	public static boolean esGanadora(Tablero tablero, Jugador jugador) {
		if(esGanadoraHorizontal(tablero, jugador) ||
				esGanadoraVertical(tablero, jugador) ||
				esGanadoraDiagonal(tablero, jugador))
			return true;
		return false;
	}
	
	private static boolean esGanadoraHorizontal(Tablero tablero, Jugador jugador) {
		boolean ret2=false;
		for(int i=0; i<tablero.tamanio(); i++) {
			boolean ret1=true;
			
			for(int j=0; j<tablero.tamanio(); j++) {
				ret1=ret1 && tablero.getTablero()[i][j]==jugador.getNumero();	
			}
			
			ret2=ret1 || ret2;
		}
		return ret2;
	}
	
	private static boolean esGanadoraVertical(Tablero tablero, Jugador jugador) {
		boolean ret2=false;
		for(int i=0; i<tablero.tamanio(); i++) {
			boolean ret1=true;
			
			for(int j=0; j<tablero.tamanio(); j++) {
				ret1=ret1 && tablero.getTablero()[j][i]==jugador.getNumero();	
			}
			
			ret2=ret1 || ret2;
		}
		return ret2;
	}
	
	//Las jugadas ganadoras diagonales fueron divididas en dos funciones
	private static boolean esGanadoraDiagonal(Tablero tablero, Jugador jugador) {
		boolean ret=true;
		for(int i=0; i<tablero.tamanio(); i++) {
			ret=ret && tablero.getTablero()[i][i]==jugador.getNumero();	
		}
		
		return (ret || esGanadoraDiagonal2(tablero, jugador)); 
	}
	
	private static boolean esGanadoraDiagonal2(Tablero tablero, Jugador jugador) {
		boolean ret=true;
		int j=tablero.getTablero().length-1;
		
		for(int i=0; i<tablero.getTablero().length; i++) {
			ret=ret && tablero.getTablero()[i][j]==jugador.getNumero();
			j--;
		}
		
		return ret;
	}

}
