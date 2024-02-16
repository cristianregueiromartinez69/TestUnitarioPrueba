/**
 * Importamos nuestra libreria personal y los paquetes necesarios
 */

import com.dam2024.librerias.Entrada;
import com.dam2024.librerias.Salida;

import javax.swing.*;
import java.util.*;

/**
 * Clase calculadora para realizar operaciones
 * @author cristian
 * @version 1.0
 */
public class Calculadora {

    /**
     * Atributos estáticos y constantes de suma, resta, division y multiplicacion
     */
    private final static Integer SUMA=1;
    private final static Integer RESTA=2;
    private final static Integer MULTIPLICACION=3;
    private final static Integer DIVISION=4;


    /**
     * metodo que realiza las operaciones
     * @param mensage mensage para decir que operacion realizar
     * @param opcion la operacion a realizar
     * @return el resultado de la operacion realizada
     */
    public static float operacion(String mensage, int opcion){

        /**
         * en esta variable local almacenaremos el resultado de la operacion que luego retornaremos
         */
        float resultado=0;
        /**
         * segun la opcion escogida, hará una u otra operacion
         */
        switch(opcion){

            case 1:

                float num1 = Entrada.entrada_ventana_consola("Introduce el primer número:", Entrada.getCONSOLA());
                float num2 = Entrada.entrada_ventana_consola("Introduce el segundo número:", Entrada.getCONSOLA());
                float suma = num1+num2; // Puedes cambiar a cualquier otra operación
                resultado=suma;
                Salida.salida_ventana_consola("Resultado", Salida.getCONSOLA());

                break;
            case 2:
                num1 = Entrada.entrada_ventana_consola("Introduce el primer número:", Entrada.getCONSOLA());
                num2 = Entrada.entrada_ventana_consola("Introduce el segundo número:", Entrada.getCONSOLA());

                float resta = num1-num2; // Puedes cambiar a cualquier otra operación
                resultado=resta;
                Salida.salida_ventana_consola("Resultado", Salida.getCONSOLA());

                break;
            case 3:
                num1 = Entrada.entrada_ventana_consola("Introduce el primer número:", Entrada.getCONSOLA());
                num2 = Entrada.entrada_ventana_consola("Introduce el segundo número:", Entrada.getCONSOLA());

                float multiplicar = num1*num2; // Puedes cambiar a cualquier otra operación
                resultado=multiplicar;
                Salida.salida_ventana_consola("Resultado", Salida.getCONSOLA());

                break;
            case 4:
                num1 = Entrada.entrada_ventana_consola("Introduce el primer número:", Entrada.getCONSOLA());
                num2 = Entrada.entrada_ventana_consola("Introduce el segundo número:", Entrada.getCONSOLA());

                float division= num1/num2; // Puedes cambiar a cualquier otra operación
                resultado=division;
                Salida.salida_ventana_consola("Resultado", Salida.getCONSOLA());

                break;
            default:
                resultado= Float.parseFloat(null);
                break;










        }





        return resultado;
    }


    /**
     * metodos getter de las constantes de clase de las operaciones
     * @return la operacion a realizar que pondremos en el parametro del metodo operaciones
     */
    public static int getSUMA() {
        return SUMA;
    }

    public static int getRESTA() {
        return RESTA;
    }

    public static int getDIVISION() {
        return DIVISION;
    }

    public static int getMULTIPLICACION() {
        return MULTIPLICACION;
    }
}

