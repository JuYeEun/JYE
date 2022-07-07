package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList buslist;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buslist = new ArrayList<>();


        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
    }
    private void setAdapter(){
        recyclerAdapter adapter = new recyclerAdapter(buslist);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setItemAnimator((new DefaultItemAnimator()));
        recyclerView.setAdapter(adapter);
    }
    private  void setUserInfo(){
        buslist.add(new Item("2222"));
        buslist.add(new Item("2222"));
        buslist.add(new Item("2222"));
        buslist.add(new Item("2222"));
        buslist.add(new Item("2222"));
        buslist.add(new Item("2222"));
    }
}