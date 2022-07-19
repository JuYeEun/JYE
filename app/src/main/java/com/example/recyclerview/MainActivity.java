package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements recyclerAdapter.OnClickShowListener{
    
    List<Item> BusList;
    RecyclerView RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initBusList();

        RecyclerView = findViewById(R.id.card_list);
        recyclerAdapter recyclerAdapter = new recyclerAdapter(this, (ArrayList<Item>) BusList, this);

        RecyclerView.setAdapter(recyclerAdapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initBusList() {
        BusList = new ArrayList<>();
        BusList.add(new Item("2222"));
        BusList.add(new Item("2222"));
        BusList.add(new Item("2222"));
        BusList.add(new Item("2222"));
        BusList.add(new Item("2222"));
        BusList.add(new Item("2222"));
        
    }

    @Override
    public void onClickShowListener(int position) {
        String text = BusList.get(position).getText();

        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("~OuO~", text);
        startActivity(intent);

    }
}