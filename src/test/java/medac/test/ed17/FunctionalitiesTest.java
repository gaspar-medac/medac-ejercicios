package medac.test.ed17;

import medac.ed17.Functionalities;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionalitiesTest {
    Functionalities func = new Functionalities();

    @Test
    void testGetSuma() {
        assertEquals(6, func.getSuma(3, 3));
    }

    @Test
    void testGetDivision() {
        assertEquals(1, func.getDivision(3, 3));
    }

    @Test
    void testGetTrue() {
        assertTrue(func.getTrue());
    }

    @Test
    void testGetDivisionSinExcepcion() {
        assertAll("divisiones",
                () -> assertEquals(4, func.getDivision(20, 5)),
                () -> assertEquals(5, func.getDivision(25, 5)),
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
        assertEquals(5, func.convertirAInt(5L));
        assertEquals(6, func.convertirAInt(6L));
        assertEquals(6, func.convertirAInt(6.2));
        assertEquals(0, func.convertirAInt("🌶️🌶️"));
    }

    @Test
    void testGetLineaAsteriscos() {
        assertAll("verduras",
                () -> assertArrayEquals(new char[]{'B', 'B', 'B'}, func.getLineaAsteriscos(3)),
                () -> assertArrayEquals(new char[]{'P', 'P', 'P', 'P', 'P'}, func.getLineaAsteriscos(-5)),
                () -> assertArrayEquals(new char[]{'M', 'M', 'M', 'M', 'M'}, func.getLineaAsteriscos(0)));
    }

    @Test
    void testActualizarColeccionCon1() {
        HashSet<String> setTest = new HashSet<>();
        String elemento = "a";
        func.actualizarColeccion(setTest, elemento, 1);
        assertEquals(1, setTest.size());
    }

    @Test
    void testActualizarColeccionCon3() {
        HashSet<String> setTest = new HashSet<>();
        String elemento = "a";
        func.actualizarColeccion(setTest, elemento, 3);
        assertEquals(3, setTest.size());
    }

    @Test
    void testCheckAlumnoTodoAprobadoFaltas31() {
        // Assuming a course of 200 hours, where 31 non-justified absences would exceed 15%.
        assertFalse(func.checkAlumno(7, 8, 200, 0, 31), "Student should fail due to excessive non-justified absences.");
    }

    @Test
    void testCheckAlumnoTodoAprobadoFaltasJustificadas16() {
        // Assuming a course of 100 hours, where 16 justified absences are exactly 16%.
        assertTrue(func.checkAlumno(6, 7, 100, 16, 0), "Student should pass with exactly 16% total justified absences.");
    }

    @Test
    void testCheckAlumnoTodoAprobadoFaltasJustificadas15() {
        // Assuming a course of 100 hours, where 15 justified absences are 15%.
        assertTrue(func.checkAlumno(6, 7, 100, 15, 0), "Student should pass with 15% total justified absences.");
    }

    @Test
    void testCheckAlumnoTeorico4Practicas8Faltas5() {
        // Assuming a course of 100 hours, where 5 non-justified absences are 5%.
        // The theoretical score is weighted at 4*0.4 = 1.6 and practical score is weighted at 8*0.6 = 4.8.
        // Total score = 1.6 + 4.8 = 6.4
        assertTrue(func.checkAlumno(4, 8, 100, 0, 5), "Student should pass with adequate scores and acceptable absence rate.");
    }
}
