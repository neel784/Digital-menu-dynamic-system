package com.example.myapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.widget.TextView;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {

    TextView name;
    NeumorphCardView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        util.iconBar(MainActivity.this,R.color.light_back);

        logo = findViewById(R.id.logo);
        name = findViewById(R.id.name);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,log_in.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(logo,"logo"),
                        Pair.create(name,"name"));
                startActivity(intent,options.toBundle());
                finish();
            }
        },3000);

    }
}