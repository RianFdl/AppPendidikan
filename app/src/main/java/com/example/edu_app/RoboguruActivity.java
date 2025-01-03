package com.example.edu_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RoboguruActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roboguru);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.nav_roboguru);

        bottomNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.nav_brain) {
                startActivity(new Intent(this, BrainAcademyActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.nav_shop) {
                startActivity(new Intent(this, PembelianActivity.class));
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