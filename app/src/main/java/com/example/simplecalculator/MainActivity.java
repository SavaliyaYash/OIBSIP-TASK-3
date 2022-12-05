package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndot, btnplus, btnminus, btndivide, btnmul, btnEq, btnCE;

    int operation;
    double ans;
    String res = "";

    TextView result;

    TextView txtex1, txtex2, txtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtex1 = findViewById(R.id.txtex1);
        txtex2 = findViewById(R.id.txtex2);
        txtop = findViewById(R.id.txtop);

        result = findViewById(R.id.result);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btndot = findViewById(R.id.btndot);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btndivide = findViewById(R.id.btndivide);
        btnmul = findViewById(R.id.btnmul);
        btnEq = findViewById(R.id.btnEq);
        btnCE = findViewById(R.id.btnCE);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "0";
                result.setText(res);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "1";
                result.setText(res);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "2";
                result.setText(res);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "3";
                result.setText(res);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "4";
                result.setText(res);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "5";
                result.setText(res);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "6";
                result.setText(res);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "7";
                result.setText(res);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "8";
                result.setText(res);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + "9";
                result.setText(res);
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = res + ".";
                result.setText(res);
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = Double.parseDouble(result.getText().toString());
                txtex1.setText(ans+"");
                res = "";
                operation = 1;
                txtop.setText("+");
                result.setText("");
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = Double.parseDouble(result.getText().toString());
                txtex1.setText(ans+"");
                res = "";
                operation = 2;
                txtop.setText("-");
                result.setText("");
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = Double.parseDouble(result.getText().toString());
                txtex1.setText(ans+"");
                res = "";
                operation = 3;
                txtop.setText("*");
                result.setText("");
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = Double.parseDouble(result.getText().toString());
                txtex1.setText(ans+"");
                res = "";
                operation = 4;
                txtop.setText("/");
                result.setText("");
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = " ";
                result.setText(res);
                txtop.setText("");
                txtex1.setText("");
                txtex2.setText("");
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double finalres;

                double ans2 = Double.parseDouble(result.getText().toString());
                txtex2.setText(ans2+"");

                if(operation == 1){
                    finalres = ans + ans2;
                    res = "";
                    result.setText(finalres + "");
                } else if(operation == 2){
                    finalres = ans - ans2;
                    res = "";
                    result.setText(finalres + "");
                } else if(operation == 3){
                    finalres = ans * ans2;
                    res = "";
                    result.setText(finalres + "");
                } else if(operation == 4){
                    finalres = ans / ans2;
                    res = "";
                    result.setText(finalres + "");
                }

            }
        });
    }
}