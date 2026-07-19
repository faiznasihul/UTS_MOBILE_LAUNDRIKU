package com.example.laundriku;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PesananActivity extends AppCompatActivity {

    Button btnSimpan, btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        btnSimpan = findViewById(R.id.btnSimpan);
        btnKembali = findViewById(R.id.btnKembali);

        btnSimpan.setOnClickListener(v ->
                Toast.makeText(this, "Pesanan Berhasil Disimpan", Toast.LENGTH_SHORT).show());

        btnKembali.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        });
    }
}