package medac.ed17;

import java.util.Dictionary;
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
     * Funcion division.
     *
     * @param divisor   el divisor
     * @param dividendo el dividendo
     * @return devuelve el resultado de dividir el dividendo entre el divisor.
     * @throws ArithmeticException Devuelve una excepción en el caso de que se
     *                             divida entre 0.
     */
    public double getDivision(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }

        return dividendo / divisor;
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
     *
     * @param o objeto que se le pasa para convertir a int
     * @return un número, si no puede convertirlo, devuelve 0.
     */
    public int convertirAInt(Object o) {
        try {
            if (o instanceof Long) {
                return Math.toIntExact((Long) o);
            } else if (o instanceof Double) {
                return (int) Math.round((Double) o);
            } else if (o instanceof String) {
                return Integer.parseInt((String) o);
            } else {
                throw new IllegalArgumentException("Unsupported type");
            }
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * A partir de un tamaño que se pasa como parametro, devuelve un array del tipo String.
     * Si el numero es positivo, devuelve brocoli
     * Si el número es negativo, devuelve pimientos
     * Si es 0, devuelve un array de tamaño 1 5 manzanas
     *
     * @param size
     * @return
     */
    public char[] getLineaAsteriscos(int size) {
        String c = size > 0 ? "B" : size < 0 ? "P" : "M";

        if (size == 0) return c.repeat(5).toCharArray();

        return c.repeat(Math.abs(size)).toCharArray();
    }

    /**
     * Actualiza la coleccion.
     * Para actualizarla, añadirá el elemento que se pasa por parámetro tantas veces como se le indique,
     * que también viene por parámetro
     *
     * @param coleccion Coleccion a actualizar
     * @param elemento  elemento a añadir
     * @param size      veces en las que se tiene que añadir el elemento
     * @return
     */
    public void actualizarColeccion(HashSet<String> coleccion, String elemento, int size) {
        for (int i = 0; i < size; i++) {
            coleccion.add(elemento + i);  // Hacemos la str unica sumandole el index
        }
    }

    public boolean checkAlumno(int notaTeorico, int notaPractica, int horasAsignaturaTotales, int faltasJustificadas, int faltasNoJustificadas) {
        /*
            1. Asistencia: No se pueden tener más de un 15% de faltas no justificadas.
            La combinación de faltas justificadas y no justificadas no debe superar el 30%.

            2. Evaluación: El 60% de la nota final proviene de evaluaciones prácticas,
            mientras que el 40% proviene de evaluaciones teóricas.

            3. Aprobado: Un alumno será aprobado si la suma de las notas práctica
            y teórica es mayor a 5 y el total de faltas no supera los límites establecidos.
         */

        if (faltasNoJustificadas > (horasAsignaturaTotales * 0.15)) return false;

        int faltasTotales = faltasJustificadas + faltasNoJustificadas;
        if (faltasTotales > (horasAsignaturaTotales * 0.30)) return false;

        double notaFinal = (notaTeorico * 0.4) + (notaPractica * 0.6);

        if (notaFinal < 5) return false;

        return true;
    }
}