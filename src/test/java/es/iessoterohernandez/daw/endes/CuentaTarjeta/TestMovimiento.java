package es.iessoterohernandez.daw.endes.CuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMovimiento {

	private Movimiento mov;

	@BeforeEach
	public void init() {

		mov = new Movimiento();

	}

	@Test
	public void testImporte() {

		mov.setImporte(100);
		assertEquals(100, mov.getImporte());

	}

	@Test
	public void testConcepto() {
		
		mov.setConcepto("Paga");
		assertEquals("Paga", mov.getConcepto());
		
	}
	
	@Test
	public void testFecha() {

		
		
	}
	
}
