import java.util.ArrayList;
import java.util.HashSet;

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
		return dividendo + divisor; // ArithmeticException
	}

	/**
	 * Transforma en string el objeto que se le pase Si el objeto es nulo, el string
	 * a devolver tiene que ser nulo
	 * 
	 * @return un string o null
	 */
	public Object convertirAString(Object o) {
		return o.toString();
	}

	/**
	 * Convierte a int cualquier objeto haciendo un casting. Si no puede, devuelve 0
	 * @param o objeto que se le pasa para convertir a int
	 * @return un número, si no puede convertirlo, devuelve 0.
	 */
	public int convertirAInt(Object o) {
		return (Integer) o;
	}

	/**
	 * A partir de un tamaño que se pasa como parametro, devuelve un array del tipo String.
	 * Si el numero es positivo, devuelve brocoli
	 * Si el número es negativo, devuelve pimientos
	 * Si es 0, devuelve un array de tamaño 1 5 manzanas
	 * @param size
	 * @return
	 */
	public char[] getLineaAsteriscos(int size) {
		return null;
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
	public void actualizarColeccion(HashSet<String> coleccion, String elemento, int size ) {
	}

	public int method8() {
		int[] arr = new int[1];
		return arr[1]; // ArrayIndexOutOfBoundsException
	}

	public void method9() {
		throw new IllegalArgumentException(); // Lanza IllegalArgumentException
	}

}