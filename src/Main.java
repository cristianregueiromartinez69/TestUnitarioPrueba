/**
 * Clase main donde ejecutamos nuestro programa
 * @author cristian
 * @version 1.0
 */

public class Main {

    public static void main(String[]args){

        /**
         * try catch para capturar la excepcion en caso de que la opcion no sea la correcta
         */
        try {
            float resultado = Calculadora.operacion("¿Que operacion quieres hacer?", Calculadora.getDIVISION());
            System.out.println(resultado);
        }catch(NullPointerException e){
            System.out.println("Vaya, algo fallo");
        }


    }


}
