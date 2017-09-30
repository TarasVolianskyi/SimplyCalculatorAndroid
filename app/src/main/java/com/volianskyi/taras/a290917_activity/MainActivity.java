package com.volianskyi.taras.a290917_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etTextFirst;
    EditText etTextSecond;
    TextView tvOut;

    private View.OnClickListener btnPlus = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(etTextFirst.getText().toString());
            int b = Integer.parseInt(etTextSecond.getText().toString());
            int c = a + b;
            tvOut.setText("Your result is:\n" + a + " + " + b + " = " + c + ".");
        }
    };

    private View.OnClickListener btnMinus = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(etTextFirst.getText().toString());
            int b = Integer.parseInt(etTextSecond.getText().toString());
            int c = a - b;
            tvOut.setText("Your result is:\n" + a + " - " + b + " = " + c + ".");
        }
    };

    private View.OnClickListener btnMultiply = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(etTextFirst.getText().toString());
            int b = Integer.parseInt(etTextSecond.getText().toString());
            int c = a * b;
            tvOut.setText("Your result is:\n" + a + " * " + b + " = " + c + ".");
        }
    };

    private View.OnClickListener btnDivide = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(etTextFirst.getText().toString());
            int b = Integer.parseInt(etTextSecond.getText().toString());
            double c = a / b;
            tvOut.setText("Your result is:\n" + a + " / " + b + " = " + c + ".");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myBtnPlus = (Button) findViewById(R.id.btnPlus);
        Button myBtnMinus = (Button) findViewById(R.id.btnMinus);
        Button myBtnMultiply = (Button) findViewById(R.id.btnMultiply);
        Button myBtnDivide = (Button) findViewById(R.id.btnDivide);
        etTextFirst = (EditText) findViewById(R.id.etFirstNumber);
        etTextSecond = (EditText) findViewById(R.id.etSecondNumber);
        tvOut = (TextView) findViewById(R.id.tvOut);
        myBtnPlus.setOnClickListener(btnPlus);
        myBtnMinus.setOnClickListener(btnMinus);
        myBtnMultiply.setOnClickListener(btnMultiply);
        myBtnDivide.setOnClickListener(btnDivide);
    }
}
