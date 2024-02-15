package com.example.latihanandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed_username;
    EditText ed_password;
    Button btn_login;
    Button btn_register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_username = findViewById(R.id.ed_username);
        ed_password = findViewById(R.id.ed_password);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed_username.getText().toString().equals("admin")&&ed_password.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, kalkulator.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}