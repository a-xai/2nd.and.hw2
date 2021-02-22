package com.example.a2ndandhw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double firstNumber, secondNumber;
    private Button one, two, three, four, five, six, plus, minus, division, multiply, seven, eight, nine, delete, zero,
            equal,common;
    private TextView textView, textView2,textView3;
    private boolean addition, subtraction, multiplication, bdivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        one.setOnClickListener(v -> {
            textView.setText(textView.getText() + "1");
        });
        two.setOnClickListener(v -> {
            textView.setText(textView.getText() + "2");
        });
        three.setOnClickListener(v -> {
            textView.setText(textView.getText() + "3");
        });
        four.setOnClickListener(v -> {
            textView.setText(textView.getText() + "4");
        });
        five.setOnClickListener(v -> {
            textView.setText(textView.getText() + "5");
        });
        six.setOnClickListener(v -> {
            textView.setText(textView.getText() + "6");
        });
        seven.setOnClickListener(v -> {
            textView.setText(textView.getText() + "7");
        });
        eight.setOnClickListener(v -> {
            textView.setText(textView.getText() + "8");
        });
        nine.setOnClickListener(v -> {
            textView.setText(textView.getText() + "9");
        });
        zero.setOnClickListener(v -> {
            textView.setText(textView.getText() + "0");
        });
        plus.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                firstNumber = Double.parseDouble(textView.getText().toString());
                textView2.setText(textView.getText()) ;
                addition = true;
                textView.setText(null);
            }
        });
        minus.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                firstNumber = Double.parseDouble(textView.getText().toString());
                textView2.setText(textView.getText());

                subtraction = true;
                textView.setText(null);
            }
        });
        multiply.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                firstNumber = Double.parseDouble(textView.getText().toString());
                textView2.setText(textView.getText());

                multiplication = true;
                textView.setText(null);
            }
        });
        division.setOnClickListener(v -> {
            if (textView == null) {
              //  textView2.setText(textView2.getText().toString());
                textView.setText("");
            } else {
                textView3.setText("/");
                firstNumber = Double.parseDouble(textView.getText().toString());
                textView2.setText(textView.getText());
                bdivision = true;
                textView.setText(null);
            }
        });
        equal.setOnClickListener(v -> {
            secondNumber = Double.parseDouble(textView.getText().toString());
            if(addition == true){
                textView2.setText("");
                textView.setText(firstNumber + secondNumber + "");
                addition = false;
            }
            if(multiplication == true){
                textView2.setText("");
                textView.setText(firstNumber * secondNumber + "");
                multiplication = false;
            }if(subtraction == true){
                textView2.setText("");
                textView.setText(firstNumber - secondNumber + "");
                subtraction = false;
            }if(bdivision == true){
                textView3.setText("=");
                textView2.setText("");
                textView.setText(firstNumber / secondNumber + "");
                bdivision = false;
            }
        });
        common.setOnClickListener(v -> {
            textView.setText(textView.getText() + ".");
        });
        delete.setOnClickListener(v -> {
            textView.setText("");
            textView3.setText("");
        });

    }

    public void init() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        multiply = findViewById(R.id.multiply1);
        division = findViewById(R.id.division);
        delete = findViewById(R.id.delete);
        equal = findViewById(R.id.equal);
        common = findViewById(R.id.common);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.text3);
    }

}