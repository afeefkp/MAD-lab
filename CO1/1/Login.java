package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText uname,pwd;
    Button btn;
    String un,pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.uname);
        pwd=findViewById(R.id.pwd);
        btn=findViewById(R.id.logbtn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                un=uname.getText().toString().trim();
                pw=pwd.getText().toString().trim();

                if (un.equals("")){
                    Toast.makeText(MainActivity.this, "enter username", Toast.LENGTH_SHORT).show();
                }
                else if(pw.equals("")){
                    Toast.makeText(MainActivity.this, "enter password", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
