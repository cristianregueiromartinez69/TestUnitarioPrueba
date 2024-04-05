import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.NameNotFoundException;

import static java.lang.Float.NaN;

public class CalculadoraTest {

    @Test
    public void SumaDeNumerosPositivos(){

        Assertions.assertEquals(10, Calculadora.operar(5f, 5f, Calculadora.SUMA));
    }

    @Test
    public void SumaDeNumerosNegativos(){

        Assertions.assertEquals(-5, Calculadora.operar(-2f, -3f, Calculadora.SUMA));
    }

    @Test
    public void RestaDeNumerosPositivos(){
        Assertions.assertEquals(3, Calculadora.operar(5f, 2f, Calculadora.RESTA));
    }

    @Test
    public void RestaDeNumerosNegativos(){
        Assertions.assertEquals(0f, Calculadora.operar(-1f, -1f, Calculadora.RESTA));
    }

    @Test
    public void MultiplicacionDeNumerosPositivos(){
        Assertions.assertEquals(100, Calculadora.operar(10f, 10f, Calculadora.MULTIPLICACION));
    }

    @Test
    public void MultiplicacionDeNumerosDecimilaes(){
        Assertions.assertEquals(2.25f, Calculadora.operar(1.5f, 1.5f, Calculadora.MULTIPLICACION));
    }

    @Test
    public void DivisionDeNumerosPositivos(){
        Assertions.assertEquals(2, Calculadora.operar(10f, 5f, Calculadora.DIVISION));
    }

    @Test
    public void DivisionDeNumerosDecimales(){
        Assertions.assertEquals(7.6666665f, Calculadora.operar(80.5f, 10.5f, Calculadora.DIVISION));
    }



    @Test
    public void RaizCuadradaDeNumeros(){
        Assertions.assertEquals(2, Calculadora.operar(2f, 2f, Calculadora.RAIZ_CUADRADA));
    }

    @Test
    public void RaizCubicaDeNumeros(){
    Assertions.assertEquals(1.2599f, Calculadora.operar(2f, 2f, Calculadora.RAIZ_CUBICA));
    }




}
