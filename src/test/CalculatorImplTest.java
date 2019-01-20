package test;

import main.Calculator;
import main.CalculatorImpl;
import org.junit.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;
import static org.junit.Assert.*;

public class CalculatorImplTest {
    @Test
    public final void testMultiply() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testDivide() {

        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b = 5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a et b positif");
        }
        a = 0;
        b = 5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a nul");
        }
        a = -5;
        b = 5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a negatif");
        }
        a = 5;
        b = -5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("b negatif");
        }
        a = -5;
        b = -5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a et b negatif");
        }
    }

    @Test
    public final void testAdd() {

        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b = 5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a et b positif");
        }
        a = 0;
        b = 5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a nul");
        }
        a = 5;
        b = 0;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("b nul");
        }
        a = 0;
        b = 0;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a et b nuls");
        }
        a = -5;
        b = 5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a negatif");
        }
        a = 5;
        b = -5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("b negatif");
        }
        a = -5;
        b = -5;
        res = a + b;
        if (calc.add(a, b) != res) {
            fail("a et b negatif");
        }

    }

    @Test
    public final void testSubstract() {
        fail("Not yet implemented"); // TODO
    }
}
