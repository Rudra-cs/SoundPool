package com.rudra.soundpool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView drumONe;
    CardView guns;

    Toolbar my_toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(my_toolbar);

        drumONe = findViewById(R.id.cv_one);
        drumONe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,screenOne.class);
                startActivity(in);
            }
        });

        guns = findViewById(R.id.cv_guns);
        guns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,DjGuns.class);
                startActivity(in);
            }
        });

    }
}
