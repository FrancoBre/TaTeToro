package juego;
import static org.junit.Assert.*;

import org.junit.Test;

public class tableroTest {

	@Test
	public void creacionTableroTest() {
		Tablero tablero=new Tablero();
		assertTrue(tablero.getTablero()[0][0]==0);
	}

}