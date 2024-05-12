package com.example.utsmobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {
    TextView tvHasilUser, tvHasilEmail, tvHasilPassword;
    Button btnLogout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String email = getIntent().getExtras().getString("email");
        String password = getIntent().getExtras().getString("password");
        String username = getIntent().getExtras().getString("username");

        tvHasilEmail = findViewById(R.id.tvEmail);
        tvHasilPassword = findViewById(R.id.tvPassword);
        tvHasilUser = findViewById(R.id.tvHasilUser);
        btnLogout = findViewById(R.id.btnlogout);

        tvHasilEmail.setText(email);
        tvHasilPassword.setText(password);
        tvHasilUser.setText(username);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "Berhasil Logout", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Dashboard.this, LoginPage.class));
            }
        });

    }
}