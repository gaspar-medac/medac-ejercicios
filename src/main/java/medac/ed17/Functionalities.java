package medac.ed17;

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
     *
     * @param num1 numero 1 a sumar
     * @param num2 numero 2 a sumar
     * @return el resultado de la suma
     */
    public double getSuma(double num1, double num2) {
        return num1 + num2;
    }

   /** 
  * Método que devuelve la división entera de dividendo entre divisor.
 *
 * Si divisor es igual a cero, se lanza una excepción ArithmeticException con
 * el mensaje "Cannot divide by zero".
 *
 * @param dividend   el dividendo
 * @param divisor   el divisor
 * @return           el cociente entero de dividendo entre divisor
 * @throws ArithmeticException si divisor es igual a cero
 */
    
    public int getDivision(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    /**
     * Transforma en string el objeto que se le pase Si el objeto es nulo, el
     * string a devolver tiene que ser nulo
     *
     * @return un string o null
     */
    public Object convertirAString(Object o) {
        return o.toString();
    }

  /**
 * Método que convierte un objeto en un entero.
 *
 * Si el objeto es un Long, se devuelve su valor entero equivalente.
 * Si el objeto es un Double, se devuelve su valor entero equivalente.
 * Si el objeto es una cadena de texto, se intenta parsear como un entero.
 * Si el parseo es exitoso, se devuelve el entero resultante.
 * Si el parseo falla, se devuelve 0.
 * Si el objeto no es ninguno de los tipos anteriores, se lanza una
 * IllegalArgumentException.
 *
 * @param o objeto a convertir
 * @return entero convertido
 * @throws IllegalArgumentException si el tipo de objeto no es soportado
 */
    
    public int convertirAInt(Object o) {
        if (o instanceof Long) {
            return ((Long) o).intValue();
        } else if (o instanceof Double) {
            return ((Double) o).intValue();
        } else if (o instanceof String) {
            try {
                return Integer.parseInt((String) o);
            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Input type not supported: " + o.getClass().getName());
        }
    }

/**
 * Método que devuelve un array de cadenas de texto con una longitud dada y
 * relleno con un carácter específico.
 *
 * Si size es negativo, se devuelve un array con size elementos, rellenos con
 * el carácter 'i' (pimiento).
 *
 * Si size es cero, se devuelve un array con un único elemento, que es una
 * cadena de cinco emojis de manzana.
 *
 * Si size es positivo, se devuelve un array con size elementos, rellenos con
 * el carácter 'o' (brocoli).
 *
 * @param size longitud del array
 * @return     array de cadenas de texto
 */
    
    public String[] getLineaAsteriscos(int size) {
        if (size < 0) {
            size = -size;
            String[] result = new String[size];
            for (int i = 0; i < size; i++) {
                result[i] = "i"; // pimiento
            }
            return result;
        } else if (size == 0) {
            return new String[]{"🍎🍎🍎🍎🍎"}; // manzana
        } else {
            String[] result = new String[size];
            for (int i = 0; i < size; i++) {
                result[i] = "o"; // brocoli
            }
            return result;
        }
    }

    
    /**
 * Método que actualiza una colección HashSet, añadiendo o eliminando
 * elementos según el parámetro size.
 *
 * Si size es positivo, se añadirán size elementos a la colección, empezando
 * en el valor de elemento y aumentando en 1 en cada iteración.
 *
 * Si size es negativo, se eliminarán Math.abs(size) elementos de la colección,
 * empezando en el valor de elemento y aumentando en 1 en cada iteración.
 *
 * @param coleccion colección a actualizar
 * @param elemento elemento a añadir o eliminar
 * @param size      número de veces que se añade o elimina el elemento
 * @throws IllegalArgumentException si la colección es nula
 */
    
    public void actualizarColeccion(HashSet<String> coleccion, String elemento, int size) {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                coleccion.add(elemento + i);
            }
        } else if (size < 0) {
            for (int i = 0; i < Math.abs(size); i++) {
                coleccion.remove(elemento + i);
            }
        }

    }

    public int method8() {
        int[] arr = new int[1];
        return arr[1]; // ArrayIndexOutOfBoundsException
    }

    public void method9() {
        throw new IllegalArgumentException(); // Lanza IllegalArgumentException
    }

    
    
    /**Método que devuelve true si el alumno ha aprobado el curso y false en caso
     * contrario. Se considera que el alumno ha aprobado si tiene un máximo de
     * 15 faltas justificadas, un máximo de 15 faltas injustificadas y un máximo
     * de 30 faltas totales (justificadas + injustificadas). Además, se requiere
     * una nota final mínima de 5.
   
     * @param notaPractica nota de la práctica
     * @param notaTeorica nota de la teoría
     * @param faltasJustificadas faltas justificadas
     * @param faltasInjustificadas faltas injustificadas
     * @return true si el alumno ha aprobado, false en caso contrario*/
             
    public boolean notasAlumno(int notaPractica, int notaTeorica, int faltasJustificadas, int faltasInjustificadas) {

        if (faltasInjustificadas > 15) {
            return false;
        }

        if (faltasJustificadas > 15) {
            return false;
        }

        if ((faltasJustificadas + faltasInjustificadas) > 30) {
            return false;
        }

        double notaFinal = 0.60 * notaPractica + 0.40 * notaTeorica;

        return notaFinal >= 5;
    }
}
