package com.example.user.zonalcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 26/10/2016.
 */
public class OperatorsTest {

    @Test
    public void basicOperatorsActAccordingly(){
        assertEquals( 6.5, Operators.ADD.execute(4,2.5), 0.01);
        assertEquals( 1.5, Operators.SUBTRACT.execute(4,2.5), 0.01);
        assertEquals( 10,Operators.MULTIPLY.execute(4,2.5), 0.01);
        assertEquals( 2.5,Operators.DIVIDE.execute(5,2), 0.01);

    }

}
