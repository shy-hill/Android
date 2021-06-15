package com.example.logindemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText loginText, passwordText;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginText = (EditText) findViewById(R.id.login);
        passwordText = (EditText) findViewById(R.id.password);

        btnLogin = (Button) findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(v -> {

            String username = loginText.getText().toString();
            String password = passwordText.getText().toString();

            if (username.equals("sahil") && (password.equals("135790")))
            {
                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext() ,NewActivity.class);
                startActivity(intent);

            } else
            {
                Toast.makeText(MainActivity.this, "Invalid Credential", Toast.LENGTH_SHORT).show();
            }

        });
    }
}