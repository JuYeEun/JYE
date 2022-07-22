package com.cookandroid.jye;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class HomeActivity extends AppCompatActivity {

    Button bt1, bt2, bt3;
    SearchView searchView;
    Fragment fragment;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity);

        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);
        bt3 = (Button) findViewById(R.id.btn3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(HomeActivity.this,MapActivity.class);
                startActivity(in);


            }
        });

    }

}
