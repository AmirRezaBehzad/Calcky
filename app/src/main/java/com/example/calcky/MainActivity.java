package com.example.calcky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn0 , btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 , btn_ac , btn_plus_minus;
    Button btn_percnet , btn_divide , btn_multiply , btn_add , btn_submission , btn_equal , btn_decimal;
    EditText edittxt;
    ArrayList<Button> NumButtons = new ArrayList<Button>();

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
    }
}