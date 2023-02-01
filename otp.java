package com.example.myapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import soup.neumorphism.NeumorphButton;

public class otp extends AppCompatActivity {

    EditText t1;
    NeumorphButton b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        t1 = findViewById(R.id.t1);
        b2 = findViewById(R.id.b1);



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().equals("9901"))
                {
                    Intent intent = new Intent(getApplicationContext(),home.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Enter Valid otp",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}