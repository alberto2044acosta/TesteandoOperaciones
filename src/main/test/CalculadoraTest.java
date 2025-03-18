//Se realizan tests de suma, resta, multiplicacion y division

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSuma() {
        assertEquals(5, Calculadora.sumar(3, 2));
    }

    @Test
    void testResta() {
        assertEquals(1, Calculadora.restar(3, 2));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(6, Calculadora.multiplicar(3, 2));
    }
    
    @Test
    void testDivision() {
        assertEquals(2, Calculadora.dividir(8, 4));
    }

}