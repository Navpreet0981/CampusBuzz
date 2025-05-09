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

public class SignUp extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText pass;
    Button signup;
    Button login;
    RelativeLayout FbLayout ;
    RelativeLayout GoogleLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

         name = findViewById(R.id.name_ET);
         email = findViewById(R.id.email_ET);
         pass = findViewById(R.id.pass_ET);
         signup = findViewById(R.id.LogIn_btn);
         login = findViewById(R.id.SignUp_btn);
         FbLayout = findViewById(R.id.FB_Layout);
         GoogleLayout = findViewById(R.id.google_layout);

        login.setOnClickListener(v -> {
            Intent i = new Intent(SignUp.this, Login.class);
            startActivity(i);

        });

        signup.setOnClickListener(v -> {

            String Email = email.getText().toString();
            String Pass = pass.getText().toString();
            String Name = name.getText().toString();

            if (Email.isEmpty() || Pass.isEmpty() || Name.isEmpty()) {
                Toast.makeText(SignUp.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SignUp.this, "Account Created", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(SignUp.this, Home.class);
                startActivity(i);
            }
        });
        GoogleLayout.setOnClickListener(v -> {
            Intent i = new Intent(SignUp.this, Home.class);
            startActivity(i);
        });
    }
}