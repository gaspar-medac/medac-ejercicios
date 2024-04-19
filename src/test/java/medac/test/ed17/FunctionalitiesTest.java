package medac.test.ed17;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import medac.ed17.Functionalities;

public class FunctionalitiesTest {
	Functionalities func = new Functionalities();

	@Test
	void testGetSuma() {
		assertEquals(6, func.getDivision(3, 3));
	}

	@Test
	void testGetTrue() {
		assertTrue(func.getTrue());
	}

	@Test
	void testGetDivisionSinExcepcion() {
		assertAll("divisiones",
				() -> assertEquals(4, func.getDivision(20, 5)),
				() -> assertEquals(4, func.getDivision(25, 5)), 
				() -> assertEquals(6, func.getDivision(30, 5)));
	}

	@Test
	void testGetDivisionConExcepcion() {
		assertThrows(ArithmeticException.class, () -> func.getDivision(40, 0));
	}

	@Test
	void testConvertirAStringConObject() {
		assertEquals("java.lang.String", func.convertirAString(new Object()).getClass().getName());
	}

	@Test
	void testConvertirAStringConNull() {
		assertEquals("java.lang.String", func.convertirAString(new Object()).getClass().getName());
	}

	@Test
	void testConvertirAInt() {
		assertEquals(5, func.convertirAInt(5l));
		assertEquals(6, func.convertirAInt(6l));
		assertEquals(6, func.convertirAInt(6.2));
		assertEquals(0, func.convertirAInt("🌶️🌶️"));
	}

	@Test
	void testGetLineaAsteriscos() {
		assertAll("verduras", () -> assertEquals(new String[] { "🥦", "🥦", "🥦" }, func.getLineaAsteriscos(3)),
				() -> assertEquals(new String[] { "🌶", "🌶", "🌶", "🌶", "🌶" }, func.getLineaAsteriscos(5)),
				() -> assertEquals(new String[] { "🍊", "🍊", "🍊", "🍊", "🍊" }, func.getLineaAsteriscos(0)));
	}

	@Test
	void testActualizarColeccionCon1() {
		HashSet<String> setTest = new HashSet<String>();
		String elemento = "a";
		func.actualizarColeccion(setTest, elemento, 1);
		assertEquals(1, setTest.size());
	}

	@Test
	void testActualizarColeccionCon3() {
		HashSet<String> setTest = new HashSet<String>();
		String elemento = "a";
		func.actualizarColeccion(setTest, elemento, 3);
		assertEquals(3, setTest.size());
	}
	
	@Test
	void testCheckAlumnoTodoAprobadoFaltas31() {
		fail("Method not implemented");
	}
	
	@Test
	void testCheckAlumnoTodoAprobadoFaltasJustificadas16() {
		fail("Method not implemented");
	}
	
	@Test
	void testCheckAlumnoTodoAprobadoFaltasJustificadas15() {
		fail("Method not implemented");
	}
	
	@Test
	void testCheckAlumnoTeorico4Practicas8Faltas5() {
		fail("Method not implemented");
	}

}
