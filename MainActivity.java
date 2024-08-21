package com.example.recyclerviewexample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // لعرض الأرقام بشكل عمودي
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // لعرض الأرقام بشكل أفقي، استخدم الكود ده بدل الكود اللي فوق
        // recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // ضبط الـ Adapter
        recyclerView.setAdapter(new NumberAdapter());
    }
}
