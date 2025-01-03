package com.example.edu_app;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BrainAcademyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_academy);



        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.nav_brain);

        bottomNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                startActivity(new Intent(this, HomeActivity.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.nav_roboguru) {
                startActivity(new Intent(this, RoboguruActivity.class));
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