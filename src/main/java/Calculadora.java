/**
 * Clase que opera con dos enteros
 * @author Sergio Gallardo
 * @since 25/02/2025
 * @version 1.0
 */
public class Calculadora {

    /**
     * Metodo que suma dos enteros pasados como parametro
     * @param a uno de los enteros a sumar
     * @param b otro de los enteros a sumar
     * @return entero de la suma de los argumentos
     */
    public int sumar(int a, int b) {
        return a+b;
    }
    /**
     * Metodo que resta dos enteros pasados como parametro
     * @param a uno de los enteros a restar
     * @param b otro de los enteros a restar
     * @return entero de la resta de los argumentos
     */

    public int restar(int a, int b) {
        return a-b;
    }
    /**
     * Metodo que multiplica dos enteros pasados como parametro
     * @param a uno de los enteros a multiplicar
     * @param b otro de los enteros a multiplicar
     * @return entero de la multiplicacion de los argumentos
     */
    public int multiplicar(int a, int b) {
        return a*b;
    }
    /**
     * Metodo que divide dos enteros pasados como parametro
     * @param a uno de los enteros a divide
     * @param b otro de los enteros a divide
     * @return entero de la division de los argumentos
     */

    public float dividir(int a, int b) {
        if (b == 0)
            throw new ArithmeticException();

        return a/b;
    }
    /**
     * Metodo que scalcula el resto de la division dos enteros
     * @param a uno de los enteros a dividir
     * @param b otro de los enteros a dividir
     * @return entero de la suma de los argumentos
     */
    public int resto(int a, int b) {
        return a%b;
    }
}
