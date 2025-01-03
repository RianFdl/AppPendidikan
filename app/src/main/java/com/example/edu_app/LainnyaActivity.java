package com.example.edu_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LainnyaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lainnya);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        bottomNav.setSelectedItemId(R.id.nav_more);

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
            } else if (item.getItemId() == R.id.nav_shop) {
                startActivity(new Intent(this, PembelianActivity.class));
                finish();
                return true;
            }
            return false;
        });

        TextView menuProfile = findViewById(R.id.menuProfile);
        TextView menuSettings = findViewById(R.id.menuSettings);
        TextView menuHelp = findViewById(R.id.menuHelp);
        TextView menuLogout = findViewById(R.id.menuLogout);

        menuProfile.setOnClickListener(v -> startActivity(new Intent(this, ProfileActivity.class)));
        menuSettings.setOnClickListener(v -> startActivity(new Intent(this, SettingActivity.class)));
        menuHelp.setOnClickListener(v -> startActivity(new Intent(this, HelpActivity.class)));
        menuLogout.setOnClickListener(v -> {

            new AlertDialog.Builder(this)
                    .setTitle("Konfirmasi Logout")
                    .setMessage("Apakah Anda yakin ingin logout?")
                    .setPositiveButton("OK", (dialog, which) -> {

                        startActivity(new Intent(this, LoginActivity.class));
                        finish();
                    })
                    .setNegativeButton("NO", (dialog, which) -> {

                        dialog.dismiss();
                    })
                    .show();
        });

    }
}
