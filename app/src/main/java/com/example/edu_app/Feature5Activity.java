package com.example.edu_app;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class Feature5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature5);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Integer> images = Arrays.asList(R.drawable.image1, R.drawable.image2, R.drawable.image3);
        List<String> titles = Arrays.asList("Kuis 1", "Kuis 2", "Kuis 3");

        ImageAdapter adapter = new ImageAdapter(this, images, titles);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}