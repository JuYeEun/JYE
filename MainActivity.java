package com.example.recyclerviewtest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<ModelClass>arrayList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));
        arrayList.add(new ModelClass(R.drawable.energe,"393","8분후 도착합니다"));

        ModelRecyclerView modelRecyclerView = new ModelRecyclerView(this, arrayList);
        recyclerView.setAdapter(modelRecyclerView);


    }
}
