package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private Button b1,b2,b3,b4,b5;
    private TextView result;

    int no1,no2,no3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.n1);
        e2=(EditText) findViewById(R.id.n2);
        b1=(Button) findViewById(R.id.add);
        b2=(Button) findViewById(R.id.sub);
        b3=(Button) findViewById(R.id.mul);
        b4=(Button) findViewById(R.id.div);
        b5=(Button) findViewById(R.id.clr);
        result=(TextView) findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(e1.getText().toString());
                no2 = Integer.parseInt(e2.getText().toString());
                no3=no1+no2;
                result.setText(Integer.toString(no3));
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(e1.getText().toString());
                no2=Integer.parseInt(e2.getText().toString());
                no3=no1-no2;
                result.setText(Integer.toString(no3));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(e1.getText().toString());
                no2=Integer.parseInt(e2.getText().toString());
                no3=no1*no2;
                result.setText(Integer.toString(no3));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1=Integer.parseInt(e1.getText().toString());
                no2=Integer.parseInt(e2.getText().toString());
                no3=no1/no2;
                result.setText(Integer.toString(no3));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                e1.setText("");
                e2.setText("");
            }
        });

    }
}
