package com.cookandroid.jye;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class DialogActivity extends AppCompatActivity {

    TextView text;
    Button button;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_contact);

        text = findViewById(R.id.dialog_Number_tv);
        button = findViewById(R.id.dialog_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DialogActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

    }
}
