package com.example.recyclerviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView t1, t2;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.img);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        Intent intent = getIntent();
        String number= intent.getExtras().getString("number");
        String info = intent.getExtras().getString("info");
        int image = intent.getExtras().getInt("flag");

        t1.setText(number);
        t2.setText(info);
        img.setImageResource(image);


    }
}
