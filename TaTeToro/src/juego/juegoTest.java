package juego;

import static org.junit.Assert.*;

import org.junit.Test;

public class juegoTest {

	@Test(expected=IllegalArgumentException.class)
	public void jugadaIlegalTest() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 1, 1);
		tablero.setJugada(jugador1, 1, 1);
	}
	
	@Test
	public void creacionTableroTest() {
		Tablero tablero=new Tablero();
		assertTrue(tablero.getTablero()[0][0]==0);
	}
	
	@Test
	public void ingresarJugadaTest() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 0, 1);
		tablero.setJugada(jugador1, 0, 2);
		assertTrue(tablero.getTablero()[0][0]==1);
		assertTrue(tablero.getTablero()[0][1]==1);
		assertTrue(tablero.getTablero()[0][2]==1);
	}
	
	@Test
	public void jugadaNoGanadoraTest1() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 1, 1);
		tablero.setJugada(jugador1, 1, 2);
		assertFalse(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaNoGanadoraTest2() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 2);
		jugador1.cambiarTurno(jugador1);
		tablero.setJugada(jugador1, 2, 0);
		jugador1.cambiarTurno(jugador1);
		tablero.setJugada(jugador1, 1, 1);
		assertFalse(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaNoGanadoraTest3() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 0);
		jugador1.cambiarTurno(jugador1);
		tablero.setJugada(jugador1, 2, 2);
		jugador1.cambiarTurno(jugador1);
		tablero.setJugada(jugador1, 1, 1);
		assertFalse(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaGanadoraHorizontalTest1() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 0, 1);
		tablero.setJugada(jugador1, 0, 2);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaGanadoraHorizontalTest2() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(2);
		tablero.setJugada(jugador1, 2, 2);
		tablero.setJugada(jugador1, 2, 0);
		tablero.setJugada(jugador1, 2, 1);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaGanadoraToro1() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 1);
		tablero.setJugada(jugador1, 1, 0);
		tablero.setJugada(jugador1, 2, 2);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}

	@Test
	public void jugadaGanadoraVertical1() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(2);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 1, 0);
		tablero.setJugada(jugador1, 2, 0);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaGanadoraVertical2() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(2);
		tablero.setJugada(jugador1, 1, 2);
		tablero.setJugada(jugador1, 0, 2);
		tablero.setJugada(jugador1, 2, 2);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaGanadoraDiagonal1() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(2);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 1, 1);
		tablero.setJugada(jugador1, 2, 2);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
	@Test
	public void jugadaGanadoraDiagonal2() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 2);
		tablero.setJugada(jugador1, 1, 1);
		tablero.setJugada(jugador1, 2, 0);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
}
