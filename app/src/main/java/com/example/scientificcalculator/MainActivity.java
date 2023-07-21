package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Vector;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    Button btnAC, btnPer, btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btnMinus, btnPlus, btnDiv, btnInto;
    Button btnEqual, btnDot, btnSin, btnCos, btnTan, btnFact, btnLog, btnLn, btnPow, btnRoot;
    EditText edittext;
    boolean addition, subtract, multiplication, division, percent, sin, cos, tan, fact, pow;
    float mvalueOne, mvalueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edTxt);
        btnLog = findViewById(R.id.buttonLog);
        btnLn = findViewById(R.id.buttonLn);
        btnPow = findViewById(R.id.buttonPow);
        btnRoot = findViewById(R.id.buttonRoot);
        btnSin = findViewById(R.id.buttonSin);
        btnCos = findViewById(R.id.buttonCos);
        btnTan = findViewById(R.id.buttonTan);
        btnFact = findViewById(R.id.buttonFact);
        btnAC = findViewById(R.id.buttonAC);
        btnPer = findViewById(R.id.buttonPer);
        btn9 = findViewById(R.id.button9);
        btn8 = findViewById(R.id.button8);
        btn7 = findViewById(R.id.button7);
        btn6 = findViewById(R.id.button6);
        btn5 = findViewById(R.id.button5);
        btn4 = findViewById(R.id.button4);
        btn3 = findViewById(R.id.button3);
        btn2 = findViewById(R.id.button2);
        btn1 = findViewById(R.id.button1);
        btn0 = findViewById(R.id.button0);
        btnMinus = findViewById(R.id.buttonMinus);
        btnPlus = findViewById(R.id.buttonPlus);
        btnInto = findViewById(R.id.buttonInto);
        btnDiv = findViewById(R.id.buttonDivision);
        btnEqual = findViewById(R.id.buttonEqual);
        btnDot = findViewById(R.id.buttonDot);





        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"2");;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"-");
            }
        });
        btnInto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText()+"/");
            }
        });
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    percent = true;
                    edittext.setText(edittext.getText()+"%");
                }
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    sin = true;
                    edittext.setText("sin(" + edittext.getText() + ")");
                }
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    sin = true;
                    edittext.setText("cos(" + edittext.getText() + ")");
                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    sin = true;
                    edittext.setText("tan(" + edittext.getText() + ")");
                }
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext == null)
                {
                    edittext.setText("");
                }
                else
                {
                    mvalueOne = Float.parseFloat(edittext.getText()+"");
                    pow = true;
                    edittext.setText(edittext.getText()+"pow");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable str = edittext.getText();
                Vector<Double> v= new Vector<Double>();
                Vector<Character> v1= new Vector<Character>();

                StringBuilder s = new StringBuilder("");
                for(int i = 0; i < str.length(); i++)
                {
                    if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/')
                    {
                        v1.add(str.charAt(i));
                        if(s.length() > 0) v.add(Double.parseDouble(String.valueOf(s)));
                        s = new StringBuilder("");
                    }
                    else
                    {
                        s.append(str.charAt(i));
                    }
                }
                v.add(Double.parseDouble(String.valueOf(s)));

                double result = 0.0;
                int j = 0;
                boolean ok = true;
                for(int i = 0; i < v.size(); i++)
                {
                    if(v.size() != v1.size() && ok)
                    {
                        result += v.get(i);
                        ok = false;
                        continue;
                    }

                    if(v1.get(j) == '+')
                    {
                        result += v.get(i);
                    }
                    else if(v1.get(j) == '-')
                    {
                        result -= v.get(i);
                    }
                    else if(v1.get(j) == '*')
                    {
                        result *= v.get(i);
                    }
                    else if(v1.get(j) == '/')
                    {
                        result /= v.get(i);
                    }
                    j++;

                }

                edittext.setText(result + "");
}
