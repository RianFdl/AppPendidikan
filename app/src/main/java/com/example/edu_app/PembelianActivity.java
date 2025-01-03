package com.example.edu_app;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class PembelianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Ruang Belajar", "Akses ribuan video...", R.drawable.ruangbelajar));
        productList.add(new Product("Brain Academy", "Belajar online dan offline...", R.drawable.brainacademy));
        productList.add(new Product("English Academy", "Belajar Bahasa Inggris...", R.drawable.english));
        productList.add(new Product("Roboguru Plus", "Chat tutor untuk soal...", R.drawable.roboguru));
        productList.add(new Product("AiRIS", "Tutor AI supercerdas...", R.drawable.airis));
        productList.add(new Product("Tryout Spesial", "Asah kemampuanmu...", R.drawable.tryout));
        productList.add(new Product("Privat Ruangguru", "Les privat interaktif...", R.drawable.ruangguru_privat));
        productList.add(new Product("Kursus for Kids", "Belajar seru untuk anak...", R.drawable.kursus_kids));


        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.nav_shop);

        bottomNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.nav_brain) {
                startActivity(new Intent(this, BrainAcademyActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.nav_roboguru) {
                startActivity(new Intent(this, RoboguruActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.nav_more) {
                startActivity(new Intent(this, LainnyaActivity.class));
                finish();
                return true;
            }
            return false;
        });
    }
}
