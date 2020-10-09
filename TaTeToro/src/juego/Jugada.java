package juego;

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

	//Primera columna pasa a ser la ultima
	public static Tablero matrizToroidal1(Tablero tablero) {
		Tablero tableroToro=new Tablero();
		int[][] matriz=new int[3][3];
		
		for(int i=0; i<tableroToro.tamanio(); i++)  		//filas
			for(int j=1; j<tableroToro.tamanio(); j++) 		//columnas

				matriz[i][j]=tablero.getTablero()[i][j-1];
		
		for(int h=0; h<tableroToro.tamanio(); h++) matriz[h][2]=tablero.getTablero()[h][0];
		
		tableroToro.setTablero(matriz);
		return tableroToro;
	}
	
	//Ultima columna pasa a ser la primera
	public static Tablero matrizToroidal2(Tablero tablero) {
		Tablero tableroToro=new Tablero();
		int[][] matriz=new int[3][3];
		
		//La ultima columna pasa a ser la primera
		for(int h=0; h<tableroToro.tamanio(); h++) matriz[h][0]=tablero.getTablero()[h][tableroToro.tamanio()-1];
		
		//Las columnas 0 y 1 de tablero pasan a ser la 1 y 2 de matriz
		for(int i=0; i<tableroToro.tamanio(); i++)  		//filas
			for(int j=1; j<tableroToro.tamanio(); j++) 		//columnas
				matriz[i][j]=tablero.getTablero()[i][j-1];
		
		tableroToro.setTablero(matriz);
		return tableroToro;
	}
	
	//La primera fila pasa a ser la ultima
	public static Tablero matrizToroidal3(Tablero tablero) {
		Tablero tableroToro=new Tablero();
		int[][] matriz=new int[3][3];
		
		for(int h=0; h<tableroToro.tamanio(); h++) matriz[tableroToro.tamanio()-1][h]=tablero.getTablero()[0][h];
		
		//las filas 1 y 2 del tablero pasan a ser las filas 0 y 1 de la matriz
		for(int i=0; i<tableroToro.tamanio()-1; i++) {  		//filas
			for(int j=0; j<tableroToro.tamanio(); j++) { 		//columnas
				System.out.println("i: "+i+" j: "+j);
				matriz[i][j]=tablero.getTablero()[i+1][j];
			}
		}
		
		System.out.println();
		
		tableroToro.setTablero(matriz);
		return tableroToro;
	}
	
	//La ultima fila pasa a ser la primera
		public static Tablero matrizToroidal4(Tablero tablero) {
			Tablero tableroToro=new Tablero();
			int[][] matriz=new int[3][3];
			
			for(int h=0; h<tableroToro.tamanio(); h++) matriz[0][h]=tablero.getTablero()[tableroToro.tamanio()-1][h];
			
			//las filas 0 y 1 del tablero pasan a ser las filas 1 y 2 de la matriz
			for(int i=0; i<tableroToro.tamanio()-1; i++) {  		//filas
				for(int j=0; j<tableroToro.tamanio(); j++) { 		//columnas
					System.out.println("i: "+i+" j: "+j);
					matriz[i+1][j]=tablero.getTablero()[i][j];
				}
			}
			
			System.out.println();
			
			tableroToro.setTablero(matriz);
			return tableroToro;
		}
	
	public static void main(String[] args) {
		Tablero tablero=new Tablero();
		Jugador jugador=new Jugador(1);
		tablero.setJugada(jugador, 0, 0);
		tablero.setJugada(jugador, 2, 2);
		tablero.setJugada(jugador, 2, 0);
		
		for(int i=0; i<3; i++) {			
			for(int j=0; j<3; j++) {	
				System.out.print(tablero.getTablero()[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		Tablero matrizToro=Jugada.matrizToroidal4(tablero);
		
		for(int i=0; i<3; i++) {			
			for(int j=0; j<3; j++) {	
				System.out.print(matrizToro.getTablero()[i][j]);
			}
			System.out.println();
		}

		
	}
	
}








