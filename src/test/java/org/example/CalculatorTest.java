package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator =null;
    @Before
    public void setUp() throws Exception {
        calculator =new Calculator();
    }
    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void add() {
        int addResult1 = calculator.add(15,15);
        int addResult2 = calculator.add(21,55);
        assertEquals(30,addResult1);
        assertEquals(76,addResult2);
    }

    @Test
    public void subtract() {
        int subResult1 = calculator.subtract(34,10);
        int subResult2 = calculator.subtract(55,8);
        assertEquals(24,subResult1);
        assertEquals(47,subResult2);
    }

    @Test
    public void multiply() {
        double mulResult1 = calculator.multiply(7,6);
        double mulResult2 = calculator.multiply(10.5,6);
        double mulResult3 = calculator.multiply(5.2,5);
        assertEquals(42,mulResult1,0);
        assertEquals(63.0,mulResult2,0);
        assertEquals(26.0,mulResult3,0);
    }

    @Test
    public void modulo() {
        int modResult1 = calculator.modulo(10,3);
        assertEquals(1,modResult1);
    }

    @Test
    public void divide() {
        int divResult1 = calculator.divide(45,5);
        int divResult2 = calculator.divide(25,5);
        assertEquals(9,divResult1);
        assertEquals(5,divResult2);
    }
}
