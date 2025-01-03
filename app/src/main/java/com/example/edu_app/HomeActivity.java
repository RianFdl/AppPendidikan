package com.example.edu_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    private LinearLayout btnFeature1, btnFeature2, btnFeature3, btnFeature4, btnFeature5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottomNav);

        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_brain) {
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
            } else if (item.getItemId() == R.id.nav_more) {
                startActivity(new Intent(this, LainnyaActivity.class));
                finish();
                return true;
            }
            return false;
        });

        btnFeature1 = findViewById(R.id.btnFeature1);
        btnFeature2 = findViewById(R.id.btnFeature2);
        btnFeature3 = findViewById(R.id.btnFeature3);
        btnFeature4 = findViewById(R.id.btnFeature4);
        btnFeature5 = findViewById(R.id.btnFeature5);

        btnFeature1.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, Feature1Activity.class));
        });

        btnFeature2.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, Feature2Activity.class));
        });

        btnFeature3.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, Feature3Activity.class));
        });

        btnFeature4.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, Feature4Activity.class));
        });
        btnFeature5.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, Feature5Activity.class));
        });

        RecyclerView rvTrending = findViewById(R.id.rvTrending);
        rvTrending.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<TrendingItem> trendingItems = new ArrayList<>();
        trendingItems.add(new TrendingItem("COC", 500, R.drawable.coc));
        trendingItems.add(new TrendingItem("AOC", 1220, R.drawable.aoc));
        trendingItems.add(new TrendingItem("English Academy", 800, R.drawable.ea));
        trendingItems.add(new TrendingItem("Collage Abroad", 500, R.drawable.kuliah));
        trendingItems.add(new TrendingItem("Skill Academy", 500, R.drawable.skill_academy));
        trendingItems.add(new TrendingItem("Work Abroad", 500, R.drawable.kerja));

        TrendingAdapter adapter = new TrendingAdapter(this, trendingItems);
        rvTrending.setAdapter(adapter);

    }
}