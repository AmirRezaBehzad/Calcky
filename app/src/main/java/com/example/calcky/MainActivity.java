package com.example.calcky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn0 , btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 , btn_ac , btn_plus_minus;
    Button btn_percnet , btn_divide , btn_multiply , btn_add , btn_submission , btn_equal , btn_decimal;
    EditText edittxt;
    double num_one = 0.999999999999;
    double num_two = 0.999999999999;
    String operator = "";
    double result = 0.999999999999;
    ArrayList<Button> NumButtons = new ArrayList<Button>();
    ArrayList<Button> OperatorButtons = new ArrayList<Button>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn0 = findViewById(R.id.zero_button);
        btn1 = findViewById(R.id.one_button);
        btn2 = findViewById(R.id.two_button);
        btn3 = findViewById(R.id.three_button);
        btn4 = findViewById(R.id.four_button);
        btn5 = findViewById(R.id.five_button);
        btn6 = findViewById(R.id.six_button);
        btn7 = findViewById(R.id.seven_button);
        btn8 = findViewById(R.id.eight_button);
        btn9 = findViewById(R.id.nine_button);
        NumButtons.add(btn0);
        NumButtons.add(btn1);
        NumButtons.add(btn2);
        NumButtons.add(btn3);
        NumButtons.add(btn4);
        NumButtons.add(btn5);
        NumButtons.add(btn6);
        NumButtons.add(btn7);
        NumButtons.add(btn8);
        NumButtons.add(btn9);
        btn_ac = findViewById(R.id.ac_button);
        btn_plus_minus = findViewById(R.id.plus_minus_button);
        btn_percnet = findViewById(R.id.percent_button);
        btn_divide = findViewById(R.id.divide_button);
        btn_multiply = findViewById(R.id.mulitply_button);
        btn_add = findViewById(R.id.add_button);
        btn_submission = findViewById(R.id.submission_button);
        OperatorButtons.add(btn_add);
        OperatorButtons.add(btn_submission);
        OperatorButtons.add(btn_multiply);
        OperatorButtons.add(btn_divide);
        btn_equal = findViewById(R.id.equal_button);
        btn_decimal = findViewById(R.id.decimal_button);

        edittxt = findViewById(R.id.edit_text);

        for(int i = 0 ; i <= 9 ; i++)
        {
            int temp = i;
            NumButtons.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    edittxt.setText(edittxt.getText() + String.valueOf(temp));
                }
            });
        }

        for(int i = 0 ; i <= 3 ; i++)
        {
            if (OperatorButtons.get(i).equals(btn_add))
            {
                OperatorButtons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        if (edittxt.getText().toString().equals(""))
                        {

                        }
                        else if (operator.equals("") == false)
                        {
                            if (operator.equals("+"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one += num_two;
                            }
                            else if (operator.equals("-"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one -= num_two;
                            }
                            else if (operator.equals("*"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one *= num_two;
                            }
                            else if (operator.equals("/"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one /= num_two;
                            }
                            operator = "+";
                            edittxt.setText("");
                        }
                        else
                        {
                            num_one = Double.parseDouble(edittxt.getText().toString());
                            operator = "+";
                            edittxt.setText("");
                        }
                    }
                });
            }
            else if (OperatorButtons.get(i).equals(btn_submission))
            {
                OperatorButtons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edittxt.getText().toString().equals(""))
                        {

                        }
                        else if (operator.equals("") == false)
                        {
                            if (operator.equals("+"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one += num_two;
                            }
                            else if (operator.equals("-"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one -= num_two;
                            }
                            else if (operator.equals("*"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one *= num_two;
                            }
                            else if (operator.equals("/"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one /= num_two;
                            }
                            operator = "-";
                            edittxt.setText("");
                        }
                        else
                        {
                            num_one = Double.parseDouble(edittxt.getText().toString());
                            operator = "-";
                            edittxt.setText("");
                        }
                    }
                });
            }
            else if (OperatorButtons.get(i).equals(btn_multiply))
            {
                OperatorButtons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edittxt.getText().toString().equals(""))
                        {

                        }
                        else if (operator.equals("") == false)
                        {
                            if (operator.equals("+"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one += num_two;
                            }
                            else if (operator.equals("-"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one -= num_two;
                            }
                            else if (operator.equals("*"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one *= num_two;
                            }
                            else if (operator.equals("/"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one /= num_two;
                            }
                            operator = "*";
                            edittxt.setText("");
                        }
                        else
                        {
                            num_one = Double.parseDouble(edittxt.getText().toString());
                            operator = "*";
                            edittxt.setText("");
                        }
                    }
                });
            }
            else if (OperatorButtons.get(i).equals(btn_divide))
            {
                OperatorButtons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edittxt.getText().toString().equals(""))
                        {

                        }
                        else if (operator.equals("") == false)
                        {
                            if (operator.equals("+"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one += num_two;
                            }
                            else if (operator.equals("-"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one -= num_two;
                            }
                            else if (operator.equals("*"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one *= num_two;
                            }
                            else if (operator.equals("/"))
                            {
                                num_two = Double.parseDouble(edittxt.getText().toString());
                                num_one /= num_two;
                            }
                            operator = "/";
                            edittxt.setText("");
                        }
                        else
                        {
                            num_one = Double.parseDouble(edittxt.getText().toString());
                            operator = "/";
                            edittxt.setText("");
                        }
                    }
                });
            }
        }

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edittxt.getText().toString().equals("") && result == 0.999999999999)
                {

                }
                else if (edittxt.getText().toString().equals("") && result != 0.999999999999)
                {
                    edittxt.setText(String.valueOf(result));
                }
                else if (operator.equals(""))
                {

                }

                else
                {
                    if (operator.equals("+"))
                    {
                        num_two = Double.parseDouble(edittxt.getText().toString());
                        result = num_one + num_two;
                        edittxt.setText(String.valueOf(result));
                        num_one = result;
                        operator = "";
                    }

                    else if (operator.equals('-'))
                    {
                        num_two = Double.parseDouble(edittxt.getText().toString());
                        result = num_one - num_two;
                        edittxt.setText(String.valueOf(result));
                        num_one = result;
                        operator = "";
                    }

                    else if (operator.equals("*"))
                    {
                        num_two = Double.parseDouble(edittxt.getText().toString());
                        result = num_one * num_two;
                        edittxt.setText(String.valueOf(result));
                        num_one = result;
                        operator = "";
                    }

                    else if (operator.equals("/"))
                    {
                        num_two = Double.parseDouble(edittxt.getText().toString());
                        result = num_one / num_two;
                        edittxt.setText(String.valueOf(result));
                        num_one = result;
                        operator = "";
                    }
                }
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittxt.setText(edittxt.getText() + ".");
            }
        });

        btn_plus_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (edittxt.getText().toString().equals(""))
                {

                }
                else if (edittxt.getText().toString().equals("0") || edittxt.getText().toString().equals("0.0"))
                {

                }
                else
                {
                    double temp = Double.parseDouble(edittxt.getText().toString());
                    temp *= -1;
                    edittxt.setText(String.valueOf(temp));
                }
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittxt.getText().toString().equals("") && result != 0.999999999999)
                    result = 0.999999999999;

                else
                    edittxt.setText("");
            }
        });

    }
}