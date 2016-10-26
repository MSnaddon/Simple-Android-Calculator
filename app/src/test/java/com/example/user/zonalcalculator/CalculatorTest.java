package com.example.user.zonalcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 26/10/2016.
 */
public class CalculatorTest {

    Calculator calculator;
    double n1;
    double n2;

    @Before
    public void Before(){
        n1 = 3.6;
        n2 = 0.6;
        calculator = new Calculator();
    }

    @Test
    public void calculatorCanAdd(){
        assertEquals((n1+n2), calculator.calculate(n1,n2, Operators.ADD),0.01);
    }

    @Test
    public void calculatorCanSubtract(){
        assertEquals((n1-n2), calculator.calculate(n1,n2, Operators.SUBTRACT), 0.01);
    }

    @Test
    public void calculatorCanMultiply(){
        assertEquals((n1*n2),calculator.calculate(n1,n2, Operators.MULTIPLY), 0.01);
    }

    @Test
    public void calculatorCanDivide(){
        assertEquals((n1/n2),calculator.calculate(n1,n2, Operators.DIVIDE), 0.01);
    }


}
