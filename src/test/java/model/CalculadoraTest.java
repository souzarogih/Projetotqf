package model;

import com.moresales.lambda.model.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void testSoma() {
        assertEquals(5.0f, calc.soma(2.0f, 3.0f), 0.001);
    }

    @Test
    public void testSomaComNegativos() {
        assertEquals(-1.0f, calc.soma(2.0f, -3.0f), 0.001);
    }

    @Test
    public void testSomaComZero() {
        assertEquals(2.0f, calc.soma(2.0f, 0.0f), 0.001);
    }

    // Testes de Subtração
    @Test
    public void testSubtrair() {
        assertEquals(1.0f, calc.subtrair(5.0f, 4.0f), 0.001);
    }

    @Test
    public void testSubtrairNegativos() {
        assertEquals(-9.0f, calc.subtrair(-5.0f, 4.0f), 0.001);
    }

    @Test
    public void testSubtrairComZero() {
        assertEquals(5.0f, calc.subtrair(5.0f, 0.0f), 0.001);
    }

    // Testes de Multiplicação
    @Test
    public void testMultiplicar() {
        assertEquals(12.0f, calc.multiplicar(3.0f, 4.0f), 0.001);
    }

    @Test
    public void testMultiplicarComZero() {
        assertEquals(0.0f, calc.multiplicar(3.0f, 0.0f), 0.001);
    }

    @Test
    public void testMultiplicarNegativos() {
        assertEquals(-6.0f, calc.multiplicar(2.0f, -3.0f), 0.001);
    }

    // Testes de Divisão
    @Test
    public void testDividir() {
        assertEquals(2.5f, calc.dividir(5.0f, 2.0f), 0.001);
    }

    @Test
    public void testDividirNegativos() {
        assertEquals(-2.0f, calc.dividir(4.0f, -2.0f), 0.001);
    }

    @Test
    public void testDividirPorUm() {
        assertEquals(7.5f, calc.dividir(7.5f, 1.0f), 0.001);
    }

    @Test
    public void testDivisaoZeroPorValor() {
        assertEquals(0.0f, calc.dividir(0.0f, 5.0f), 0.001);
    }
}
