package com.cookandroid.jye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.database.core.view.View;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {



      ViewPager2 viewPager2;
    TabLayout tabLayout;

    private  ViewpagerAdapter viewpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager);




        ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(this);
        viewPager2.setAdapter(viewpagerAdapter);


        final List<String> tabName = Arrays.asList("버스", "정류장");

//ViewPager2는 TabLayoutMediator 메서드를 사용, 해당 코드는 tabLayout 과 Viewpager 연결한다
                new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                TextView textView = new TextView(MainActivity.this);
                textView.setText(tabName.get(position));
                tab.setCustomView(textView);

            }


        }).attach();




    }
}