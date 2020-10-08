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
		for(int i=0; i<tablero.tamanio(); i++) {
			ArrayList<Integer> fila=new ArrayList<Integer>();
			
			for(int j=0; j<tablero.tamanio(); j++) {
				fila.add(tablero.getTablero()[i][j]);	
			}
			
			if(iguales(fila, jugadasGanadoras(tablero, jugador))) {
				System.out.println(fila.toString());
				System.out.println(jugadasGanadoras(tablero, jugador).toString());
				System.out.println("Es ganadora horizontal");
				return true;
			}
		}
		return false;
	}
	
	private static boolean esGanadoraVertical(Tablero tablero, Jugador jugador) {
		for(int i=0; i<tablero.tamanio(); i++) {
			ArrayList<Integer> columna=new ArrayList<Integer>();
			
			for(int j=0; j<tablero.tamanio(); j++) {
				columna.add(tablero.getTablero()[j][i]);	
			}
			
			if(iguales(columna, jugadasGanadoras(tablero, jugador))) {
				System.out.println("Es ganadora vertical");
				return true;
			}
		}
		return false;
	}
	
	//Las jugadas ganadoras diagonales fueron divididas en dos funciones
	private static boolean esGanadoraDiagonal(Tablero tablero, Jugador jugador) {
		ArrayList<Integer> diagonal=new ArrayList<Integer>();
		
		for(int i=0; i<tablero.tamanio(); i++) {
			diagonal.add(tablero.getTablero()[i][i]);	
		}
		
		if(iguales(diagonal, jugadasGanadoras(tablero, jugador)) && esGanadoraDiagonal2(tablero, jugador)) {
			System.out.println("Es ganadora diagonal");
			return true;
		}
		return false;
	}
	
	private static boolean esGanadoraDiagonal2(Tablero tablero, Jugador jugador) {
		ArrayList<Integer> diagonal=new ArrayList<Integer>();
		int j=tablero.tamanio();
		
		for(int i=0; i<tablero.tamanio(); i++) {
			diagonal.add(tablero.getTablero()[i][j]);
			j--;
		}
		
		if(iguales(diagonal, jugadasGanadoras(tablero, jugador))) return true;
		return false;
	}
	
	private static boolean iguales(ArrayList<Integer> jugadas, int[] jugadas2) {
		for(int i=0; i<jugadas.size(); i++) if(!jugadas.get(i).equals(jugadas2[i])) return false;
		return true;
	}
	
	private static int[] jugadasGanadoras(Tablero tablero, Jugador jugador) {
		int[] jugadas=new int[3];
		for(int i=0; i<tablero.getTablero().length; i++) jugadas[i]=jugador.getNumero();
		return jugadas;
	}

}
