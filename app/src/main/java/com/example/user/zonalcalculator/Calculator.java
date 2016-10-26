package com.example.user.zonalcalculator;

/**
 * Created by user on 26/10/2016.
 */
public class Calculator {

    public double calculate(double n1, double n2, Operators operator){
        return operator.execute(n1, n2);
    }
}