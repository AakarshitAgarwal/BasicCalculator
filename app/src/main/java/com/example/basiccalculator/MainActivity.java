package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText text1, text2;
    Button add, sub, mul, div;
    TextView result1, result2, result3, result4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.et1);
        text2 = (EditText) findViewById(R.id.et2);
        add = (Button) findViewById(R.id.bt1);
        sub = (Button) findViewById(R.id.bt2);
        mul = (Button) findViewById(R.id.bt3);
        div = (Button) findViewById(R.id.bt4);
        result1 = (TextView) findViewById(R.id.tv1);
        result2 = (TextView) findViewById(R.id.tv1);
        result3 = (TextView) findViewById(R.id.tv1);
        result4 = (TextView) findViewById(R.id.tv1);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int number1 = Integer.parseInt(text1.getText().toString());
        int number2 = Integer.parseInt(text2.getText().toString());
        if (view.getId() == R.id.bt1) {
            int addition = number1 + number2;
            result1.setText("Answer :" + String.valueOf(addition));
        } else if (view.getId() == R.id.bt2) {
            int subtraction = number1 - number2;
            result2.setText("Answer :" + String.valueOf(subtraction));
        } else if (view.getId() == R.id.bt3) {
            int multiplication = number1 * number2;
            result3.setText("Answer :" + String.valueOf(multiplication));
        } else {
            int division = number1 / number2;
            result4.setText("Answer :" + String.valueOf(division));

        }

    }
}
