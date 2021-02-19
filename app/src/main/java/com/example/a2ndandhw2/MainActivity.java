package com.example.a2ndandhw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int firstNumber, secondNumber;
    private Button one, two, three, four, five, six, plus, minus, division, multiply, seven, eight, nine, delete, zero,
            equal;
    private TextView textView;
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
                firstNumber = Integer.parseInt(textView.getText().toString());
                addition = true;
                textView.setText(null);
            }
        });
        minus.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                firstNumber = Integer.parseInt(textView.getText().toString());
                subtraction = true;
                textView.setText(null);
            }
        });
        multiply.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                firstNumber = Integer.parseInt(textView.getText().toString());
                multiplication = true;
                textView.setText(null);
            }
        });
        division.setOnClickListener(v -> {
            if (textView == null) {
                textView.setText("");
            } else {
                firstNumber = Integer.parseInt(textView.getText().toString());
                bdivision = true;
                textView.setText(null);
            }
        });
        equal.setOnClickListener(v -> {
            secondNumber = Integer.parseInt(textView.getText().toString());
            if(addition == true){
                textView.setText(firstNumber + secondNumber + "");
                addition = false;
            }
            if(multiplication == true){
                textView.setText(firstNumber * secondNumber + "");
                multiplication = false;
            }if(subtraction == true){
                textView.setText(firstNumber - secondNumber + "");
                subtraction = false;
            }if(bdivision == true){
                textView.setText(firstNumber / secondNumber + "");
                bdivision = false;
            }
        });
        delete.setOnClickListener(v -> {
            textView.setText("");
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
        textView = findViewById(R.id.textView);
    }

}