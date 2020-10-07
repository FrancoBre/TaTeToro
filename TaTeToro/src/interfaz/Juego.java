package interfaz;

import juego.Jugador;
import juego.Tablero;

public class Juego {
	Tablero tablero=new Tablero();
	Jugador jugador=new Jugador(1);
	
	
	public void cambiarTurno(Jugador jugador) {
		if(jugador.getNumero()==1) jugador.setNumero(2);
		else jugador.setNumero(1);
	}
}
