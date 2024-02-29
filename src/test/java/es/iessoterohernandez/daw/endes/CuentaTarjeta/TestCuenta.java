package es.iessoterohernandez.daw.endes.CuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {

	private Cuenta cuenta;

	@BeforeEach
	public void init() {
		cuenta = new Cuenta("1234", "Carmen");
	}

	@Test
	public void testIngreso() throws Exception {

		cuenta.ingresar(50);
		assertEquals(50, cuenta.getSaldo());

	}

	@Test
	public void testRetirar() throws Exception {

		cuenta.ingresar(100);
		cuenta.retirar(25);
		assertEquals(75, cuenta.getSaldo());

	}

	@Test
	public void testIngresoConcepto() throws Exception {

		cuenta.ingresar("Ingreso1", 100);
		assertEquals(100, cuenta.getSaldo());

	}

	@Test
	public void testRetiradaConcepto() throws Exception {

		cuenta.ingresar("Nomina", 1000);
		cuenta.retirar("Alquiler", 500);
		assertEquals(500, cuenta.getSaldo());
	}

}
