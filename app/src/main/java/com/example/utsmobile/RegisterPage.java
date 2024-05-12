package com.example.utsmobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterPage extends AppCompatActivity {
    EditText inputEmailRegister, inputUsernameRegister, inputPasswordRegister;
    Button btnMasuk, btnToLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_page);
        inputEmailRegister = findViewById(R.id.inputEmailRegister);
        inputUsernameRegister = findViewById(R.id.inputUsername);
        inputPasswordRegister = findViewById(R.id.inputPasswordRegister);
        btnToLogin = findViewById(R.id.btnToLogin);
        btnMasuk = findViewById(R.id.btnMasuk);

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterPage.this, LoginPage.class));
            }
        });
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterPage.this, "Selamat Anda Berhasil Register", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(RegisterPage.this, Dashboard.class);
                pindah.putExtra("email", inputEmailRegister.getText().toString());
                pindah.putExtra("password", inputPasswordRegister.getText().toString());
                pindah.putExtra("username", inputUsernameRegister.getText().toString());
                startActivity(pindah);
            }
        });
    }
}