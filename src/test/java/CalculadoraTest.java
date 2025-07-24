import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculadoraTest {
    
    private Calculadora calc;
    
    @Before
    public void setUp() {
        calc = new Calculadora(3);
    }
    
    @Test
    public void testConstrutorSemParametro() {
        Calculadora c = new Calculadora();
        assertEquals(0, c.getMemoria());
    }
    
    @Test
    public void testSomarPositivo() {
        calc.somar(5);
        assertEquals(8, calc.getMemoria());
    }
    
    @Test
    public void testSubtrairPositivo() {
        calc.subtrair(2);
        assertEquals(1, calc.getMemoria());
    }
    
    @Test(expected = Exception.class)
    public void testDividirPorZero() throws Exception {
        calc.dividir(0);
    }
    
    // Outros testes...
}