package com.example.campusbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Login extends AppCompatActivity {

    EditText Email;
    EditText Pass;
    Button SignUp;
    RelativeLayout Google;
    Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

         Email = findViewById(R.id.email_ET);
         Pass = findViewById(R.id.pass_ET);
         SignUp = findViewById(R.id.SignUp_btn);
         Google = findViewById(R.id.google_layout);
         LogIn = findViewById(R.id.LogIn_btn);

        SignUp.setOnClickListener(v -> {
            Intent i = new Intent(Login.this, SignUp.class);
            startActivity(i);
        });

        LogIn.setOnClickListener(v -> {
            String mail = Email.getText().toString();
            String pass = Pass.getText().toString();

            if (mail.isEmpty() || pass.isEmpty()) {
                Toast.makeText(Login.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Login.this, "Logged In", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Login.this, Home.class);
                startActivity(i);
            }
        });

        Google.setOnClickListener(v -> {
            Intent i = new Intent(Login.this, Home.class);
            startActivity(i);
        });
    }
}