import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Teste de Soma: Positivos, Negativos e Zeros")
    public void testSomar() {
        Assertions.assertEquals(5, calc.somar(2, 3));      // Positivos
        Assertions.assertEquals(-1, calc.somar(2, -3));    // Com negativo
        Assertions.assertEquals(0, calc.somar(0, 0));      // Zeros
    }

    @Test
    @DisplayName("Teste de Subtração")
    public void testSubtrair() {
        Assertions.assertEquals(1, calc.subtrair(3, 2));
        Assertions.assertEquals(-5, calc.subtrair(-2, 3));
        Assertions.assertEquals(0, calc.subtrair(2, 2));
    }

    @Test
    @DisplayName("Teste de Multiplicação")
    public void testMultiplicar() {
        Assertions.assertEquals(6, calc.multiplicar(2, 3));
        Assertions.assertEquals(-6, calc.multiplicar(2, -3));
        Assertions.assertEquals(0, calc.multiplicar(10, 0));
    }

    @Test
    @DisplayName("Teste de Divisão e Exceção")
    public void testDividir() {
        // Cenário de Sucesso
        Assertions.assertEquals(2.5, calc.dividir(5, 2)); 
        Assertions.assertEquals(-2.0, calc.dividir(4, -2));
        
        // Cenário de Falha (Exceção Esperada)
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
    }
}