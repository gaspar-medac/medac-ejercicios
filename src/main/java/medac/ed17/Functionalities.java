package medac.ed17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Functionalities {	
	/**
	 * Funcion que siempre devuelve true
	 * 
	 * @return
	 */
	public boolean getTrue() {
		return true;
	}

	/**
	 * Este método devuelve el resultado de una suma
	 * @param num1 numero 1 a sumar
	 * @param num2 numero 2 a sumar
	 * @return el resultado de la suma
	 */
	public double getSuma(double num1, double num2) {
		return num1 + num2;
	}

	/**
	 * Funcion division.
	 * 
	 * @param divisor   el divisor
	 * @param dividendo el dividendo
	 * @return devuelve el resultado de dividir el dividendo entre el divisor.
	 * @throws ArithmeticException Devuelve una excepción en el caso de que se
	 *                             divida entre 0.
	 */
public double getDivision(double divisor, double dividendo) throws ArithmeticException {
    if (dividendo == 0) { 
        throw new ArithmeticException("División entre cero no permitida");
    }
    return divisor / dividendo; 
}

	/**
	 * Transforma en string el objeto que se le pase Si el objeto es nulo, el string
	 * a devolver tiene que ser nulo
	 * 
	 * @return un string o null
	 */
public String convertirAString(Object o) {
    if (o == null) {
        return null;
    }
    return o.toString();
}

	/**
	 * Convierte a int cualquier objeto haciendo un casting. Si no puede, devuelve 0
	 * @param o objeto que se le pasa para convertir a int
	 * @return un número, si no puede convertirlo, devuelve 0.
	 */
	public int convertirAInt(Object o) {
    if (o instanceof Integer) {
        return (Integer) o;
    } else if (o instanceof Long) {
        return ((Long) o).intValue();
    } else {
        return 0; // Devuelve 0 para otros tipos o null
    }
}


	/**
	 * A partir de un tamaño que se pasa como parametro, devuelve un array del tipo String.
	 * Si el numero es positivo, devuelve brocoli
	 * Si el número es negativo, devuelve pimientos
	 * Si es 0, devuelve un array de tamaño 1 5 manzanas
	 * @param size
	 * @return
	 */
	public String[] getLineaAsteriscos(int size) {
    String[] result = new String[Math.abs(size)];

    if (size > 0) {
        // If the number is positive, return an array filled with "🥦"
        Arrays.fill(result, "🥦");
    } else if (size < 0) {
        // If the number is negative, return an array filled with "🌶️"
        Arrays.fill(result, "🌶️");
    } else {
        // If the number is 0, return an array with a single element "🍊"
        result = new String[]{"🍊"};
    }

    return result;
}


	/**
	 * Actualiza la coleccion. 
	 * Para actualizarla, añadirá el elemento que se pasa por parámetro tantas veces como se le indique, 
	 * que también viene por parámetro
	 * @param coleccion Coleccion a actualizar
	 * @param elemento elemento a añadir
	 * @param size veces en las que se tiene que añadir el elemento
	 * @return
	 */
        public void actualizarColeccion(HashSet<String> coleccion, String elemento, int size) {
    for (int i = 0; i < size; i++) {
        coleccion.add(elemento + i); // Añadir elementos diferentes
    }

}

	public int method8() {
		int[] arr = new int[1];
		return arr[1]; // ArrayIndexOutOfBoundsException
	}

	public void method9() {
		throw new IllegalArgumentException(); // Lanza IllegalArgumentException
	}
        
     
    public boolean checkAlumno(int faltasTotales, int faltasJustificadas, int faltasTeoricas, int faltasPracticas) {
        if (faltasTotales > 30) {
            return false;
        }

        if (faltasTeoricas > 4 || faltasPracticas > 8) {
            return false;
        }

        if (faltasJustificadas > 15) {
            return false;
        }

        return true;
    }
public boolean checkAlumnoTodoAprobadoFaltasJustificadas16(int faltasTotales, int faltasJustificadas) {
        if (faltasTotales > 30) {
            return false;
        }

        if (faltasJustificadas != 16) {
            return false;
        }

        return true;
    }
    
public boolean checkAlumnoTodoAprobadoFaltasJustificadas15(int faltasJustificadas) {
        if (faltasJustificadas != 15) {
            return false;
        }

        return true;
    }

public boolean checkAlumnoTeorico4Practicas8Faltas5( int faltasJustificadas, int faltasTeoricas, int faltasPracticas) {
        // Si las faltas teóricas no son exactamente 4, el alumno no ha aprobado
        if (faltasTeoricas != 4) {
            return false;
        }

        // Si las faltas prácticas no son exactamente 8, el alumno no ha aprobado
        if (faltasPracticas != 8) {
            return false;
        }

        // Si las faltas justificadas no son exactamente 5, el alumno no ha aprobado
        if (faltasJustificadas != 5) {
            return false;
        }

        // Si no se cumple ninguna de las condiciones anteriores, el alumno ha aprobado
        return true;
    }
}