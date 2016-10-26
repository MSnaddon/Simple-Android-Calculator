package com.example.user.zonalcalculator;

/**
 * Created by user on 26/10/2016.
 */
public enum Operators {
    ADD{public double execute(double n1, double n2){return n1+n2 ;}},
    SUBTRACT{public double execute(double n1, double n2){return n1-n2 ;}},
    MULTIPLY {public double execute(double n1, double n2) {return n1*n2;}},
    DIVIDE{public double execute(double n1, double n2){return n1/n2 ;}},
    ;

    public abstract double execute(double n1, double n2);

}