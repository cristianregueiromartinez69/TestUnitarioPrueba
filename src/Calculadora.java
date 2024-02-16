


import javax.swing.*;
import java.util.*;

/**
 * clase Calculadora con sus metodos para realizar operaciones
 * @author cristian
 * @version 1.0
 */
public class Calculadora {
    /**
     * constantes de clase de la clase calculadora
     */
    public static final int SUMA = 0;
    public static final int RESTA = 1;
    public static final int MULTIPLICACION = 2;
    public static final int DIVISION = 3;
    public static final int RAIZ_CUADRADA = 4;
    public static final int RAIZ_CUBICA = 5;
    static Scanner sc = new Scanner(System.in);

    /**
     * metodo para realizar operaciones
     * @param num1 primer numero poara realizar la operacion
     * @param num2 segundo numero para realizar la operacion
     * @param operacion la operacion a realizar, si no se elige bien, saldrá null
     * @return el resultado de la operacion
     */
    public static Float operar(Float num1, Float num2, int operacion){

        switch(operacion){
            case SUMA:
                return num1 + num2;
            case RESTA:
                return num1 - num2;
            case MULTIPLICACION:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
            case RAIZ_CUADRADA:
                Float opcion;
                /**
                 * operacion para preguntar al usuario, con que variable quiere hacer la operacion
                 */
                do{
                    System.out.println("Introduce el 1, si deseas hacer la raiz cuadrada con la variable " + num1);
                    System.out.println("Introduce el 2, si deseas hacer la raiz cuadrada con la variable " + num2);

                     opcion = (float) sc.nextInt();
                }while(opcion<1||opcion>2);
                if(opcion==1){
                    opcion=num1;
                }
                else{
                    opcion=num2;
                }
                return (float) Math.sqrt(opcion);
            case RAIZ_CUBICA:
                /**
                 * operacion para preguntar al usuario, con que variable quiere hacer la operacion
                 */
                do{
                    System.out.println("Introduce el 1, si deseas hacer la raiz cubica con la variable " + num1);
                    System.out.println("Introduce el 2, si deseas hacer la raiz cubica con la variable " + num2);
                    opcion = (float) sc.nextInt();
                }while(opcion<1||opcion>2);
                if(opcion==1){
                    opcion=num1;
                }
                else{
                    opcion=num2;
                }
                double raizCubica = Math.pow(opcion, (double) 1 / 3);
                return (float) raizCubica;


            default:
                return null;
        }
    }
}

