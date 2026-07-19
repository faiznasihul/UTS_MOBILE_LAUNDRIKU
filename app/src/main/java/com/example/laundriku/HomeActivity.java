package com.example.laundriku;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnLayanan, btnPesanan, btnRiwayat, btnProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLayanan = findViewById(R.id.btnLayanan);
        btnPesanan = findViewById(R.id.btnPesanan);
        btnRiwayat = findViewById(R.id.btnRiwayat);
        btnProfil = findViewById(R.id.btnProfil);

        btnLayanan.setOnClickListener(v ->
                startActivity(new Intent(this, LayananActivity.class)));

        btnPesanan.setOnClickListener(v ->
                startActivity(new Intent(this, PesananActivity.class)));

        btnRiwayat.setOnClickListener(v ->
                startActivity(new Intent(this, RiwayatActivity.class)));

        btnProfil.setOnClickListener(v ->
                startActivity(new Intent(this, ProfileActivity.class)));
    }
}