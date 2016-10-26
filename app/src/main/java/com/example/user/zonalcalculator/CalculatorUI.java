package com.example.user.zonalcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculatorUI extends AppCompatActivity {

    Calculator calculator;

    TextView mCalcOut;

    EditText mNumber1;
    EditText mNumber2;

    Button mAdd;
    Button mSubtract;
    Button mMultiply;
    Button mDivide;

    Button mEquals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_ui);

        calculator = new Calculator();
        mCalcOut = (TextView) findViewById(R.id.calculator_output);

        mNumber1 = (EditText) findViewById(R.id.number1);
        mNumber2 = (EditText) findViewById(R.id.number2);

        mAdd = (Button) findViewById(R.id.add);
        mSubtract = (Button) findViewById(R.id.subtract);
        mMultiply = (Button) findViewById(R.id.multiply);
        mDivide = (Button) findViewById(R.id.divide);

        mEquals = (Button) findViewById(R.id.equals);



        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryCalculate(Operators.ADD);
            }
        });
        mSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryCalculate(Operators.SUBTRACT);
            }
        });
        mMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryCalculate(Operators.MULTIPLY);
            }
        });
        mDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryCalculate(Operators.DIVIDE);
            }
        });

    }

    public void tryCalculate(Operators operand){
        try {
            double n1 = Double.parseDouble(mNumber1.getText().toString());
            double n2 = Double.parseDouble(mNumber2.getText().toString());
            mCalcOut.setText(
                    new DecimalFormat("#.##########")
                            .format(calculator.calculate(n1, n2, operand)));
        } catch (NumberFormatException err) {
            mCalcOut.setText(err.getMessage());
        }
    }

}



































